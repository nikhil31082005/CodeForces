import java.util.Scanner;

public class Vlad_And_Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            char[][] arr = new char[n][n];
            for(int i=0;i<n;i++){
                String a = sc.next();
                for(int j=0;j<a.length();j++){
                    arr[i][j] = a.charAt(j);
                }
            }
            System.out.println(shape(arr));
            t--;
        }
    }

    private static String shape(char[][] arr) {
        int ca = 0;
        int cb = 0;
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == '1'){
                    cb++;
                }
            }
            if(cb > 0){
                break;
            }
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if(arr[i][j] == '1'){
                    ca++;
                }
            }
            if(ca > 0){
                break;
            }
        }

        if(ca==1 || cb == 1) {
            return "TRIANGLE";
        }
        return "SQUARE";
    }
}
