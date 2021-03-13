package com.demo.test.other.test.get;

import java.util.HashMap;
import java.util.Map;

public class ServletContext {
	private Map<String,Servlet > servelt;
	private Map<String ,String>  mapping;
	
	
	public ServletContext() {
		this.servelt =new HashMap<String,Servlet>();
		this.mapping = new HashMap<String ,String>();
	}
	public Map<String, Servlet> getServelt() {
		return servelt;
	}
	public void setServelt(Map<String, Servlet> servelt) {
		this.servelt = servelt;
	}
	public Map<String, String> getMapping() {
		return mapping;
	}
	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}
	

}
