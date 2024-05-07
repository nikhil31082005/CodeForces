import java.util.Scanner;
//  https://codeforces.com/problemset/problem/1896/B
public class AB_Flipping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int a = -1;
            int b = -1;

            for(int i=0;i<n;i++){
                if(s.charAt(i)=='A'){
                    a = i;
                    break;
                }
            }

            for(int i=n-1;i>=0;i--){
                if(s.charAt(i)=='B'){
                    b = i;
                    break;
                }
            }

            if(a != -1 && b != -1){
                System.out.println(Math.max(0,b-a));
            }
            else{
                System.out.println("0");
            }
        }
    }
}
