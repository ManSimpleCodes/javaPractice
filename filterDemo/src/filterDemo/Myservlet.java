package filterDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myservlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("my servlet is processing the request");
	}

}
