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

    int i = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=utf-8");
        try {
            /*
            String result = null;

            if(request.getParameter("x") != null && request.getParameter("y") != null) {
                try {
                    Integer x = Integer.parseInt(request.getParameter("x"));
                    Integer y = Integer.parseInt(request.getParameter("y"));
                    result = x + " + " + y + " = " + (x + y);
                } catch (Exception e) {
                    result = "Error - " + e.getClass().getSimpleName() + ": " + e.getMessage();
                }
            }

            out.println("HTTP method: <strong>" + request.getMethod() + "</strong><br/>");
            out.println("Your (or proxy) IP address: <strong>" + request.getRemoteAddr() + "</strong><br/>");
            out.println("Server name: <strong>" + request.getServerName() + "</strong><br />");
            out.println("You accept: <strong>" + request.getHeader("Accept") + "</strong><br />");
            out.println("You accept following languages: <strong>" + request.getHeader("Accept-Language") + "</strong><br />");
            out.println("You accept following encodings for HTTP response: <strong>" + request.getHeader("Accept-Encoding") + "</strong><br />");
            out.println("Your browser is: <strong>" + request.getHeader("User-Agent") + "</strong><br />");
            out.println("Your name is: <strong>" + request.getParameter("imie") + "</strong><br />");
            out.println("Your age is: <strong>" + request.getParameter("wiek") + "</strong><br />");
            out.println("<form method=\"post\">");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>x:</td><td><input name=\"x\" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>y:</td><td><input name=\"y\" /></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<input type=\"submit\" />");
            out.println("</form>");
            if(result != null) {
                out.println("Result: <strong>" + result + "</strong>");
            }
            */
            i = i + 1;
            out.println(i);
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
