import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Kuriyama_Mirais_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long[] pre = new long[n];
        pre[0] = arr[0];
        for(int i=1;i<n;i++) {
            pre[i] = pre[i - 1] + arr[i];
        }
        Arrays.sort(arr);
        long[] pre1 = new long[n];
        pre1[0] = arr[0];
        for(int i=1;i<n;i++) {
            pre1[i] = pre1[i - 1] + arr[i];
        }
        int q = sc.nextInt();
        while (q > 0) {
            int k = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if(k == 1){
                if(l == 1){
                    System.out.println(pre[r-1]);
                }
                else{
                    System.out.println(pre[r-1] - pre[l-2]);
                }
            }
            else{
                if(l == 1){
                    System.out.println(pre1[r-1]);
                }
                else{
                    System.out.println(pre1[r-1] - pre1[l-2]);
                }
            }
            q--;
        }
    }
}
