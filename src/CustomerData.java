
public class CustomerData {
	static String name;
	static String accNumber;
	static int balance;
	
	public static void setAccNumber(String accNumber) {
		CustomerData.accNumber = accNumber;
	}
	public static void setBalance(int balance) {
		CustomerData.balance = balance;
	}
	public static void setName(String name) {
		CustomerData.name = name;
	}
	public static String getAccNumber() {
		return accNumber;
	}
	public static int getBalance() {
		return balance;
	}
	public static String getName() {
		return name;
	}
}
