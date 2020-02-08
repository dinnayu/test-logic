import java.util.ArrayList;

public class Output {
	ArrayList<String> processList = new ArrayList<>();
	ArrayList<CustomerData> customerList = new ArrayList<>();

	public Output() {
		Input input = new Input();
		input.printAllInput();
		processList = input.getAllProcess();
		customerList = input.getCustomerList();
	}
	
	public void getOutput() {
		System.out.println("\n===== OUTPUT =====\n");
		for (String process : processList) {
			if (process.contains("SEARCH")){
				String minBalance = process.replace("SEARCH ", "");
				search(Integer.parseInt(minBalance));
			} else if (process.contains("ADD")) {
				String s = process.replace("ADD ", "");
				String accNumber = s.substring(0, s.indexOf(" "));
				String balanceString = s.replace(accNumber, "").trim();
				int balance = Integer.parseInt(balanceString);
				add(accNumber, balance);
			} else {
				mean();
			}
		}
	}
	
	public void search(int minBalance) {
		boolean isExist = false;
		for (CustomerData data : customerList) {
			if (data.getBalance() >= minBalance) {
				System.out.println(data.getName() + ", " + data.getAccNumber());
				isExist = true;
			}
		}
		
		if (!isExist) {
			System.out.println("Not found");
		}
	}
	
	public void add(String accNumber, int balance) {
		boolean isExist = false;
		for (CustomerData data : customerList) {
			if (data.getAccNumber().equals(accNumber)) {
				int newBalance = data.getBalance() + balance;
				data.setBalance(newBalance);
				System.out.println("Successfully adding Rp " + balance + " to " + accNumber);
				isExist = true;
			}
		}
		
		if (!isExist) {
			System.out.println(accNumber + " is not found");
		}
	}
	
	public void mean() {
		int totalBalance = 0;
		int totalCustomers = customerList.size();
		
		for (CustomerData data : customerList) {
			totalBalance += data.getBalance();
		}
		
		if (totalCustomers > 0) {
			double mean = totalBalance/totalCustomers;
			System.out.println("Mean is: " + mean);
		}
	}
}
