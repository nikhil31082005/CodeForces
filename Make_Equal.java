import java.util.Scanner;

public class Make_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int ele : arr){
                sum += ele;
            }
            int mean = sum / n;
            int extra = 0;
            boolean f = true;
            for(int i=0;i<n;i++){
                extra += arr[i] - mean;
                if(extra < 0){
                    f = false;
                }
            }
            if(!f){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
