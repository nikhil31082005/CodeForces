import java.util.Scanner;

public class Little_Nikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(isPossible(n,m));
            t--;
        }
    }

    private static String isPossible(int n, int m) {
        if(n < m){
            return "No";
        }
        if(n == m){
            return "Yes";
        }
        int rem = n - m;
        if(rem % 2 == 0){
            return "Yes";
        }
        return "No";
    }
}
