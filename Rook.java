import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();

            char c = s.charAt(0);
            int a = Integer.parseInt(String.valueOf(s.charAt(1)));

            for(int i=1;i<=8;i++){
                if(i!=a){
                    System.out.println(c + "" + i);
                }
            }

            for(char ch='a';ch<='h';ch++){
                if(ch != c){
                    System.out.println(ch + "" + a);
                }
            }
            t--;
        }
    }
}
