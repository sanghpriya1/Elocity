import java.io.IOException;

class A{
	public void fun(){
		System.out.println("A");
	}
	
}
public class B extends A{
	public void fun() throws IOException{
		System.out.println("B");
	}
	public static void main(String[] args) {
		try {
			new B().fun();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}
}

