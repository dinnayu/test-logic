import java.util.Scanner;

public class Init {
	int totalCust = 0;
	int totalProcess = 0;
	Scanner scanner = new Scanner(System.in);
	
	public Init() {
		enterTotalCustomer();
		enterTotalProcess();
	}
	
	public void enterTotalCustomer() {
		boolean isValidNumber = false;

	    System.out.print("Please enter number of customers: ");
	    while (isValidNumber == false) {
	        String line = scanner.nextLine();
	        try {
	            totalCust = Integer.valueOf(line);
	            isValidNumber = true;
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
	    
	    if (totalCust == 0) {
	    	System.err.println("Number of customers should be more than 0");
	    	enterTotalCustomer();
	    }
	}
	
	public void enterTotalProcess() {
		boolean isValidNumber = false;

	    System.out.print("Please enter number of process: ");
	    while (isValidNumber == false) {
	        String line = scanner.nextLine();
	        try {
	            totalProcess = Integer.valueOf(line);
	            isValidNumber = true;
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
	    
	    if (totalProcess == 0) {
	    	System.err.println("Number of process should be more than 0");
	    	enterTotalProcess();
	    }
	}
	
	public int getTotalCust() {
		return totalCust;
	}
	
	public int getTotalProcess() {
		return totalProcess;
	}
	
	public void printInit() {
		System.out.println(totalCust + " " + totalProcess);
	}
}
