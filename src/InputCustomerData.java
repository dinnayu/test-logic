import java.util.ArrayList;
import java.util.Scanner;

import com.sun.corba.se.impl.javax.rmi.CORBA.Util;

public class InputCustomerData {
	ArrayList<CustomerData> customerList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	CommonUtils utils = new CommonUtils();
	CustomerData customerData;
	
	public InputCustomerData(int totalCust) {
		for (int i = 0; i<totalCust; i++) {
			customerData = new CustomerData();
			enterName(i+1);
			enterAccNumb(i+1);
			enterBalance(i+1);
			customerList.add(customerData);
		}
	}
	
	public void enterName(int i) {
		String name = "";
		
		System.out.println("Please enter name of customer " + i + ": ");
		name = scanner.nextLine();
		if (!name.trim().isEmpty()){
			customerData.setName(name.trim());
		} else {
			enterName(i);
		}
	}
	
	public void enterAccNumb(int i) {
		String accNumb = "";
		
		System.out.println("Please enter account number of customer " + i + ": ");
		accNumb = scanner.nextLine();
		if (!accNumb.trim().isEmpty() && utils.isValidAccNumb(accNumb.trim()) && !isAccExists(accNumb.trim())){
			customerData.setAccNumber(accNumb.trim());
		} else {
			enterAccNumb(i);
		}
	}
	
	public boolean isAccExists(String accNumb) {
		boolean isExists = false;
		for (CustomerData data : customerList) {
			if (data.getAccNumber().equals(accNumb)){
				isExists = true;
				break;
			}
		}
		
		return isExists;
	}
	
	public void enterBalance(int i) {
		int balance = 0;
		
		System.out.println("Please enter balance of customer " + i + ": ");
		boolean isValidNumber = false;
	    while (isValidNumber == false) {
	        String line = scanner.nextLine();
	        try {
	            balance = Integer.valueOf(line);
	            isValidNumber = true;
	            customerData.setBalance(balance);
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
	}
	
	public ArrayList<CustomerData> getCustomerList(){
		return customerList;
	}
	
	public void printCustomerData() {
		for (CustomerData data : customerList) {
			System.out.println(data.getName() +'\n' +
					data.getAccNumber() + '\n' +
					data.getBalance()
					);
		}
	}
}
