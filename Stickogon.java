import java.util.HashMap;
import java.util.Scanner;

public class Stickogon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                int a = sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            int count = 0;
            for(int key : map.keySet()){
                count += map.get(key)/3;
            }
            System.out.println(count);
            t--;
        }
    }
}
