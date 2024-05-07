import java.util.Scanner;

//  https://codeforces.com/problemset/problem/1916/B
public class Two_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int g = gcd(a,b);
            a = a / g;
            b = b / g;

            int ans = b * ((a == 1) ? b : a) * g;
            System.out.println(ans);
        }
    }

    private static int gcd(int divisor, int dividend) {
        while(dividend % divisor != 0){
            int r = dividend % divisor;
            dividend = divisor;
            divisor = r;
        }
        return divisor;
    }
}
