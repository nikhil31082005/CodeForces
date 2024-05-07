//https://codeforces.com/contest/1933/problem/D

import java.util.Arrays;
import java.util.Scanner;

public class Turtle_Tenacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(arr));
            t--;
        }
    }

    private static String solve(int[] arr) {
        Arrays.sort(arr);
        if(arr[0] != arr[1]){
            return "YES";
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]%arr[0]!=0){
                return "YES";
            }
        }
        return "NO";
    }
}
