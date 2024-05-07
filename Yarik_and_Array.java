import java.util.Scanner;

public class Yarik_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int sum = arr[0];
            int ans = arr[0];
            for(int i=1;i<n;i++){
                if (Math.abs(arr[i] % 2) != Math.abs(arr[i - 1] % 2)) {
                    sum += Math.max(sum+arr[i],arr[i]);
                } else {
                    sum = arr[i];
                }
                ans = Math.max(ans, sum);
            }
            System.out.println(ans);
            t--;
        }
    }
}
