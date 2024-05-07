import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int m = 1;
        int n = 1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                arr[i-1][j-1] = sc.nextInt();
                if(arr[i-1][j-1]==1){
                    m = i;
                    n = j;
                }
            }
        }
        System.out.println(Math.abs(3-m)+Math.abs(3-n));
    }
}
