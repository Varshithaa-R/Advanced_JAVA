<%@ page import="java.sql.*" %>
<jsp:include page="dbconfig.jsp" />
<html>
<body>
    <h3>Delete Coffee by ID</h3>
    <form method="post">
        Enter ID to delete: <input type="text" name="id"><br>
        <input type="submit" value="Delete">
    </form>

<%
    if (request.getMethod().equals("POST")) {
        int id = Integer.parseInt(request.getParameter("id"));

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement("DELETE FROM coffee WHERE id=?");
        ps.setInt(1, id);
        int count = ps.executeUpdate();
        out.println("<p>Deleted " + count + " record(s)</p>");
    }

    Connection con = DriverManager.getConnection(url, username, password);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

    out.println("<h3>Remaining Coffee Records</h3>");
    while (rs.next()) {
        out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getDouble("price") + "<br>");
    }
%>
</body>
</html>
