import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Myservlet1 extends GenericServlet{
	static Connection con;
	static Statement st;
	@Override
	public void init(ServletConfig sc)throws ServletException{
		System.out.println("init method");
		String driver=sc.getInitParameter("driver");
		System.out.println("driver name "+driver);
		System.out.println("================");
		String url=sc.getInitParameter("url");
		System.out.println("========kj");
		String username=sc.getInitParameter("username");
		System.out.println("===-=----");
		String password=sc.getInitParameter("password");
		System.out.println("=====lkjkl;");
		
		
			System.out.println("=**********************");
			
				try {
					Class.forName(driver);
					con=DriverManager.getConnection(url,username,password);
					System.out.println("con.."+con);
				 st=con.createStatement();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			System.out.println("=*******serdtyuio***************");
			
		
		
	}
	
	@Override
	public void service(ServletRequest req,ServletResponse res)throws IOException{
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("my servlet is processing the request");
		int eid=Integer.parseInt(req.getParameter("eid"));
		String ename=req.getParameter("ename");
		int esal=Integer.parseInt(req.getParameter("esal"));
		String edept=req.getParameter("edept");
		
		try {
			
			

			int updatecount=st.executeUpdate("insert into sbajram values("+eid+",'"+ename+"',"+esal+",'"+edept+"')");
			out.println("count:"+updatecount);
		} catch (SQLException e) {
			System.out.println("sql-updatecount");
			//e.printStackTrace();
		}
		
	}

}