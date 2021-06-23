
public class Main {
	{
		System.out.println("Instance Block");
	}
	public void meth() {
		System.out.println("Method");
	}
	public void main() {
		System.out.println("Cnstructor");
	}
	static {
		System.out.println("static block");
	}
	public static void main(String[] args) {
		Main ob = new Main();
		ob.main();
		ob.meth();
	}

}
