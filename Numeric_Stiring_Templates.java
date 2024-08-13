import java.util.HashMap;
import java.util.Scanner;

public class Numeric_Stiring_Templates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            while(m > 0){
                String s = sc.next();

                if (s.length() != n) {
                    System.out.println("NO");
                    m--;
                    continue;
                }

                HashMap<Character,Integer> map = new HashMap<>();
                HashMap<Integer,Character> map1 = new HashMap<>();
                boolean check = true;
                for(int i=0;i<s.length();i++){
                    if(map.containsKey(s.charAt(i))){
                        if(map.get(s.charAt(i)) != arr[i]){
                            check = false;
                            break;
                        }
                    }
                    else{
                        map.put(s.charAt(i),arr[i]);
                    }

                    if(map1.containsKey(arr[i])){
                        if(map1.get(arr[i]) != s.charAt(i)){
                            check = false;
                            break;
                        }
                    }
                    else{
                        map1.put(arr[i],s.charAt(i));
                    }
                }
                if(check){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
                m--;
            }
            t--;
        }
    }
}
