import java.util.Scanner;

public class The_Good_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int ans = (n-1)%k==0 ? (n-1)/k+1 : (n-1)/k+2;
            System.out.println(ans);
            t--;
        }
    }
}
