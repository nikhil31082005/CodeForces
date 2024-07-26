import java.util.Scanner;

public class Soccer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            boolean ans = true;
            if((x1 > y1 && x2 > y2) || ((x1 < y1) && (y2 > x2))){
                ans = false;
            }
            if(ans){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
