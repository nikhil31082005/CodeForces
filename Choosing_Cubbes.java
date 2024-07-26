import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Choosing_Cubbes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int f = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            boolean canRemove = false;
            boolean cantRemove = false;


            int favEle = arr[f-1];
            Arrays.sort(arr);
            reverse(arr);


            for(int i=0;i<n;i++){
                if(arr[i] == favEle){
                    if(i <= k - 1){
                        canRemove = true;
                    }
                    else{
                        cantRemove = true;
                    }
                }
            }

            if(canRemove && cantRemove){
                System.out.println("MAYBE");
            }
            else if(canRemove){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }

    private static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
