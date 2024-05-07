import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modular_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int S = sc.nextInt();
            List<Integer> ls = new ArrayList<>();
            boolean ans = modular(ls,n,x,y,S,0);
            if(ans){
                System.out.println("YES");
                System.out.println(ls);
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }

    private static boolean modular(List<Integer> ls, int n, int x, int y, int S, int ans) {
        if (n == 0) {
            return ans == S;
        }
        if (ans + x < S && modular(ls, n - 1, x % y, y, S, ans + x)) {
            ls.add(x);
            return true;
        }
        else if (ans + x == S) {
            ls.add(x);
            return true;
        }
        else if (ans + x < S && modular(ls, n - 1, x + y, y, S, ans + x)) {
            ls.add(x);
            return true;
        }



//        if (x != y && ans + (x % y) < S && modular(ls, n - 1, x % y, y, S, ans + (x % y))) {
//            ls.add(x % y);
//            return true;
//        }
        return false;
    }

//    private static void modular(List<Integer> ls, int n, int x, int y, int S,int ans) {
//        if(ans == S && n==0){
//            return;
//        }
//        if(ans > S){
//            return;
//        }
//        if(ans+x < S){
//            ls.add(x);
//            modular(ls,n-1,x+y,y,S,ans+x+y);
//            modular(ls,n-1,x%y,y,S,ans+(x%y));
//            ls.remove(ls.size()-1);
//        }
//
//    }
}
