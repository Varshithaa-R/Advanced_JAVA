/*Build a servlet program to create a cookie to get your name through text box and press submit
button( through HTML) to display the message by greeting Welcome back your name ! , you have
visited this page n times ( n = number of your visit ) and demonstrate the expiry of cookie also.*/



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visit")
public class VisitServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        // Check if cookies exist
        Cookie[] cookies = request.getCookies();
        boolean found = false;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue()) + 1;
                    found = true;
                }
            }
        }

        // Create or update cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry to 1 minute (60 seconds)
        nameCookie.setMaxAge(60);
        visitCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(visitCookie);

        // Response HTML
        out.println("<html><body>");
        out.println("<h3>Welcome back " + name + "!</h3>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<p>(Cookies expire in 60 seconds)</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}
