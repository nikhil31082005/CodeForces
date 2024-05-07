import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int[][] coordinates = new int[4][2];
            for(int i=0;i<4;i++){
                for(int j=0;j<2;j++){
                    coordinates[i][j] = sc.nextInt();
                }
            }
//            for(int i=0;i<4;i++){
//                for(int j=0;j<2;j++){
//                    System.out.print(coordinates[i][j] + " ");
//                }
//                System.out.println();
//            }
            int l = 0;
            int b = 0;
            for(int i=0;i<4;i++){
                for(int j=i+1;j<4;j++){
                    if(coordinates[i][0]==coordinates[j][0]){
                        l = Math.abs(coordinates[i][1]-coordinates[j][1]);
                    }
                    else if(coordinates[i][1]==coordinates[j][1]){
                        b = Math.abs(coordinates[i][0]-coordinates[j][0]);
                    }
                }
            }
            System.out.println(l*b);
            t--;
        }
    }
}
