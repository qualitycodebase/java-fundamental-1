package conditionalStatement;

public class SwitchSelection {

	public static void main(String[] args) {
		
		String browser_type = "IE";
		
		switch(browser_type) {
		
		case "chrome":
			System.out.println("This is chrome");
		case "firefox":
			System.out.println("This is firefox");
			break;
		case "safari":
			System.out.println("This is safari");
			break;
		default:	
			System.out.println("This is IE");
		}

	}

}
