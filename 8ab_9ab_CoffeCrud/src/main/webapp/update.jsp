/*Read all the existing records from the table coffee which is from the database test and update an
existing coffee product in the table with its id. [Create a table coffee with fields
( id,coffee_name,price)] using HTML and JSP to get the fields and display the results respectively*/



<%@ page import="java.sql.*" %>
<html>
<body>
<h2>Update Coffee Product</h2>
<form method="post">
  ID to Update: <input type="text" name="id"/><br/>
  New Name: <input type="text" name="coffee_name"/><br/>
  New Price: <input type="text" name="price"/><br/>
  <input type="submit" value="Update"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop", "root", "");

    if (request.getParameter("id") != null) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        PreparedStatement ps = con.prepareStatement("UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?");
        ps.setString(1, name);
        ps.setDouble(2, price);
        ps.setInt(3, id);

        int i = ps.executeUpdate();
        if (i > 0) out.println("<p style='color:green;'>Coffee updated successfully.</p>");
        else out.println("<p style='color:red;'>Coffee ID not found.</p>");
    }

    // Display all records
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

    out.println("<h3>All Coffee Records</h3>");
    while (rs.next()) {
        out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("coffee_name") + ", Price: " + rs.getDouble("price") + "<br>");
    }

} catch(Exception e) {
    out.println("Error: " + e.getMessage());
} finally {
    if (con != null) con.close();
}
%>
</body>
</html>
