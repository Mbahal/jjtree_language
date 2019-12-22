package language;

/**
 * Represents a parameter in a function/procedure
 * @author Tristan Guerin
 *
 */
public class Parameter {
	
	/**
	 * Name of the parameter
	 */
	private String id;
	
	/**
	 * Type of the parameter
	 */
	private String type;
	
	/**
	 * Function or procedure where the parameter is declarated
	 */
	private String scope;
	
	/**
	 * Constructs objects from class Parameter
	 * @param type type of the parameter
	 * @param id name of the parameter
	 */
	public Parameter(String type, String id) {
		this.type = type;
		this.id = id;
		this.scope = "";
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
}
