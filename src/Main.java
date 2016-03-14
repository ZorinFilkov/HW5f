import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
		N = in.nextInt();
		for (int i = 1; i <= N; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
			}
		}
	
	
		int min = 0;
		int max = 0;
		for (int i = 0; i < 10; i++) {
			int number = in.nextInt();
			if (i == 0) {
				min = number;
				max = number;
			} else {
				if (min > number) {
					min = number;
				}
				if (max < number) {
					max = number;
				}
			}
		}
		System.out.println(min);
		System.out.println(max);

		
		
		N = in.nextInt();
		int K = in.nextInt();
		int fN = 1;
		for (int i = 1; i <= N; i++) {
			fN = fN * i;
		}
		int fK = 1;
		for (int i = 1; i <= K; i++) {
			fK = fK * i;
		}
		System.out.println((double) fN / (double) fK);

	
		
		N = in.nextInt();
		K = in.nextInt();
		fN = 1;
		for (int i = 1; i <= N; i++) {
			fN = fN * i;
		}
		fK = 1;
		for (int i = 1; i <= K; i++) {
			fK = fK * i;
		}
		int fNsubK = 1;
		for (int i = 1; i <= (N - K); i++) {
			fNsubK = fNsubK * i;
		}
		System.out.println((double) fN * fK / (double) fNsubK);
	}
	

}
