import java.util.ArrayList;
import java.util.Scanner;

public class InputProcess {
	ArrayList<CustomerData> dataList = new ArrayList<>();
	ArrayList<String> processList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	CommonUtils utils = new CommonUtils();
	String accNumber = "";
	
	public InputProcess(int totalProcess, ArrayList<CustomerData> dataList) {
		this.dataList.addAll(dataList);
		for (int i = 0 ; i < totalProcess ; i++) {
			selectProcess();
		}
	}
	
	public void selectProcess() {
		System.out.println("Please select one of the following processes:\n"
				+ "1. SEARCH\n"
				+ "2. ADD\n"
				+ "3. MEAN");
		String line = scanner.nextLine();
		int selectedProcess = 0;
		boolean isValidNumber = false;
		while (isValidNumber == false) {
			try {
	            selectedProcess = Integer.valueOf(line);
	            isValidNumber = true;
	            System.out.println("SELECT: " + selectedProcess);
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
		}
		
		switch (selectedProcess) {
		case 1:
			int minBalance = getBalance();
			processList.add("SEARCH " + minBalance);
			break;
		case 2:
			getAccNumb();
			int balance = getBalance();
			processList.add("ADD " + accNumber + " " + balance);
			break;
		case 3:
			processList.add("MEAN");
			break;
		default:
			break;
		}
	}
	
	public int getBalance() {
		System.out.println("Please enter balance:");
		int minBalance = 0;
		boolean isValidNumber = false;
		while (isValidNumber  == false) {
	        String line = scanner.nextLine();
	        try {
	            minBalance = Integer.valueOf(line);
	            isValidNumber = true;
	        } catch (NumberFormatException e){
	        	System.err.println("Sorry, please enter a number.\n");
	        }
	    }
		
		return minBalance;
	}
	
	public void getAccNumb() {
		System.out.println("Please enter acc number:");
		String line = scanner.nextLine();
		if (!line.trim().isEmpty() && utils.isValidAccNumb(line.trim())){
			accNumber = line;
		} else {
			getAccNumb();
		}
	}
	
	public ArrayList<String> getProcessList(){
		return processList;
	}
	
	public void printAllProcess() {
		for(String process : processList) {
			System.out.println(process);
		}
	}
}
