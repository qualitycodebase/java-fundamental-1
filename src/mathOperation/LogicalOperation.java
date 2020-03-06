package mathOperation;

public class LogicalOperation {

	public static void main(String[] args) {
		// || (or) , && (and)
		
		int d = 12;
		int c = 12;
		
		boolean my_var = c != d  ||  c != d ;   // True whenever both states get false
		
		//System.out.println(my_var);
		
		
		int e = 12;
		int f = 12;
		
		boolean my_var_and = e != f  &&  e == f ;  // True whenever both states get true
		
		System.out.println(my_var_and);
		
		

	}

}
