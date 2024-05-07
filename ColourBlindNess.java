import java.util.Scanner;

public class ColourBlindNess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            boolean ans = true;
            for(int i=0;i<n;i++){
                if(s1.charAt(i)==s2.charAt(i) || (s1.charAt(i)=='B' && s2.charAt(i)=='G') || (s1.charAt(i)=='G' && s2.charAt(i)=='B')){
                    continue;
                }
                else{
                    ans = false;
                }
            }
            if(ans){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
