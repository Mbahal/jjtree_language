package language;

import java.util.ArrayList;

/**
 * Represents a function or a procedure in the language
 * @author Tristan Guerin
 *
 */
public class Function {
	
	/**
	 * List of all functions and procedures available in the language
	 */
	public static ArrayList<Function> listOfFunctions = new ArrayList<Function>();
	
	/**
	 * Name of the language
	 */
	private String id;
	
	/**
	 * Return type of the function or procedure
	 */
	private String type;
		
	/**
	 * List of the different parameter taken by the function/procedure
	 */
	private ArrayList<Parameter> listOfParameters = new ArrayList<Parameter>();
	
	
	/**
	 * Constructs objects from class Function
	 * @param id name of the function/procedure
	 * @param type return type
	 */
	public Function(String id, String type) {
		this.type = type;
		this.id = id;
	}
	
	
	/**
	 * Sets the name
	 * @param id new name
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Sets the type
	 * @param type new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Sets the parameters
	 * @param listOfParameters list of parameters
	 */
	public void setParameters(ArrayList<Parameter> listOfParameters) {
		this.listOfParameters = listOfParameters;
	}
	
	/**
	 * Gets the type
	 * @return type of the function/procedure
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * Gets the name
	 * @return name of the function/procedure
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * Gets the list of functions/procedures
	 * @return list
	 */
	public static ArrayList<Function> getFunctions(){
		return listOfFunctions;
	}
	
	/**
	 * Gets the function from a given id
	 * @return Function
	 */
	public static Function getFunction(String id) {
		for(Function temp : Function.getFunctions()) {
			if(temp.getId().equals(id)) {
				return temp;
			}
		}		
		return null;
	}
	
	/**
	 * Gets the parameters
	 * @return list of parameters
	 */
	public ArrayList<Parameter> getParameters(){
		return this.listOfParameters;
	}
}
