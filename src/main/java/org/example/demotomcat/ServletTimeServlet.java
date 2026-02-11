package org.example.demotomcat;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.*;
@WebServlet(name="ServletTimeServlet",urlPatterns ="/index")
public class ServletTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter writer=response.getWriter();
        writer.println("");
        Date today=new Date();
        writer.println("<h1>"+today+"</h1>");
        writer.println("");

    }

}
