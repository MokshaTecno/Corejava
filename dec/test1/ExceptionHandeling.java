package test1;

public class ExceptionHandeling {

	public static void main(String[] args) {
		
		try {
			
		int i=0;
		int j=10/i;
		System.out.println("hiiiiiiiii");// I'm Moksha
		
		}
		catch(ArithmeticException e) {
		
		System.out.println("we can't divide any number by zero ");
		// TODO Auto-generated method stub

	}
		catch(Exception e) {
			System.out.println("Exception e");
			
		}
		
		System.out.println("after Exception");
	}

}
