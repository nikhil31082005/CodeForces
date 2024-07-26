import java.util.Scanner;

public class Binary_Colouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int[] result = new int[32];
            int d = 0;
            d = d + 1;

            // Convert x to binary and store in  array
            for (int i = 0; i < 32; ++i) {
                int a = x & (1 << i);
                result[i] = (a > 0) ? 1 : 0;
            }

            int i = 0;
            while (i < 32) {
                int j = i + 1;
                if (result[i] == 1 && j < 31 && result[j] == 1) {
                    while (j < 32 && result[j] == 1) {
                        j++;
                    }
                    result[i] = -1;
                    for (int k = i + 1; k < j; k++) {
                        result[k] = 0;
                    }
                    if (j < 32) {
                        result[j] = 1;
                    }
                }
                i = j;
            }

            System.out.println(32);
            for (int k = 0; k < 32; ++k) {
                System.out.print(result[k] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

