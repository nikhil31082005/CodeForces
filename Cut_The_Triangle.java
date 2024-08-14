import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cut_The_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            Set<Integer> xs = new HashSet<>();
            Set<Integer> ys = new HashSet<>();

            xs.add(x1);
            xs.add(x2);
            xs.add(x3);

            ys.add(y1);
            ys.add(y2);
            ys.add(y3);

            if (xs.size() == 3 || ys.size() == 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
