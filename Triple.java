import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int[] count = new int[n+1];
            for(int ele : arr){
                count[ele]++;
            }
            int ans = -1;
            for(int i=0;i<=n;i++){
                if(count[i] >= 3){
                    ans = i;
                    break;
                }
            }
            if(ans >= 0){
                System.out.println(ans);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
