import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Seating_In_A_Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> ls = new HashSet<>();
            ls.add(arr[0]);
            boolean f = true;
            for(int i=1;i<n;i++){
                if(ls.contains(arr[i]-1) ||  ls.contains(arr[i]+1)){
                    ls.add(arr[i]);
                }
                else{
                    f = false;
                    break;
                }

            }
            if(f){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
