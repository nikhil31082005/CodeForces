import java.util.Scanner;

public class Earning_On_Bets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            long lcm = 1;
            for(int i=0;i<n;i++){
                lcm = arr[i]*lcm / gcd(arr[i],lcm);
            }
            long[] ans = new long[n];
            for(int i=0;i<n;i++){
                ans[i] = lcm/arr[i];
                sum += ans[i];
            }
            if(sum < lcm){
                for (int i = 0; i < n; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
            t--;
        }
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
