import java.util.Arrays;
import java.util.Scanner;

public class Three_Threadlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int f = 0;
            int count = 0;
            for(int i=0;i<3;i++){
                if(arr[i]%arr[0] != 0){
                    f = 1;
                    break;
                }
                count += arr[i]/arr[0];
                count--;
            }
            if(count > 3 || f == 1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
