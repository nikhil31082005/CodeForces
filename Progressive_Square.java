import java.util.*;

public class Progressive_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int[] brr = new int[n*n];
            for(int i=0;i<n*n;i++){
                brr[i] = sc.nextInt();
            }
            Arrays.sort(brr);
            int[] arr = new int[n*n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[n*i+j] = brr[0] + i*c + j*d;
                }
            }
            Arrays.sort(arr);
            if(Arrays.equals(brr,arr)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
