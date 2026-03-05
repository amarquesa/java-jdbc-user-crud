public void insert(User user) {

    String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, user.getName());
        stmt.setString(2, user.getEmail());

        stmt.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
}