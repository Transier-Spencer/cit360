package ServletRecipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns={"/Servlet"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {

        // Set content type of the response
        servletResponse.setContentType("text/html");

        try (PrintWriter servletWriter = servletResponse.getWriter()) {

            // Set up beginning of HTML page
            servletWriter.println("<!DOCTYPE html><html>");
            servletWriter.println("<head>");
            servletWriter.println("<meta charset=\"UTF-8\" />");
            servletWriter.println("<title>Recipe ServletRecipe.Servlet</title>");
            servletWriter.println("</head>");
            servletWriter.println("<body>");

            // Set variables to the request parameters
            String recipeName = servletRequest.getParameter("recipeName");
            String recipeCategory = servletRequest.getParameter("recipeCategory");

            // Print body of HTML page
            servletWriter.println("<h1>New Recipe Added:</h1>");
            servletWriter.println("<p>Recipe Name: " + recipeName + "</p>");
            servletWriter.println("<p>Recipe Category: " + recipeCategory + "</p>");

            // Close out body and HTML
            servletWriter.println("</body>");
            servletWriter.println("</html>");
        }
    }

    protected void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {

        servletResponse.setContentType("text/html");
        PrintWriter servletWriter = servletResponse.getWriter();
        servletWriter.println("This resource is not available directly.");
    }
}
