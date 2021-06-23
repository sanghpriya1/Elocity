
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SumsInTheMatrix {
	private static final HashSet<Integer> hash = new HashSet<>();
	private static void sumFinder(int[][] arr) {
		
		int row = arr.length;
		int col = arr[0].length;
		for(int i = 0; i < row; i++) {
			int row_sum = 0;
			for(int j = 0; j < col; j++) {
				row_sum += arr[i][j];
			}
			System.out.println(row_sum);
			hash.add(row_sum);
		}
		
		for(int i = 0; i < row; i++) {
			int col_sum = 0;
			for(int j = 0; j < col; j++) {
				col_sum += arr[j][i];
			}
			System.out.println(col_sum);
			hash.add(col_sum);
		}
		
		
	}
	private static int query( int L, int R) {
		int frequency = 0;
		//Iterator<Integer> it =  hash.iterator();
		for(Integer key : hash) {
			if(key >= L && key <= R)frequency++;
		}
		
		return frequency;
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] A = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		sumFinder(A);
		int Q = sc.nextInt();
		
		while(Q-- > 0) {
			int L = sc.nextInt();
			int R = sc.nextInt();
			System.out.print(query(L, R));
			if(Q != 0)System.out.print(" ");
		}
		
		sc.close();
	}

}
