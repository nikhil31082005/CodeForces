import java.util.Scanner;

public class Gorilla_And_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for(int j=0;j<n;j++){
                arr[j] = n-j;
            }

            int i = 0;
            int p = n;
            for(int j=0;j<n-k+1;j++){
                arr[j] = p;
                p--;
            }

            int l = n-1;
            while(m > 0){
                arr[l] = m;
                m--;
                l--;
            }

            for(int j=0;j<n;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            t--;
        }
    }
}
