package test1;

public class InterfaceChild implements TestInterface {

	@Override
	public void navigate() {
		
	}
	
	@Override
	public void close() {
		
	}
	
	@Override
	public void refresh() {
		
	}
	public static void main(String[] args) {

		InterfaceChild I=new InterfaceChild();
		I.navigate();
		I.close();
		I.refresh();
	}
}
