
public class CommonUtils {
	
	public boolean isValidAccNumb(String accNumb) {
		return accNumb.matches("\\d+") && accNumb.length() == 10;
	}
}
