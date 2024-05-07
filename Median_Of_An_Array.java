import java.util.Arrays;
import java.util.Scanner;

public class Median_Of_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
//            int[] arr = {2,2,8};
//            int n = arr.length;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int midIdx = n / 2;
            if (n%2 == 0) {
                midIdx--;
            }

            int cnt = 0;

            for (int i=midIdx;i<n;i++) {
                if (arr[i] == arr[midIdx]) {
                    cnt++;
                }
            }

            System.out.println(cnt);
            t--;
        }
    }
}
