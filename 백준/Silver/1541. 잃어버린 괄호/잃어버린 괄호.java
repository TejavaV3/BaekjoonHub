import java.util.Scanner;

public class Main {
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String [] str = example.split("-");
        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if(i==0)answer = answer + temp;
            else answer = answer - temp;
        }
        System.out.println(answer);
    }

    private static int mySum(String s) {
        int sum = 0;
        String [] temp = s.split("[+]"); // 양쪽에 대괄호 : + 인식문제
        for (int i = 0; i <temp.length; i++) {
            sum = sum + Integer.parseInt(temp[i]);
        }
        return sum;
    }
}