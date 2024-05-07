import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Find_The_Different_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int nq = sc.nextInt();
            while(nq > 0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                print(arr,l,r);
                nq--;
            }
            t--;
        }
    }

    private static void print(int[] arr, int l, int r) {

//        for(int i=l-1;i<r;i++){
//            for(int j=i+1;j<r;j++){
//                if(arr[i]!=arr[j]){
//                    System.out.println((i+1) + " " + (j+1));
//                    return;
//                }
//            }
//        }
//        System.out.println("-1 -1");
    }
}
