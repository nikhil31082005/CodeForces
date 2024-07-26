import java.util.HashMap;
import java.util.Scanner;

public class Problem_Generater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();

            long ans = 0;
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            for(char key: map.keySet()){
                if(map.get(key) < m){
                    ans += m - map.get(key);
                }
            }

            if(map.size() < 7){
                ans += (7 - map.size()) * m;
            }
            System.out.println(ans);
            t--;
        }
    }
}
