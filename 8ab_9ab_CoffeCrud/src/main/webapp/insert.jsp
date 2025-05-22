/*Read all the existing records from the table coffee which is from the database test and insert a
new coffee product into it [Create a table coffee with fields ( id,coffee_name,price)] using HTML and
JSP to get the fields and display the results respectively*/



<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>Coffee Management</title>
</head>
<body>
<h2>Enter Coffee Product</h2>
<form method="post">
  ID: <input type="text" name="id"/><br/>
  Name: <input type="text" name="coffee_name"/><br/>
  Price: <input type="text" name="price"/><br/>
  <input type="submit" value="Insert"/>
</form>

<%
Connection con = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee_shop", "root", "");

    if(request.getParameter("id") != null) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("coffee_name");
        double price = Double.parseDouble(request.getParameter("price"));

        PreparedStatement ps = con.prepareStatement("INSERT INTO coffee VALUES (?, ?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setDouble(3, price);

        int i = ps.executeUpdate();
        if(i > 0) out.println("<p style='color:green;'>Coffee inserted successfully.</p>");
    }

    // Display coffee report
    out.println("<hr/>");
    out.println("<h3>Coffee Report</h3>");
    out.println("<pre>");
    out.println("---------------------------------------------");

    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

    double total = 0;
    while(rs.next()) {
        int cid = rs.getInt("id");
        String cname = rs.getString("coffee_name");
        double price = rs.getDouble("price");
        total += price;

        out.println("ID        : " + cid);
        out.println("Name      : " + cname);
        out.println("Price     : " + price);
        out.println("---------------------------------------------");
    }

    out.println("Grand Total Price : " + total);
    out.println("---------------------------------------------");
    out.println("</pre>");

} catch(Exception e) {
    out.println("<p style='color:red;'>Error: " + e.getMessage() + "</p>");
    e.printStackTrace();
} finally {
    if(con != null) con.close();
}
%>
</body>
</html>
