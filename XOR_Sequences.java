import java.util.Scanner;

public class XOR_Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ans = x^y;
            System.out.println((int)Math.pow(2,Long.numberOfTrailingZeros(ans)));
            t--;
        }
    }

}
