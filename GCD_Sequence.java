import java.util.Scanner;

public class GCD_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int c = 0;
            int ele = 1;

            int i = 0;
            int j = 1;
            while(j < arr.length){
                int gcd = GCD(arr[i],arr[j]);
                if(gcd >= ele){
                    ele = gcd;
                    i++;
                    j++;
                }
                else{
                    i++;
                    j += 2;
                    c++;
                }
            }


            if(c > 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }

    private static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
