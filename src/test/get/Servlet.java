package test.get;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;

public abstract class Servlet {
	public void servlet(Request req,Response resp) throws Exception{
		this.doGet(req,resp);
		this.doPost(req,resp);
	}
	abstract void doGet(Request req,Response resp) throws Exception;
	abstract void doPost(Request req,Response resp) throws Exception;
}
