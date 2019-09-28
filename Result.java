/**
 * 
 * This class stores the Module and Grade objects used in the transcript of results generated for a student.
 * A constructor intialises both these objects.
 * Get and set methods and a toString method to output a string representation of the Result object to the 
 * console, are defined in this class.
 * 
 * @author amrita
 *
 */
public class Result 
{
	private Module studyModule;
	private Grade studentGrade;
	
	// Constructor to initialise instance variables.
	
	/**
	 * 
	 * This constructor takes in and initialises the Module and Grade objects.
	 * 
	 * @param studyModule is a module object that represents a module a student has undertaken to study at the Technical School.
	 * @param studentGrade is a grade object that represents a grade value a student has achieved in the module undertaken to study.
	 */
	public Result(Module studyModule, Grade studentGrade)
	{
		this.studyModule = studyModule;
		this.studentGrade = studentGrade;
	}
	
	// Get and set methods for studyModule.
	
	/**
	 * 
	 * This method returns a module representing the module object undertaken by a student to study.
	 * 
	 * @returns studyModule representing the module object undertaken by a student to study.
	 */
	public Module getStudyModule()
	{
		return studyModule;
	}
	
	/**
	 * 
	 * This method takes in the studyModule and saves it in variable this.studyModule.
	 * 
	 * @param studyModule is a module object undertaken by a student to study.
	 */
	public void setStudyModule(Module studyModule)
	{
		this.studyModule = studyModule;
	}
	
	// Get and set methods for studentGrade.
	
	/**
	 * 
	 * This method returns a grade value from the grade enum representing the grade achieved by a student in a module.
	 * 
	 * @returns studentGrade representing a grade value from the grade enum achieved by a student in a module.
	 */
	public Grade getStudentGrade()
	{
		return studentGrade;
	}
	
	/**
	 * 
	 * This method takes in a grade value from the grade enum representing the grade achieved by a student in a module
	 * and saves it in this.studentgrade.
	 * 
	 * @param studentGrade is a grade value from the grade enum representing the grade achieved by a student in a module.
	 */
	public void setStudentGrade(Grade studentGrade)
	{
		this.studentGrade = studentGrade;
	}
	
	// toString method.
	
	/**
	 * 
	 * This method overrides the toString method and return String representation of the result object.
	 * 
	 *  @returns String representation of result object.
	 */
	public String toString()
	{
		return this.studyModule + this.studentGrade.getGrade();
	}	
}

