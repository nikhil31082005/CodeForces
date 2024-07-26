import java.util.Scanner;

public class Matrix_Stabilization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int[][] arr = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if ((i == row - 1 || arr[i][j] > arr[i + 1][j]) && (i == 0 || arr[i][j] > arr[i - 1][j]) && (j == 0 || arr[i][j] > arr[i][j - 1]) &&
                            (j == col - 1 || arr[i][j] > arr[i][j + 1])) {
                        int mx = Integer.MIN_VALUE;

                        if (i != row - 1) {
                            mx = Math.max(mx, arr[i + 1][j]);
                        }
                        if (i != 0) {
                            mx = Math.max(mx, arr[i - 1][j]);
                        }
                        if (j != col - 1) {
                            mx = Math.max(mx, arr[i][j + 1]);
                        }
                        if (j != 0) {
                            mx = Math.max(mx, arr[i][j - 1]);
                        }
                        arr[i][j] = mx;
                    }
                }
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            t--;
        }
    }
}
