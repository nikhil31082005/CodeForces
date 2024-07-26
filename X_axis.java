import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class X_axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max = arr[1];
            long ans = 0;
            for(int ele : arr){
                ans += Math.abs(max - ele);
            }
            System.out.println(ans);
            t--;
        }
    }
}
