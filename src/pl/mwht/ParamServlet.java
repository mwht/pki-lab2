package pl.mwht;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ParamServlet")
public class ParamServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=utf-8");
        try {
            out.println("HTTP method: <strong>" + request.getMethod() + "</strong><br/>");
            out.println("Your (or proxy) IP address: <strong>" + request.getRemoteAddr() + "</strong><br/>");
            out.println("Server name: <strong>" + request.getServerName() + "</strong><br />");
            out.println("You accept: <strong>" + request.getHeader("Accept") + "</strong><br />");
            out.println("You accept following languages: <strong>" + request.getHeader("Accept-Language") + "</strong><br />");
            out.println("You accept following encodings for HTTP response: <strong>" + request.getHeader("Accept-Encoding") + "</strong><br />");
            out.println("Your browser is: <strong>" + request.getHeader("User-Agent") + "</strong><br />");
            out.println("Your name is: <strong>" + request.getParameter("imie") + "</strong><br />");
            out.println("Your age is: <strong>" + request.getParameter("wiek") + "</strong><br />");

        } finally {
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
