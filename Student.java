/**
 * This class maintains an array of result objects called a transcript.
 * It declares private variables including a student name, a final static integer that sets the maximum size 
 * of the array and an instance variable called numberOfResults that maintains the number of results
 * available for a student.
 * A constructor that takes in the student name, initialises it and initialises transcipt as a new array is defined in this class.
 * This class also defines a method to add results to the transcript array and update the number of results and a method to return an array 
 * of results with no null entries.
 * 
 * @author amrita
 *
 */
public class Student 
{
	private Result transcript[];                         // Array of results called transcript.
	private String studentName;                          // Student name declared.
	private final static int MAX_TRANSCRIPT_LENGTH = 20; // Maximum size of the array set to 20;
	private int numberOfResults = 0; 					 // Maintains number of results available to the student.
			
	// Constructor to initialise name and transcript as new array.
	
	/**
	 * 
	 * This constructor takes in a student name and initialises it. It also initialises the transcript array 
	 * by assigning a length equal to the max transcript length that has been set to 20.
	 * 
	 * @param studentName is a String representing the name of the student.
	 */
	public Student(String studentName)
	{
		this.studentName = studentName;
		this.transcript = new Result[MAX_TRANSCRIPT_LENGTH];
	}
	
	// Creates a Result object and adds it to the end of the transcript and updates number of results. 
	//If transcript is full, result is not added.
	
	/**
	 * 
	 * This method takes in the studyModule and studentGrade from the StudentEvaluation class and adds 
	 * it to the transcript array.
	 * 
	 * @param studyModule is a module object undertaken by a student to study.
	 * @param studentGrade is a grade value from the grade enum representing the grade achieved by a student in a module.
	 */
	public void addResultToTranscript(Module studyModule, Grade studentGrade)
	{
		if (this.numberOfResults < this.MAX_TRANSCRIPT_LENGTH) 
		{
            this.transcript[this.numberOfResults] = new Result(studyModule, studentGrade);
            this.numberOfResults++;
        } 
		else if (this.numberOfResults >= this.MAX_TRANSCRIPT_LENGTH)
		{
			return;
		}
	}
	
	// Returns an array of Result objects and does not contain any null entries
	
	/**
	 * 
	 * This method creates a new array of results called transcriptCopy that is of size equal to the number of results.
	 * It iterates over the transcript array as many times as the number of results to locate a non-null entry and saves 
	 * it in a corresponding index in the new array transcriptCopy.
	 * It will return a new array containing only the results from the original transcript. 
	 * 
	 * @returns transcriptCopy array of result objects of size equal to the number of results and with no null entries.
	 */
	public Result[] getTranscript()
	{
		Result transcriptCopy[] = new Result[numberOfResults]; // New array of result objects created with length equal to number of results.
		
		int transcriptCopyIndex = 0; // Stores a whole number representing the index number of the new array.
		
		// Searches the transcript array and copies all null entries to the new array.
		for (int i = 0; i < numberOfResults; i++) 
		{
			if (transcript != null) 
			{
				transcriptCopy[transcriptCopyIndex] = transcript[i];
				transcriptCopyIndex++;
			}
		}
	
		return transcriptCopy;
	}
}	


