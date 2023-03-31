import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)throws IOException {
//		System.out.println("SignUpController!!");
//		String first_name = request.getParameter("fname");
//		String last_name = request.getParameter("lname");
//		String email = request.getParameter("email");
//		String password = request.getParameter("pass");
//		
//		System.out.println("First name is: " + first_name);
//		System.out.println("Last name is: " + last_name);
//		System.out.println("Email is: " + email);
//		System.out.println("Password is: " + password);
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String choice = request.getParameter("sum");
		int ans=0 , temp=0;
//		System.out.println(choice);
		if(choice.equals("Addition"))
		{
			ans = num1+num2;
			temp=1;
			System.out.println("Addition of " + num1 + " and " + num2 + " is: " + (num1+num2));
		}
		else if(choice.equals("Subtration"))
		{
			ans = num1-num2;
			temp=2;
			System.out.println("Subtration of " + num1 + " and " + num2 + " is: " + (num1-num2));
		}
		else if(choice.equals("Multiplication"))
		{
			ans = num1*num2;
			temp=3;
			System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1*num2));
		}
		else
		{
			ans = num1/num2;
			temp=4;
			System.out.println("Divition of " + num1 + " and " + num2 + " is: " + (num1/num2));
		}
		response.setContentType("");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		if(temp==1)
		{
			out.print(num1 + " + " + num2 + " = " + ans + "<br>");
		}
		else if(temp==2)
		{
			out.print(num1 + " - " + num2 + " = " + ans + "<br>");
		}
		else if(temp==3)
		{
			out.print(num1 + " * " + num2 + " = " + ans + "<br>");
		}
		else
		{
			out.print(num1 + " / " + num2 + " = " + ans + "<br>");
		}
		out.print("</body></html>");
		
	}
	
	
	
	
}