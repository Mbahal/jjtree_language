package language;

import java.util.ArrayList;

/**
 * Represents a variable defined in the language
 * @author Tristan Guerin
 *
 */
public class Variable {

	/**
	 * List of all variables defined in the language
	 */
	public static ArrayList<Variable> listOfVariables = new ArrayList<Variable>();
	
	/**
	 * Name of the variable
	 */
	private String id;
	
	/**
	 * Type of the variable
	 */
	private String type;
	
	/**
	 * Function or procedure where the variable is declarated
	 */
	private String scope;
	
	/**
	 * Boolean saying if the variable has a value
	 */
	private boolean isDefined;
	
	/**
	 * Value of the variable
	 */
	private Object value;
	
	/**
	 * Constructs objects from class Variable
	 * @param type type of the variable
	 * @param id name of the variable
	 */
	public Variable(String type, String id) {
		this.type = type;
		this.id = id;
		this.scope = "";
		this.isDefined= false;
		this.value = null;
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
	 * Sets the scope
	 * @param scope new scope
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}
	
	/**
	 * Sets the isDefined
	 * @param isDefined new isDefined
	 */
	public void setDefined(boolean isDefined) {
		this.isDefined = isDefined;
	}
	
	/**
	 * Sets the value
	 * @param value new value
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	
	/**
	 * Gets the type
	 * @return type
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * Gets the name
	 * @return name
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * Gets the scope
	 * @return scope
	 */
	public String getScope() {
		return this.scope;
	}
	
	/**
	 * Gets the isDefined
	 * @return isDefined
	 */
	public boolean getDefined() {
		return this.isDefined;
	}
	
	/**
	 * Gets the value
	 * @return value
	 */
	public Object getValue() {
		return this.value;
	}
	
	/**
	 * Gets the list of variables
	 * @return list
	 */
	public static ArrayList<Variable> getVariables(){
		return listOfVariables;
	}
}
