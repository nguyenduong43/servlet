package org.example.demotomcat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="ConverterServlet",urlPatterns = "/converter")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//
//        // Mở trang Converter.jsp khi truy cập bằng URL
        request.getRequestDispatcher("/Converter.jsp")
                .forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        float rate=Float.parseFloat(request.getParameter("rate"));
        float usd=Float.parseFloat(request.getParameter("usd"));
        float vnd=rate*usd;
        //PrintWriter writer=response.getWriter();
       // writer.println("<html>");
        //writer.println("<h2>"+usd+" usd ="+vnd+" vnd "+"</h2>");
       // writer.println("</html>");

        request.setAttribute("usd", usd);
        request.setAttribute("vnd", vnd);
        request.getRequestDispatcher("Converter.jsp").forward(request,response);
       // doPost(request, response);

    }

}
