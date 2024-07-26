import java.util.Scanner;

public class Scale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[][] arr = new int[n][n];
            int[][] ans = new int[n/k][n/k];
            for(int i=0;i<n;i++){
                String str = sc.next();
                for(int j=0;j<str.length();j++){
                    arr[i][j] = str.charAt(j) - '0';
                }
            }

            int p = 0;

            for(int i=0;i<n;i++){
                int q = 0;
                for(int j=0;j<n;j++){
                    ans[p][q] = arr[i][j];
                    j += k-1;
                    q++;
                }
                i += k-1;
                p++;
            }

            for(int i=0;i< ans.length;i++){
                for(int j=0;j<ans[0].length;j++){
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }

            t--;
        }
    }
}
