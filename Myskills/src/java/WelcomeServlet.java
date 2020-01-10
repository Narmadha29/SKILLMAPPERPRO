

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class WelcomeServlet extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String docType="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      out.println(docType +
         "<html>\n" +
         "<head><title></title></head>\n"+
         "<body background = \"flower3.jpg\">\n" +
          "<h1 style=align = \"center\">" + n + "</h1>\n" 
        
      );
            
            
            
           
    }  
  
}  