// https://codeforces.com/contest/1933/problem/B

import java.util.Scanner;

public class Turtle_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            System.out.println(solve(arr,sum));

            t--;
        }
    }

    private static int solve(int[] arr,long sum) {
        if(sum%3==0){
            return 0;
        }
        else if((sum+1)%3==0){
            return 1;
        }
        for(int x:arr){
            if((sum-x)%3==0){
                return 1;
            }
        }
        return 2;
    }
}
