/***
 * 
 * This class has been provided to test the implementation of the certification algorithm.
 * It maintains the post evaluation results of four students that will be added to to the transcript in the student class.
 * It also defines a main method to test the certification algorithm in the Technical School class and
 * display the transcript including the module and grade details and overall certification result in a String representation 
 * to the console. 
 * 
 * */
public class StudentEvaluation 
{
	public static Student axel()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Axel");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.BPLUS);		
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.C);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.A);		
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.AMINUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.A);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.D);		
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.B);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.B);		
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.C);

		return rb;
	}

	public static Student kate()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Kate");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.APLUS);
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.AMINUS);		
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.A);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.C);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.A);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.AMINUS);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.B);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.B);

		return rb;
	}

	public static Student jim()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Jim");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.A);
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("PROG202"),Grade.C);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.C);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("THEO111"),Grade.D);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.APLUS);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.A);
		rb.addResultToTranscript(ts.lookup("LOGI321"),Grade.B);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.BMINUS);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.APLUS);
		
		return rb;
	}

	public static Student robin()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Robin");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.C);		
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.C);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CPLUS);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.APLUS);		
		
		return rb;
	}
	
	/**
	 * 
	 * This method will test the certification algorithm in the Technical School class and display the 
	 * transcript of each student to the console. The transcript includes details of modules, grades and 
	 * the overall certification result in a String representation.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		TechnicalSchool ar = new TechnicalSchool();
		String certificationGranted;
				
		System.out.println("      ******* Transcript for Robin *******\n");
		Result robinResult1 = new Result(ar.lookup("PROG101"),Grade.C);
		Result robinResult2 = new Result(ar.lookup("DATA222"),Grade.C);
		Result robinResult3 = new Result(ar.lookup("INSY313"),Grade.CPLUS);
		Result robinResult4 = new Result(ar.lookup("WEBS332"),Grade.CPLUS);
		Result robinResult5 = new Result(ar.lookup("TECH103"),Grade.CPLUS);
		Result robinResult6 = new Result(ar.lookup("MODC233"),Grade.CMINUS);
		Result robinResult7 = new Result(ar.lookup("TOPG233"),Grade.CMINUS);
		Result robinResult8 = new Result(ar.lookup("PROJ399"),Grade.APLUS);	
		
		System.out.println("MODULE CODE   LEVEL   TITLE (TYPE): ACHIEVED GRADE");
		System.out.println(robinResult1 + "\n" + robinResult2 + "\n" + robinResult3 + "\n" + robinResult4 + "\n" + robinResult5);
		System.out.println(robinResult6 + "\n" + robinResult7 + "\n" + robinResult8);

		if(ar.isCertified(StudentEvaluation.robin()) == true)
		{
			certificationGranted = "Granted!";
		}
		else
		{
			certificationGranted = "Not Granted";
		}
		
		System.out.println("\nResult: Certification " + certificationGranted);
	
		System.out.println("\n      ******* Transcript for Kate *******\n");
		Result kateResult1 = new Result(ar.lookup("PROG101"),Grade.APLUS);
		Result kateResult2 = new Result(ar.lookup("STAT102"),Grade.AMINUS);		
		Result kateResult3 = new Result(ar.lookup("TECH103"),Grade.BPLUS);
		Result kateResult4 = new Result(ar.lookup("MODC233"),Grade.A);
		Result kateResult5 = new Result(ar.lookup("TOPG233"),Grade.C);
		Result kateResult6 = new Result(ar.lookup("DATA222"),Grade.A);
		Result kateResult7 = new Result(ar.lookup("INSY313"),Grade.BPLUS);
		Result kateResult8 = new Result(ar.lookup("WEBS332"),Grade.AMINUS);
		Result kateResult9 = new Result(ar.lookup("PROJ399"),Grade.B);
		Result kateResult10 = new Result(ar.lookup("EXTO396"),Grade.B);
		
		System.out.println("MODULE CODE   LEVEL   TITLE (TYPE): ACHIEVED GRADE");
		System.out.println(kateResult1 + "\n" + kateResult2 + "\n" + kateResult3 + "\n" + kateResult4 + "\n" + kateResult5);
		System.out.println(kateResult6 + "\n" + kateResult7 + "\n" + kateResult8 + "\n" + kateResult9 + "\n" + kateResult10);

		if(ar.isCertified(StudentEvaluation.kate()) == true)
		{
			certificationGranted = "Granted!";
		}
		else
		{
			certificationGranted = "Not Granted";
		}
		
		System.out.println("\nResult: Certification " + certificationGranted);
	
		System.out.println("\n      ******* Transcript for Axel *******\n");
		Student rb = new Student("Axel");
		Result axelResult1 = new Result(ar.lookup("PROG101"),Grade.BPLUS);		
		Result axelResult2 = new Result(ar.lookup("STAT102"),Grade.C);
		Result axelResult3 = new Result(ar.lookup("DATA222"),Grade.A);		
		Result axelResult4 = new Result(ar.lookup("INSY313"),Grade.AMINUS);
		Result axelResult5 = new Result(ar.lookup("WEBS332"),Grade.A);
		Result axelResult6 = new Result(ar.lookup("TECH103"),Grade.D);		
		Result axelResult7 = new Result(ar.lookup("MODC233"),Grade.B);
		Result axelResult8 = new Result(ar.lookup("TOPG233"),Grade.B);		
		Result axelResult9 = new Result(ar.lookup("PROJ399"),Grade.CMINUS);
		Result axelResult10 = new Result(ar.lookup("EXTO396"),Grade.C);
		
		System.out.println("MODULE CODE   LEVEL   TITLE (TYPE): ACHIEVED GRADE");
		System.out.println(axelResult1 + "\n" + axelResult2 + "\n" + axelResult3 + "\n" + axelResult4 + "\n" + axelResult5);
		System.out.println(axelResult6 + "\n" + axelResult7 + "\n" + axelResult8 + "\n" + axelResult9 + "\n" + axelResult10);
		 
		if(ar.isCertified(StudentEvaluation.axel()) == true)
		{
			certificationGranted = "Granted!";
		}
		else
		{
			certificationGranted = "Not Granted";
		}
		
		System.out.println("\nResult: Certification " + certificationGranted);
		
		System.out.println("\n      ******* Transcript for Jim *******\n");
		Result jimResult1 = new Result(ar.lookup("PROG101"),Grade.A);
		Result jimResult2 = new Result(ar.lookup("STAT102"),Grade.BPLUS);
		Result jimResult3 = new Result(ar.lookup("DATA222"),Grade.CPLUS);
		Result jimResult4 = new Result(ar.lookup("PROG202"),Grade.C);
		Result jimResult5 = new Result(ar.lookup("INSY313"),Grade.C);
		Result jimResult6 = new Result(ar.lookup("WEBS332"),Grade.CPLUS);
		Result jimResult7 = new Result(ar.lookup("TECH103"),Grade.CMINUS);
		Result jimResult8 = new Result(ar.lookup("THEO111"),Grade.D);
		Result jimResult9 = new Result(ar.lookup("MODC233"),Grade.APLUS);
		Result jimResult10 = new Result(ar.lookup("TOPG233"),Grade.A);
		Result jimResult11 = new Result(ar.lookup("LOGI321"),Grade.B);
		Result jimResult12 = new Result(ar.lookup("PROJ399"),Grade.BMINUS);
		Result jimResult13 = new Result(ar.lookup("EXTO396"),Grade.APLUS);
		
		System.out.println("MODULE CODE   LEVEL   TITLE (TYPE): ACHIEVED GRADE");
		System.out.println(jimResult1 + "\n" + jimResult2 + "\n" + jimResult3 + "\n" + jimResult4 + "\n" + jimResult5 + "\n" + jimResult6);
		System.out.println(jimResult7 + "\n" + jimResult8 + "\n" + jimResult9 + "\n" + jimResult10 + "\n" + jimResult11 + "\n" + jimResult12);
		System.out.println(jimResult13);
		 
		if(ar.isCertified(StudentEvaluation.jim()) == true)
		{
			certificationGranted = "Granted!";
		}
		else
		{
			certificationGranted = "Not Granted";
		}
		
		System.out.println("\nResult: Certification " + certificationGranted);
	}
}



