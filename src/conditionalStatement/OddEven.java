package conditionalStatement;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 2343203; //
		
		if(k==0) {
			System.out.print("This number is Zero / neither Even nor Odd number");
			
	    }else if(k%2==0) {
			System.out.print("This number is Even");
			
		} else if (k%2 != 0) {
			System.out.print("This number is Odd");
		}

	}

}
