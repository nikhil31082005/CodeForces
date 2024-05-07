import java.util.Scanner;

public class Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int mod = 1000000007;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            long maxSum = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                maxSum += arr[i]%mod;
            }

            int maxSoFar = 0;
            int maxEndingHere = 0;

            for (int i = 0; i < arr.length; i++) {
                maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
            maxSum += maxSoFar;
            k--;
            while(k > 0){
                maxSoFar *= 2;
                maxSum += maxSoFar;

                k--;
            }
            System.out.println((maxSum+1000000007)%mod);
            t--;
        }
    }
}
