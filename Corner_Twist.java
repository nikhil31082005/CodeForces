import java.util.Scanner;

public class Corner_Twist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++){
                String s = sc.next();
                for(int j=0;j<m;j++){
                    arr[i][j] = s.charAt(j)-'0';
                }
            }
            int[][] brr = new int[n][m];
            for(int i=0;i<n;i++){
                String s = sc.next();
                for(int j=0;j<m;j++){
                    brr[i][j] = s.charAt(j)-'0';
                }
            }

            boolean f = true;

            for(int i=0;i<n;i++){
                int sum1 = 0;
                int sum2 = 0;
                for(int j=0;j<m;j++){
                    sum1 += arr[i][j];
                    sum2 += brr[i][j];
                }
                if((sum1%3) != (sum2%3)){
                    f = false;
                    break;
                }
            }
            for (int j = 0; j < m; j++) {
                int sum1 = 0, sum2 = 0;
                for (int i = 0; i < n; i++) {
                    sum1 += arr[i][j];
                    sum2 += brr[i][j];
                }
                if ((sum1 % 3) != (sum2 % 3)) {
                    f = false;
                    break;
                }
            }

            if(f){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
