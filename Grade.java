/**
 * 
 * This enumeration maintains a list of grade values with associated boundaries for each mark.
 * These grades will be assigned, post evaluation, to modules the students undertake to study.
 * This will also determine if the student has passed a module based on the minimum score achieved.
 * A constructor for the Grade object, a method to determine if a grade is a pass or not and a get
 * method that returns a letter corresponding to a value are defined in this enum.
 * 
 * @author amrita
 *
 */
public enum Grade 
{
	APLUS(90, "A+"), A (85, "A"), AMINUS (80, "A-"), BPLUS (75, "B+"), B (70, "B"), 
	BMINUS (65, "B-"), CPLUS (60, "C-"), C (55, "C"), CMINUS (50, "C-"), D (0, "D");

	private int requiredPassScore; 	// Stores the score required to pass a module.
	private String gradeLetter; 	// Stores String version of the grade.
	public boolean isPass;			// Stores a true or false value for the variable isPass.
	
	// Constructor that sets the true  the 
	
	/**
	 * 
	 * This constructor takes in the score required to pass a module, as a parameter, and sets it to greater than
	 * on equal to 50. This is saved in this.isPass representing whether the achieved grade is a pass or not.
	 * This constructor also takes in a String representing the grade letter corresponding to the values in 
	 * the Grade enum and initialises it.
	 * 
	 * @param requiredPassScore is a whole number representing the minimum score required to pass a module.
	 * @param gradeLetter is a String representing the grade letter corresponding to the values in the Grade enum.
	 */
	private Grade (int requiredPassScore, String gradeLetter) 
	{
		this.isPass = requiredPassScore >= 50;
		this.gradeLetter = gradeLetter;
	}
	
	// Indicates if the Grade is a pass or not. Returns true Grade is a pass, else false.
	
	/**
	 * 
	 * This method indicates if the grade is a pass or not. Returns true Grade is a pass, else false.
	 * 
	 * @returns true if the score corresponding to the grade achieved is score that is required to pass a module. 
	 */
	public boolean isPass() 
	{
		return this.isPass;
	}
	
	// Get method for gradeLetter.
	
	/**
	 * 
	 * This method returns a grade letter of type String corresponding to a value in the Grade enum.
	 * 
	 * @return this.gradeLetter of type String representing the grade letter corresponding to a value in the Grade enum.
	 */
	public String getGrade()
	{
		return this.gradeLetter;
	}
}	