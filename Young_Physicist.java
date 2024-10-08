//https://codeforces.com/problemset/problem/69/A

import java.util.Scanner;

public class Young_Physicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        while (n > 0) {
            x += sc.nextInt();
            y += sc.nextInt();
            z += sc.nextInt();
            n--;
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
