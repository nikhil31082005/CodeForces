import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k == 0) {
                System.out.println("0");
                t--;
                continue;
            }

            int c = 1;
            int p = n;
            k -= p;
            p--;

            while (k > 0 && p > 0) {
                k -= p;
                if (k > 0) {
                    k -= p;
                    c++;
                }
                p--;
                c++;
            }

            System.out.println(c);
            t--;
        }
    }
}
