import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=5; i<=n; i*=5){
            ans += n/i;
        }
        System.out.println(ans);
    }
}
        
        