
public class MyInterfaceImpl implements MyInterface {

	@Override
	public void showData() {
		System.out.println("Showing data from Impl class");
	}
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		myInterface.showData();
	}

}
