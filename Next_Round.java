import java.util.Scanner;

public class Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(arr[i] >= arr[k] && arr[i] > 0){
                c++;
            }
        }
        System.out.println(c);
    }
}
