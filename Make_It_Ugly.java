//https://codeforces.com/contest/1954/problem/B

import java.util.Scanner;

public class Make_It_Ugly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int ans = n;
            int c = 0;
            for(int i=0;i<n;i++){
                if(arr[i] != arr[0]){
                    ans = Math.min(c,ans);
                    c = 0;
                }
                else{
                    c++;
                }
            }
            ans = Math.min(c,ans);
            if(ans == n){
                System.out.println(-1);
            }
            else{
                System.out.println(ans);
            }
            t--;
        }
    }
}
