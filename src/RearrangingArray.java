import java.util.HashMap;
import java.util.Scanner;

public class RearrangingArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if(!maps.containsKey(A[i]))maps.put(A[i], 1);
			else maps.put(A[i], maps.get(A[i])+1);
		}
		boolean ans  = false;
		for(Integer key : maps.values()) {
			if(key%2 == 1) {
				ans = true;
				break;
			}
		}
		if(ans == true) System.out.println("NO");
		else System.out.println("YES");
		
		sc.close();
		
	}

}
