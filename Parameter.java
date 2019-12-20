package test;

//import java.util.HashMap;

public class Parameter {

//public static HashMap<String,Argument> listOfArguments = new HashMap<String,Argument>();
	
	public String id;
	
	public String type;
	
	public Parameter(String type, String id) {
		this.type = type;
		this.id = id;
		this.scope = "";
	}
	
	public String scope;
	
	
	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	
	public String getType() {
		return this.type;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getScope() {
		return this.scope;
	}
	
	/*
	public static HashMap<String,Parameter> getArguments(){
		return listOfParameters;
	}*/
	
	
}
