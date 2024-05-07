import java.util.Scanner;

public class Dual_Trigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String st = sc.next();
            int cOne = 0;
            for(int i=0;i< st.length();i++){
                if(st.charAt(i) == '1'){
                    cOne++;
                }
            }
            if(cOne % 2 == 0 && (cOne != 2 || !st.contains("11"))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
