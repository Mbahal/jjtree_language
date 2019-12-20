package test;

import java.util.ArrayList;
//import java.util.HashMap;

public class Fonction {
	
	public static ArrayList<Fonction> listOfFonctions = new ArrayList<Fonction>();
	
	public String id;
	
	public String type;
		
	public ArrayList<Parameter> listOfParameters = new ArrayList<Parameter>();
	
	
	public Fonction(String id, String type) {
		this.type = type;
		this.id = id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setParameters(ArrayList<Parameter> listOfParameters) {
		this.listOfParameters = listOfParameters;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getId() {
		return this.id;
	}
	
	public static ArrayList<Fonction> getFonctions(){
		return listOfFonctions;
	}
	
	
	public static Fonction getFonction(String id) {
		for(Fonction temp : Fonction.getFonctions()) {
			if(temp.getId().equals(id)) {
				return temp;
			}
		}		
		return null;
	}
	
	
	public ArrayList<Parameter> getParameters(){
		return this.listOfParameters;
	}
}
