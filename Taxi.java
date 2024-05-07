// https://codeforces.com/problemset/problem/158/B

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for(int i=0;i<n;i++){
            arr[sc.nextInt()]++;
        }
        int taxi = arr[4];
        taxi += arr[3];
        arr[1] = Math.max(0,arr[1]-arr[3]);
        taxi += (arr[1] + arr[2]*2 + 3) / 4;
        System.out.println(taxi);
    }
}
