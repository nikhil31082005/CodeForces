import java.util.Scanner;

// https://codeforces.com/problemset/problem/1846/D
public class Rudolph_ans_Christmas_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            double d = sc.nextDouble();
            double h = sc.nextDouble();
            int[] heights = new int[n];
            for (int i = 0; i < n; i++) {
                heights[i] = sc.nextInt();
            }
            double area = d * h / 2;
            double total = area;
            for (int i = 0; i < n - 1; i++) {
                if (heights[i] + h <= heights[i + 1]) {
                    total = total + area;
                } else {
                    double h1 = heights[i] + h - heights[i + 1];
                    total = total + area - (h1 * h1 * d / (2 * h));
                }
            }
            System.out.println(total);
            t--;
        }
    }
}



