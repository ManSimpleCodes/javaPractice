package filterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("filter destroy()");
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter dofilter()");
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		out.println("filter executing before servlet<br/>");
		chain.doFilter(req, res);
		out.println("filter executing after servlet<br/>");
				
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter init()");
		
	}

}
