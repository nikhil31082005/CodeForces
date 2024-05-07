import java.util.Scanner;

public class IQ_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = (sc.nextInt())%2;
        }
        int Oc = 0;
        int Zc = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                Oc++;
            }
            else{
                Zc++;
            }
        }
        if(Oc == 1){
            for(int i=0;i<n;i++){
                if(arr[i] == 0){
                    System.out.println(i+1);
                    break;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(arr[i] == 1){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
