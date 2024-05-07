import java.util.Scanner;

public class Shasa_And_Drawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(minBlock(n,k));
            t--;
        }
    }

    private static int minBlock(int n, int k) {
        if(k < 4*n-3){
            if(k%2==0){
                return k/2;
            }
            else{
                return k/2+1;
            }
        }
        else if(k == 4*n-3){
            return 2*n-1;
        }
        else{
            return 2*n;
        }
    }
}
