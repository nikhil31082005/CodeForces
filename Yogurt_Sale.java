//https://codeforces.com/contest/1955/problem/A

import java.util.Scanner;

public class Yogurt_Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(maximum(n,a,b));
            t--;
        }
    }

    private static long maximum(int n, int a, int b) {
        if(2*a <= b){
            return n*a;
        }
        int cost = b*(n/2) + (n%2)*a;
        return cost;
    }
}
