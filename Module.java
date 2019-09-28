/**
 * This is a description of the Module class.
 * The objects in this class are used to define the module object and include type, title, code, and level.
 * The certification of students is based on the grade achieved in a variety of these modules, involved in their study.
 * A constructor to intialise the module object, get and set methods for the variables and a toString  
 * method to output a string representation of the Module object to the console, are defined in this class.
 * 
 * @author amrita
 * 
 */
public class Module 
{
	private Type moduleType; 			// Stores the types of modules.
	private String moduleTitle;			// Stores the module title.
	private String moduleCode;			// Stores the module code.
	private Level moduleLevel;  		// Stores the levels of modules.
	
	// Enumeration containing types of modules
	
	/**
	 * 
	 * This enumeration contains the types of modules that can be used.
	 *
	 */
	public enum Type 
	{ 
		TAUGHT ("Taught"), SELF_STUDY ("Self-Study"), PROJECT ("Project"), CLIENT_PROJECT ("Client Project");
		
		private String moduleType;  // Stores string data type for module type.
		
		/**
		 * 
		 * This initializes enum Type with variable moduleType of type String as an input parameter.
		 * 
		 * @param moduleType is a String representing the type of module.
		 */
		private Type(String moduleType)
		{
			this.moduleType = moduleType; 
		}
	}
	
	// Enumeration containing levels of modules
	
	/**
	 * 
	 * This enumeration contains the levels of modules that can be used.
	 *
	 */
	public enum Level 
	{ 
		ONE (1), TWO (2), THREE (3);
		
		private int moduleLevel; // Stores integer value for module level.
		
		/**
		 * 
		 * This initializes enum Level with variable moduleLevel of type integer as an input parameter.
		 * 
		 * @param moduleLevel is a whole number representing the level of module.
		 */
		private Level(int moduleLevel)
		{
			this.moduleLevel = moduleLevel;
		}		
	}

	// Constructor to initialise the module object
	
	/**
	 * 
	 * This constructor initialises the title, code, level and type of module object module object.
	 * 
	 * @param moduleType of enum Type and represents the module type.
	 * @param moduleTitle is a String representing the module title.
	 * @param moduleCode is a String representing the module code.
	 * @param moduleLevel of enum Level and represents the module level
	 */
	public Module(Type moduleType, String moduleTitle, String moduleCode, Level moduleLevel)
	{
		this.moduleTitle = moduleTitle;
		this.moduleCode = moduleCode;
		this.moduleLevel = moduleLevel;
		this.moduleType = moduleType;
	}

	// Get and set methods for Module type.
	
	/**
	 * 
	 * This method will return a module type from the Type enum.
	 *  
	 * @return this.moduleTpe representing the type of module.
	 */
	public Type getModuleType()
	{
		return this.moduleType;
	}
	
	/**
	 * 
	 * This method takes in a module type of the Type enum, as a parameter, and saves it in variable this.moduleType.
	 * 
	 * @param moduleType is a value from the Type enum representing the type of module.
	 */
	public void setModuleType(Type moduleType)
	{
		this.moduleType = moduleType;
	}
	
	// Get and set methods for Module Level
	
	/**
	 * 
	 * This method will return a module level from the Level enum.
	 * 
	 * @return this.moduleLevel representing the module level.
	 */
	public Level getModuleLevel()
	{
		return this.moduleLevel;
	}
	
	/**
	 * 
	 * This method takes in a module type of the Level enum, as a parameter, and saves it in variable this.moduleLevel.
	 * 
	 * @param moduleLevel is a value from the Level enum representing the type of module.
	 */
	public void setModuleLevel(Level moduleLevel)
	{
		this.moduleLevel = moduleLevel;
	}	
	
	// Get and set methods for title
	
	/**
	 * 
	 * This method will return the module title as a String.
	 * 
	 * @return moduleTitle representing the module title.
	 */
	public String getModuleTitle()
	{
		return moduleTitle;
	}
	
	/**
	 * 
	 * This method takes in a module title as a parameter of type String and saves it in variable this.moduleTitle
	 * 
	 * @param moduleTitle representing the module title.
	 */
	public void setModuleTitle(String moduleTitle)
	{
		this.moduleTitle = moduleTitle;
	}	
	
	// Get and set methods for code
	
	/**
	 * 
	 * This method will return the module code as a String.
	 * 
	 * @return moduleCode representing the module code.
	 */
	public String getModuleCode()
	{
		return moduleCode;
	}
	
	/**
	 * 
	 * This method takes in a module code as a parameter of type String and saves in variable this.moduleCode.
	 * 
	 * @param moduleCode of type String representing the module code.
	 */
	public void setCode(String moduleCode)
	{
		this.moduleCode = moduleCode;
	}	
		
	// toString method.
	
	/**
	 * 
	 * This method overrides the toString method and returns a String representation of the module object.
	 * 
	 * @returns String representation of module object.
	 */
	public String toString()
	
	{
		return "  " + this.moduleCode + "       " + this.moduleLevel.moduleLevel +  "     " + this.moduleTitle + " (" + this.moduleType.moduleType + "): "; 
	}
}
