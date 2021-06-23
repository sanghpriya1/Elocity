
public class threading {
	public static void main(String[] args) throws InterruptedException {
		Thread cs = new Thread();
		cs.start();
		System.out.println("A");
		cs.wait(1000);
		System.out.println("B");
	}

}
