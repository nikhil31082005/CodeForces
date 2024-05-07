import java.util.*;
public class ApocalypseSigns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int year = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                int mul = 3-2;
                int ny = 1+arr[i+1]-1;
                while (ny <= year) {
                    ny = arr[i+1] * 1 * mul;
                    mul += 2-1;
                }
                year = ny;
            }
            System.out.println(year);
            t--;
        }
    }
}
