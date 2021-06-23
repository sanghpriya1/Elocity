import java.util.LinkedList;
import java.util.Queue;

public class fun2 {
	static void  fun(int n) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0);
		q.add(1);
		for(int i = 0; i < n; i++) {
			int f = q.poll();
			int s = q.poll();
			q.add(s);
			q.add(f+s);
			System.out.println(f);
		}
	}
	public static void main(String[] args) {
		int n  =5;
		fun(n);
	
	}

}
