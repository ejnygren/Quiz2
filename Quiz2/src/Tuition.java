import java.util.Scanner;
import java.lang.Object;
//Determining how much the tuition will cost for 4 years
public class Tuition {
	//Naming the variables and printing the input statements
	public static void Tuition(){
	//Scanner used for user input	
	Scanner input = new Scanner(System.in);
	 //Prompting the user to enter tuition cost   
	System.out.println("Enter the cost of your tuition: ");
	double initialTuition = input.nextDouble();
	//Prompting the user for the percentage increase of thier tuition    
	System.out.println("Enter the percentage increase of tuition: ");
	double percentageIncrease = (input.nextDouble() / 100);
	double tuitionIncrease;
	//Calculating the tuition over a 4 year period with the raise each year
	tuitionIncrease = initialTuition;
    for(int n = 0; n < 4; n++) {
	    tuitionIncrease += (tuitionIncrease * percentageIncrease);
	    initialTuition += tuitionIncrease;
	}
    //Printing out the amount of final tuition    
    System.out.println("The amount of tuition you will be paying is: " + "$" + initialTuition);
	//Prompting the user to input the amount of thier student loan   
	System.out.println("How much was your student loan for?: ");
	double studentLoan = input.nextDouble();
	//Prompting the percentage of APR on their loan  
	System.out.println("What was the APR on your student loan?: ");
	double APR = (input.nextDouble() / 100);
	//Calculating how many years it will take to pay off their loans    
	long numberOfYears = 0;
	    double max = 0;
	    for (long n = 0; n < 100000000; n++) {
	    	max += (studentLoan * APR);
	    	if(max == studentLoan || max > studentLoan) {
	    		numberOfYears = n;
	    		break;
	    		
	    		
	    	}
	    }
	    //Printing how many years it will take to pay off the loans in full
	    System.out.println("It will take" + numberOfYears + "years to pay off the student loan.");
	
	}

}
