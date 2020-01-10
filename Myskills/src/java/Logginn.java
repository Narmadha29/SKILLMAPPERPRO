import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Logginn extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
          
    if(p.equals("narmadha")){  
        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
        rd.forward(request, response);  
    }  
    else{  
        request.setAttribute("message","OOps!!check ur password");
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.forward(request, response);  
                      
        }  
    }  
  
}
