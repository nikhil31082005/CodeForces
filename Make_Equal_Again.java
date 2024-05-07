import java.util.Scanner;

public class Make_Equal_Again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(ans(n,arr));
            t--;
        }
    }
    public static int ans(int n,int[] arr){
        int c1 = 1;
        int c2 = 1;

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                c1++;
            }
            else{
                break;
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]==arr[i+1]){
                c2++;
            }
            else{
                break;
            }
        }
            if(c1==n && c2 == n){
                return 0;
            }
        if(arr[0]==arr[n-1]){
            return n-c1-c2;
        }
        else{
            return n-Math.max(c1,c2);
        }
    }
}
