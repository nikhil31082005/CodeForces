import java.util.Scanner;

public class Split_the_multiset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int c = 0;
            while(n > 1){
                n = n - k + 1;
                c++;
            }
            System.out.println(c);
            t--;
        }
    }
}
