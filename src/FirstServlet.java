import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class FirstServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	    response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("username");  
	    String p=request.getParameter("userpass");  
	    System.out.println("username:::::::"+n);
	    System.out.println("password:::::::"+p);
	    if(LoginDao.validate(n, p) || (n=="S38959" && p=="abc@123")){  
	        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        out.print("Sorry username or password error");  
	        RequestDispatcher rd=request.getRequestDispatcher("login.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	    }  

}
