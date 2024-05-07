import java.util.Scanner;

//  https://codeforces.com/problemset/problem/1624/B
public class AP_making {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int A = b - (c - b);
            int p = -1;
            if( A>=a && A%a==0){
                p = 1;
            }
            int B = a + (c - a) / 2;
            if(B>=b && B%b==0 && (c-a)%2==0){
                p = 1;
            }
            int C = b - (a - b);
            if(C>=c && C%c==0){
                p = 1;
            }
            if(p==-1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
