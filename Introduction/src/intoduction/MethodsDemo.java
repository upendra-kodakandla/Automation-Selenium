package intoduction;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo d = new MethodsDemo();
		d.getData();
		getdata2();
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUserData();
	}

	public void getData() {
		System.out.println("This is a method in own class");
	}

	public static void getdata2() {
		System.out.println("This is a static method");
	}
}
