<%@ page import="java.sql.*" %>
<jsp:include page="dbconfig.jsp" />
<html>
<body>
    <h3>Update Coffee</h3>
    <form method="post">
        ID to update: <input type="text" name="id"><br>
        New Name: <input type="text" name="name"><br>
        New Price: <input type="text" name="price"><br>
        <input type="submit" value="Update">
    </form>

<%
    if (request.getMethod().equals("POST")) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement("UPDATE coffee SET coffee_name=?, price=? WHERE id=?");
        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.setInt(3, id);
        int count = ps.executeUpdate();
        out.println("<p>Updated " + count + " record(s)</p>");
    }

    Connection con = DriverManager.getConnection(url, username, password);
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

    out.println("<h3>All Coffee Records</h3>");
    while (rs.next()) {
        out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getDouble("price") + "<br>");
    }
%>
</body>
</html>
