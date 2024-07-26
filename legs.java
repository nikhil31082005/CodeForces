import java.util.Scanner;

public class legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int c = 0;
            c += n/4;
            n %= 4;
            if(n != 0){
                c += n/2;
            }
            System.out.println(c);
            t--;
        }
    }
}
