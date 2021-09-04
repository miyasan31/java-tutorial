import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HelloWorld2 extends HttpServlet{ 
	public void doGet(
	HttpServletRequest req,
	HttpServletResponse res)
		throws ServletException,IOException{
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println(" <center><h1>Hello World!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}







