import java.util.Scanner;

public class Closest_Cities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] min = new int[n];
            min[0] = arr[1];
            min[n-1] = arr[n-2];
            for(int i=1;i<n-1;i++){
                min[i] = Math.min(arr[i]-arr[i-1] , arr[i+1]-arr[i]);
            }
            int q = sc.nextInt();
            while(q > 0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int total = 0;
                
            }
        }
    }
}
