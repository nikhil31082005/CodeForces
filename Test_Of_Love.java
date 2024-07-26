import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test_Of_Love {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t > 0) {
            solve();
            t--;
        }
    }
    public static void solve(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine(); // consume the newline character
        String river = sc.nextLine();

        List<Integer> logs = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(river.charAt(i) == 'L'){
                logs.add(i);
            }
        }
        logs.add(n+1);
        int i = -1;
        int nextLog = 0;
        while(i < n-1){
            if(m >= logs.get(nextLog) - i){
                i = logs.get(nextLog);
            }
            else{
                i += m;
                if(i > n-1){
                    System.out.println("YES");
                    return;
                }
                else{
                    while(i < n && i < logs.get(nextLog)){
                        if(river.charAt(i) != 'C' && k > 0){
                            k--;
                            i++;
                        }
                        else{
                            System.out.println("NO");
                            return;
                        }
                    }
                }
            }
            nextLog++;
        }
        System.out.println("YES");
    }
}
