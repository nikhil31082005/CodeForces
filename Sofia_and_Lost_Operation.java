import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sofia_and_Lost_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int[] d = new int[m];

            for (int i = 0; i < m; i++) {
                d[i] = sc.nextInt();
            }

            if (canTransform(a, b, d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
    private static boolean canTransform(int[] a, int[] b, int[] d) {
        HashMap<Integer, Integer> countA = new HashMap<>();
        HashMap<Integer, Integer> countB = new HashMap<>();
        HashMap<Integer, Integer> countD = new HashMap<>();

        for (int value : a) {
            countA.put(value, countA.getOrDefault(value, 0) + 1);
        }

        for (int value : b) {
            countB.put(value, countB.getOrDefault(value, 0) + 1);
        }

        for (int value : d) {
            countD.put(value, countD.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : countB.entrySet()) {
            int value = entry.getKey();
            int required = entry.getValue();

            int availableInA = countA.getOrDefault(value, 0);
            int availableInD = countD.getOrDefault(value, 0);

            if (required > availableInA + availableInD) {
                return false;
            }
        }

        return true;
    }
}
