import java.util.Scanner;

public class Grab_the_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int mihai = 0;
            int bianca = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%2==0){
                    mihai += arr[i];
                }
                else{
                    bianca += arr[i];
                }
            }
            if(mihai > bianca){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
