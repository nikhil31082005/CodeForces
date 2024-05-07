import java.util.Scanner;

public class Way_to_long_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            String st = sc.next();
            if(st.length()>10){
                String st1 = st.substring(1,st.length()-1);
                String len = String.valueOf(st1.length());
                System.out.println(st.charAt(0) + len + st.charAt(st.length()-1));
            }
            else{
                System.out.println(st);
            }
            n--;
        }
    }
}
