<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Search Coffee Starting with 'D'</h2>

<%
Connection con = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop", "root", "");

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee WHERE coffee_name LIKE 'D%'");

    out.println("<h3>Matching Coffee Records</h3>");
    boolean found = false;
    while (rs.next()) {
        found = true;
        out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getDouble("price") + "<br>");
    }
    if (!found) {
        out.println("<p>No coffee products starting with 'D' found.</p>");
    }

} catch(Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (con != null) con.close();
}
%>
</body>
</html>
