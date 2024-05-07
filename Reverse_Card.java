import java.util.Scanner;

public class Reverse_Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(count(a, b));
            t--;
        }
    }

    private static long count(int n, int m) {
        long k = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(((i+j)%(j*gcd(i,j)))==0){
                    k++;
                }
            }
        }
        return k;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
