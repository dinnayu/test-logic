import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class Test {
	static ArrayList<CustomerData> custList = new ArrayList<CustomerData>();

	public static void main(String[] args) {
		Output output = new Output();
	}	
	
	
//	
//	public static boolean isValidAccNumb(String accNumb) {
//		return accNumb.matches("\\d+") && accNumb.length() == 10;
//	}
//	
//	public static void inputBalance() {
//		System.out.println("Please enter balance:");
//		int balance = 0;
//		boolean isValidNumber = false;
//		while (isValidNumber  == false) {
//	        String line = scanner.nextLine();
//	        try {
//	            balance = Integer.valueOf(line);
//	            isValidNumber = true;
//	        } catch (NumberFormatException e){
//	        	System.err.println("Sorry, please enter a number.\n");
//	        }
//	    }
//		search(balance);
//	}
//	
//	public static void inputAccNumb() {
//		System.out.println("Please enter acc number:");
//		String accNumb = "";
//		accNumb = scanner.nextLine();
//		if (!accNumb.trim().isEmpty() && isValidAccNumb(accNumb.trim())){
//			 
//		} else {
//			enterAccNumb(i);
//		}
//	}
//	
//	public static void search(int minBalance) {
//		for (CustomerData data : custList) {
//			if (data.getBalance() >= minBalance) {
//				System.out.println(data.getName() + ", " + data.getAccNumber());
//			}
//		}
//	}
//	
//	public static void add(String accNumb, int addBalance) {
//		int index = custList.indexOf(accNumb);
//		System.out.println(custList.get(index).getName());
//	}
//	
//	public static void mean() {
//		System.out.println("MEAN ...");
//	}

}
