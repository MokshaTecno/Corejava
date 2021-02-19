package test1;

public abstract class ParentClass {
	
	int empno=101;
	public void display() {
		System.out.println("empno is:" +empno);
	}
abstract void run();
abstract void horn();
abstract void safety();

}
