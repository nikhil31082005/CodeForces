import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            for(int i=1;i<3;i++){
                max = Math.max(arr[i],max);
            }
            for(int i=0;i<3;i++){
                if(max != arr[i]){
                    arr[i] = Math.abs(max-arr[i]+1);
                }
                else{
                    arr[i] = 0;
                }
            }
            System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
        }
    }
}
