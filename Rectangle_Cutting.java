import java.util.Scanner;

public class Rectangle_Cutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int hl = b;
            int hw = a;
            if(a%2==0){
                hl = a/2;
            }
            if(b%2==0){
                hw = b/2;
            }
            if(a!=hw || b!=hl){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
