import java.util.Scanner;

public class Target_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int[][] pointsValue = {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                    {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                    {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                    {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                    {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
                    {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
                    {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
                    {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };
            int ans = 0;
            for(int i=0;i<10;i++){
                String s = sc.next();
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)=='X'){
                        ans += pointsValue[i][j];
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
