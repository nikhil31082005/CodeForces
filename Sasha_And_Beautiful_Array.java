import java.util.Arrays;
import java.util.Scanner;

public class Sasha_And_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long sum = 0;
            for(int i=1;i<n;i++){
                sum += arr[i] - arr[i-1];
            }
            System.out.println(sum);
            t--;
        }
    }
}
