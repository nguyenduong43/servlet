package org.example.demotomcat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ServletLogin",urlPatterns = "/login")
public class ServletLogin extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        String thongbao;
        if ("admin".equals(username) && "admin".equals(password))
        {
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("Converter.jsp");
            requestDispatcher.forward(request,response);
        }else {request.setAttribute("thongbao","sai ten dang nhap hoac mat khau");
            request.getRequestDispatcher("index.jsp").forward(request,response);}
         //   request.setAttribute("username", username);
//            writer.println("<h1>"+"welcome"+username+"<h1>");
//        else writer.println("<h1>"+"Sai ten dang nhap hoac mat khau"+"<h1>");
        writer.println("</html>");
    }


}
