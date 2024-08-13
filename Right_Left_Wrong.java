import java.util.Scanner;

public class Right_Left_Wrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String s = sc.next();

            int i = 0;
            int j = n - 1;

            while(i < n && s.charAt(i) != 'L') {
                i++;
            }

            while(j >= 0 && s.charAt(j) != 'R') {
                j--;
            }

            // If `i` is greater than `j`, then there's no valid range.
            if (i > j) {
                System.out.println(0);
            } else {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
            }

            t--;
        }
    }
}
