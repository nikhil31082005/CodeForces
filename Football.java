import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        if(isDangerous(st)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean isDangerous(String st) {
        int c = 1;
        for(int i=1;i<st.length();i++){
            if(st.charAt(i)==st.charAt(i-1)){
                c++;
                if(c >= 7) return true;
            }
            else{
                c = 1;
            }
        }
        return false;
    }
}
