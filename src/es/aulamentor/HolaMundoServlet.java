package es.aulamentor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class HolaMundoServlet extends HttpServlet {
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
   {
      resp.setContentType("text/html;charset=UTF-8");
      PrintWriter out = resp.getWriter();
         
      out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
      out.println("<HTML>");
      out.println(" <HEAD>");
      out.println(" <TITLE>Hola mundo nuevo 2!</TITLE>");
      out.println(" </HEAD>");
      out.println(" <BODY>");
      out.println(" Hola Mundo!");
      out.println(" </BODY>");
      out.println("</HTML>");
   }
}
