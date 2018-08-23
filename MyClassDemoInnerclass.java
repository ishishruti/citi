
public class MyClassDemoInnerclass {

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void showData() {
				System.out.println("Displaying data from inner class");
			}
		};
		myInterface.showData();
	}
}
