
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a>=10 || b>=10) {
				System.out.println("#" + test_case + " " + -1);
			}else {
				System.out.println("#" + test_case + " " + a*b);
			}
			
		}
	}
}
