import java.util.Arrays;
import java.util.Scanner;

public class Make_Almost_Equal_With_Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] array = new int[n];
            Arrays.sort(array);

            // Find the maximum element in the array
            long maxElement = array[array.length - 1];

            // Find the greatest common divisor (gcd) of the array elements
            long gcd = array[1] - array[0];
            for (int i = 2; i < array.length; i++) {
                gcd = gcd(gcd, array[i] - array[i - 1]);
            }

            // Choose k as the smaller value between maxElement and gcd
            System.out.println(Math.min(maxElement, gcd));
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
