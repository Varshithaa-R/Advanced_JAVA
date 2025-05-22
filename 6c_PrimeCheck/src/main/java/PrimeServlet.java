/*Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkPrime")
public class PrimeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String numStr = request.getParameter("number");

        try {
            int num = Integer.parseInt(numStr);
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            if (isPrime) {
                out.println("<h3>" + num + " is a Prime Number.</h3>");
            } else {
                out.println("<h3>" + num + " is NOT a Prime Number.</h3>");
            }
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<h3>Please enter a valid integer!</h3>");
        }
    }
}
