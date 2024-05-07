import java.util.Scanner;


//  https://codeforces.com/problemset/problem/1374/B
public class Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();

            int count = 0;

            while(n >= 3){
                if(n % 6 == 0){
                    n = n / 6;
                }
                else{
                    n = n * 2;
                }
                count++;
            }
            if(n==2 || n < 0){
                System.out.println("-1");
            }
            else{
                System.out.println(count);
            }
        }
    }
}
