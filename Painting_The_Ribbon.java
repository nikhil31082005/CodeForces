//https://codeforces.com/contest/1954/problem/A

import java.util.Scanner;

public class Painting_The_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            if (m == 1) {
                System.out.println("NO");
            } else {
                int x = ((n + (m - 1)) / m);
//                System.out.println(x);
                if (k >= (n - x)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
            t--;
        }
    }
}
