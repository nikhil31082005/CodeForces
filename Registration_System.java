// https://codeforces.com/problemset/problem/4/C

import java.util.HashMap;
import java.util.Scanner;

public class Registration_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
            if(map.containsKey(arr[i])){
                System.out.println(arr[i] + map.get(arr[i]));
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                System.out.println("OK");
                map.put(arr[i],1);
            }
        }

    }
}
