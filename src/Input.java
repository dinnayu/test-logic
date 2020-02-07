
public class Input {
	Init init;
	InputCustomerData inputCustomerData;
	InputProcess inputProcess;
 
	public Input() {
		init = new Init();
		inputCustomerData = new InputCustomerData(init.getTotalCust());
		inputProcess = new InputProcess(init.getTotalProcess(), inputCustomerData.getCustomerList());
	}
	
	public void printAllInput() {
		init.printInit();
		inputCustomerData.printCustomerData();
	}
}
