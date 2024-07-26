import java.util.Scanner;

public class Guess_The_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int ans = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int max = arr[i];
                for(int j=i+1;j<i+3 && j< n ;j++){
                    max = Math.max(max,arr[j]);
                    ans = Math.min(ans,max);
                }
            }

//            int ans = Integer.MAX_VALUE;
//            for(int i=0;i<n;i++){
//                int max = arr[i];
//                for(int j=i+1;j<n;j++){
//                    max = Math.max(max,arr[j]);
//                    ans = Math.min(ans,max);
//                }
//            }
            System.out.println(ans-1);
            t--;
        }
    }
}
