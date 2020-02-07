import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class Test {
	static int numberCust = 0;
	static int numberProcess = 0;
	static ArrayList<CustomerData> custList = new ArrayList<CustomerData>();
	static CustomerData customerData;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		enterCustomer();
	}
	
	public static void enterCustomer() {
	    boolean isValidNumber = false;

	    System.out.print("Please enter number of customers: ");
	    while (isValidNumber == false) {
	        String line = scanner.nextLine();
	        try {
	            numberCust = Integer.valueOf(line);
	            isValidNumber = true;
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
	    
	    if (numberCust == 0) {
	    	System.err.println("Number of customers should be more than 0");
	    	enterCustomer();
	    } else {
	    	enterProcess();
	    }
	}
	
	public static void enterProcess() {
	    boolean isValidNumber = false;

	    System.out.print("Please enter number of process: ");
	    while (isValidNumber == false) {
	        String line = scanner.nextLine();
	        try {
	            numberProcess = Integer.valueOf(line);
	            isValidNumber = true;
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
	    
	    if (numberProcess == 0) {
	    	System.err.println("Number of process should be more than 0");
	    	enterProcess();
	    } else {
	    	enterCustomerData();
	    }
	}
	
	public static void enterCustomerData() {
		for (int i = 0; i < numberCust; i++) {
			customerData = new CustomerData();
			enterName(i+1);
			enterAccNumb(i+1);
			enterBalance(i+1);
			custList.add(customerData);
		}
	}
	
	public static void enterName(int i) {
		String name = "";
		
		System.out.println("Please enter name of customer " + i + ": ");
		name = scanner.nextLine();
		if (!name.trim().isEmpty()){
			CustomerData.setName(name.trim());
		} else {
			enterName(i);
		}
	}
	
	public static void enterAccNumb(int i) {
		String accNumb = "";
		
		System.out.println("Please enter account number of customer " + i + ": ");
		accNumb = scanner.nextLine();
		if (!accNumb.trim().isEmpty() && isValidAccNumb(accNumb.trim())){
			CustomerData.setAccNumber(accNumb.trim());
		} else {
			enterAccNumb(i);
		}
	}
	
	public static boolean isValidAccNumb(String accNumb) {
		return accNumb.matches("\\d+") && accNumb.length() == 10;
	}
	
	public static void enterBalance(int i) {
		int balance = 0;
		
		System.out.println("Please enter balance of customer " + i + ": ");
		boolean isValidNumber = false;
	    while (isValidNumber == false) {
	        String line = scanner.nextLine();
	        try {
	            balance = Integer.valueOf(line);
	            isValidNumber = true;
	            CustomerData.setBalance(balance);
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
	}

}
