package test1;

public class FIrstClass {
	int age;
	String name;
	float salary;
		public void display() {
			System.out.println("inside display");
	}
	public static void main(String[] args) {
		System.out.println("helloword");
		SecondClass obj1=new SecondClass();
		obj1.Show("Moksha");
		SecondClass obj2=new SecondClass();
		obj1.Show("Moulya");
		obj2.Calculate();
		
		// TODO Auto-generated method stub

	}

}



