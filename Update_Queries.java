import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Update_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();
            char[] ans = s.toCharArray();
            int[] ind = new int[m];
            for(int i=0;i<m;i++){
                ind[i] = sc.nextInt();
            }
            String str = sc.next();
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int ele: ind){
                map.put(ele, map.getOrDefault(ele,0) + 1);
            }

            int i = 0;
            int j = ch.length-1;
//            StringBuilder sb = new StringBuilder(s);

            for(int key: map.keySet()){
                if(i > j){
                    break;
                }
                if(map.get(key) > 1){
                    ans[key-1] = ch[i];
                    i++;
                    j -= map.get(key) - 1;
                }
                else{
                    ans[key-1] = ch[i];
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(char c: ans){
                sb.append(c);
            }
            System.out.println(sb);
            t--;
        }
    }
}
