import java.util.Scanner;

public class CHat_Room {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String ans = "hello";
        int j = 0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i) == ans.charAt(j)) {
                j++;
                if(j > 4){
                    break;
                }
            }
        }
        if(j == 5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
