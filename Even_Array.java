import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int odd = 0;
            int even = 0;
            for(int i=0;i<n;i++){
                if(arr[i]%2 != i%2){
                    if(arr[i]%2 == 1){
                        odd++;
                    }
                    else{
                        even++;
                    }
                }
            }
            if(odd==even){
                System.out.println(odd);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
