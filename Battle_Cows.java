//https://codeforces.com/contest/1951/problem/B

import java.util.Scanner;

public class Battle_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(minWin(arr,k));
            t--;
        }
    }

    private static int minWin(int[] arr, int k) {
        k -= 1;
        int ans = 0;
        for(int i=0;i<k;i++){
            if(arr[i] > arr[k]){
                swap(arr,i,k);
                ans = check(arr,i);
                swap(arr,i,k);
                break;
            }
        }
        swap(arr,0,k);
        ans = Math.max(ans,check(arr,0));
        return ans;
    }

    private static int check(int[] arr, int start) {
        int count = 0;
        if(start != 0){
            count++;
        }
        for(int i=start+1;i<arr.length;i++){
            if(arr[i] > arr[start]){
                break;
            }
            count++;
        }
        return count;
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
