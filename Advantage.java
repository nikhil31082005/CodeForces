import java.util.Arrays;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] arr2 = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                arr2[i] = arr[i];
            }
            Arrays.sort(arr2);
            for(int i=0;i<n;i++){
                if(arr[i]!=arr2[n-1]){
                    arr[i] = arr[i] - arr2[n-1];
                }
                else{
                    arr[i] = arr[i] - arr2[n-2];
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
