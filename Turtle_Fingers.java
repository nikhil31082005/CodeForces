import java.util.HashSet;
import java.util.Scanner;

public class Turtle_Fingers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();
            HashSet<Long> hs = new HashSet<>();
            for (int i = 0; Math.pow(a, i) <= l; i++) {
                for (int j = 0; Math.pow(b, j) <= l; j++) {
                    long prod = (long) Math.pow(a, i) * (long) Math.pow(b, j);
                    if (l % prod == 0) {
                        hs.add(l / prod);
                    }
                }
            }

            System.out.println(hs.size());
            t--;
        }
    }
}
