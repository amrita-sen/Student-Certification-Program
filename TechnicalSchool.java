/**
 * 
 * This class instantiates an array of modules using the data from the Semester 1 Module Offerings Table as 
 * input parameters and  maintains an instance variable Module[] offerings.
 * A constructor for the technical school object, get and set methods and a method to search the offerings array 
 * and return a module with the matching code are defined in this class.
 * The students of the Technical School undertake a variety of these modules offered and are certified based 
 * on the grade they achieve in each of the modules they undertake.
 * A method to scan a student transcript and certify the student based on the certification criteria is also
 * defined in this class.
 * 
 * @author amrita
 *
 */
public class TechnicalSchool 
{	
	// Instantiates appropriate Module object using Semester 1 Module Offerings as input parameters
	
	/**
	 * 
	 * This method creates a new instance  of the Module object as an array and instatiates it with 
	 * data obtained from the Semester 1 Module Offerings Table that has been provided to us.
	 * 
	 * @returns a module object from the array.
	 */
	static private Module[] semesterOneOffersings()
	{
		Module modules[] = new Module[] 
		{
				new Module(Module.Type.TAUGHT, "Programming", "PROG101", Module.Level.ONE),
				new Module(Module.Type.TAUGHT, "Statistics", "STAT102", Module.Level.ONE),
				new Module(Module.Type.TAUGHT, "Database Design", "DATA222", Module.Level.TWO),
				new Module(Module.Type.TAUGHT, "Object-Oriented Programming", "PROG202", Module.Level.TWO),
				new Module(Module.Type.TAUGHT, "Information Systems", "INSY313", Module.Level.THREE),
				new Module(Module.Type.TAUGHT, "Web Services", "WEBS332", Module.Level.THREE),
				new Module(Module.Type.SELF_STUDY, "Technology Applications", "TECH103", Module.Level.ONE),
				new Module(Module.Type.SELF_STUDY, "Theory of Computation", "THEO111", Module.Level.ONE),
				new Module(Module.Type.SELF_STUDY, "Model Checking", "MODC233", Module.Level.TWO),
				new Module(Module.Type.SELF_STUDY, "Topology", "TOPG233", Module.Level.TWO),
				new Module(Module.Type.SELF_STUDY, "Logic", "LOGI321", Module.Level.THREE),
				new Module(Module.Type.PROJECT, "Web App Dev", "PROJ399", Module.Level.THREE),
				new Module(Module.Type.CLIENT_PROJECT, "Great Code Company", "EXTO396", Module.Level.THREE)
		};
		
		return modules;
	}
	
	private Module offerings[];		// Private instance variable of offerings array with the Module objects.
	
	// Default constructor
	
	/**
	 * 
	 * This constructor initialises the Technical School Object with the Module object returned by the 
	 * semesterOneOffersings method, as a default value.
	 * 
	 */
	public TechnicalSchool()
	{
		this.offerings = TechnicalSchool.semesterOneOffersings();
	}	
	
	// get method for this.offerings.
	
	/**
	 * 
	 * This method returns a module object from the offerings array.
	 * 
	 * @returns this.offerings representing a module object from the offerings array.
	 */
	public Module[] getThisOfferings()
	{
		return this.offerings;
	}
		
	// Searches the offerings array and return a module with matching code.
	
	/**
	 * 
	 * This method will take in a value of type String representing the module code, as a parameter,  and 
	 * iterate through the offerings array to return a module object with the matching code.
	 * 
	 * @param moduleCode,  of type String, representing a value for module code.
	 * @returns a module object from the offerings array with the matching code.
	 */
	public Module lookup(String moduleCode)
	{
	   for(int i = 0; i < offerings.length; i++)
	   {
		   String moduleCode2 = offerings[i].getModuleCode();
		   
		   if(moduleCode.equals(moduleCode2))
		   {
			   return offerings[i];
		   }   	   
	   }
	     
	   return null;
	}
	
	// Takes a Student object as input and examines his/her transcript to determined if he/she is certified. 
	// Returns true if student satisfies criteria, else false.
	
	/**
	 * 
	 * This method creates a new instance of the Result object to store the transcript with no null result entries 
	 * returned by the getTranscript method from the student class.
	 * It then iterates through this transcript to count the number of different types of modules passed. 
	 * It then checks the values against the certification criteria to determine if a student can be certified or
	 * not.
	 * It will return true if the student satisfies the certification criteria and false if not.
	 * 
	 * 
	 * @param student object representing the the name of the student.
	 * @returns true if the student satisfies the certification criteria and false if not.
	 */
	public boolean isCertified(Student student)
	{
		Result transcriptCopy[] = student.getTranscript(); // Stores the transcript with no null result entries from student class.
		
		// Local variables to store the numbers of different types of modules to be counted.
		int numberOfModulesPassedAtLevelOne = 0;
		int numberOfModulesPassedAtLevelTwo = 0;
		int numberOfModulesPassedAtLevelThree = 0;
		int selfStudyLevelTwoModules = 0;
		int taughtLevelThreeModules = 0;
		int projectLevelThreeModules = 0;
		int clientProjectLevelThreeModules = 0;
		
		/*This will iterate through the transcriptCopy array and check if, any module has a grade evaluating as a "Pass"
		 Each module whose grade is evaluated to be a pass, will then be checked to determine if they match the module level
		 and type needed to undergo the certification method. Every time a module is found to be a match, the corresponding
		 counter variable is incremented by 1.
		*/		
		for (int i = 0; i < transcriptCopy.length; i++)
		{
			Result result = transcriptCopy[i];			
			Grade achievedGrade = result.getStudentGrade();			
			Module module = result.getStudyModule();
			
			if (achievedGrade.isPass == true)
			{
				if(module.getModuleLevel() == Module.Level.ONE)
				{
					numberOfModulesPassedAtLevelOne++;
				}
				if(module.getModuleLevel() == Module.Level.TWO)
				{
					numberOfModulesPassedAtLevelTwo++;
								
					if (module.getModuleType() == Module.Type.SELF_STUDY) 
					{
						selfStudyLevelTwoModules++;
					}
				}	
				if(module.getModuleLevel() == Module.Level.THREE)
				{
					numberOfModulesPassedAtLevelThree++;
					
					if (module.getModuleType() == Module.Type.TAUGHT) 
					{
						taughtLevelThreeModules++;
					}
					if (module.getModuleType() == Module.Type.PROJECT) 
					{
						projectLevelThreeModules++;
					}
					if (module.getModuleType() == Module.Type.CLIENT_PROJECT) 
					{
						clientProjectLevelThreeModules++;
					}
				}
			}
		}
		
		/*
		 * This is the certification criteria needed to be satisfied in order to gain a certification.
		 * If a transcript satisfies these conditions, it will return true.
		 */
		if ((numberOfModulesPassedAtLevelOne >= 3) && (numberOfModulesPassedAtLevelTwo >= 3 && selfStudyLevelTwoModules > 1) &&
		(numberOfModulesPassedAtLevelThree >= 4 && taughtLevelThreeModules >= 2) && 
		(clientProjectLevelThreeModules >= 1 || projectLevelThreeModules >= 1))
		{
			return true;
		}
								
		return false;
	}
}	

