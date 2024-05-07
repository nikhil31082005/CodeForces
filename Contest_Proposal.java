import java.util.Scanner;

public class Contest_Proposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] brr = new int[n];
            for (int i = 0; i < n; i++) {
                brr[i] = sc.nextInt();
            }

            int i = 0;
            int j = 0;
            long k = 0;

            while(i < n-k && j < n){
                if(arr[i] <= brr[j]){
                    i++;
                    j++;
                }
                else if(arr[i] > brr[j]){
                    j++;
                    k++;
                }
            }
            System.out.println(k);
            t--;
        }
    }
}
