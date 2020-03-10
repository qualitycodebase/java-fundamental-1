package conditionalStatement;

/*
 * 
 *Break --> Breaking point if the statement is gets true.
 *continue -- > The continue statement breaks one iteration (in the loop), if a specified condition occurs, 
 *and continues with the next iteration in the loop.
 */
public class SwitchSelection {

	public static void main(String[] args) {
		
		String browser_type = "safari";
		
		switch(browser_type) {
		
		case "chrome":
			System.out.println("This is chrome");
			break;
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
