
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    // Hardcoded username and password for demo purposes
    private static final String USERNAME = "disha";
    private static final String PASSWORD = "disha";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Fetch form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        // Simple authentication check
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            response.getWriter().println("<h2>Login successful! Welcome, " + username + ".</h2>");
        } else {
            response.getWriter().println("<h2>Login failed. Invalid username or password.</h2>");
        }
    }
}
