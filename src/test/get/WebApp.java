package test.get;

import java.util.Map;

public class WebApp {
	public static ServletContext context;
	static {
		context = new ServletContext();
		Map<String,String> mapping = context.getMapping();
		mapping.put("/login", "login");
		mapping.put("/log", "login");
		mapping.put("/reg", "register");
		mapping.put("/register", "register");
	
	
		
		Map<String,Servlet> servlet = context.getServelt();
		servlet.put("login",new LoginServlet());
		servlet.put("register",new RegisterServlet());
		
	}
	public static Servlet getServlet(String url) {
		if(url==null||url.equals("")) {
			return null;
		}
		Map<String,String> mapping= WebApp.context.getMapping();
		Map<String,Servlet> servlet = WebApp.context.getServelt();
		String key = mapping.get(url);
		return servlet.get(key);
	}
	
}


