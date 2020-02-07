import java.util.ArrayList;
import java.util.Scanner;

public class InputProcess {
	ArrayList<CustomerData> dataList = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	
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
			break;
		case 2:
			break;
		default:
			break;
		}
	}
}
