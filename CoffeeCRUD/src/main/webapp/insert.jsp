<%@ page import="java.sql.*" %>
<jsp:include page="dbconfig.jsp" />
<html>
<body>
    <h3>Insert New Coffee</h3>
    <form method="post">
        ID: <input type="text" name="id"><br>
        Name: <input type="text" name="name"><br>
        Price: <input type="text" name="price"><br>
        <input type="submit" value="Insert">
    </form>

<%
    if (request.getMethod().equals("POST")) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));

        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement("INSERT INTO coffee VALUES (?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, price);
        ps.executeUpdate();
        out.println("<p>Inserted successfully!</p>");
    }

    // Display all
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
