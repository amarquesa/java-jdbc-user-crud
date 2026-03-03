package dao;

import db.ConnectionFactory;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

    public void create(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getEmail());

            int rows = stmt.executeUpdate();
            System.out.println("✅ Usuário inserido! Linhas afetadas: " + rows);

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir usuário", e);
        }
    }
}