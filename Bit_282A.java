import java.util.Scanner;

public class Bit_282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = 0;
        while(n > 0){
            String st = sc.next();
            if(st.equals("++X") || st.equals("X++")){
                X += 1;
            }
            else{
                X -= 1;
            }
            n--;
        }
        System.out.println(X);
    }
}
