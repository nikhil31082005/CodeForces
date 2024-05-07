import java.util.Scanner;

public class Following_Direction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String st = sc.next();
            int x = 1;
            int y = 1;
            int x1 = 0;
            int y1 = 0;
            boolean ans = false;
            for(int i=0;i<n;i++){
                if(st.charAt(i)=='U'){
                    y1++;
                }
                else if(st.charAt(i)=='D'){
                    y1--;
                }
                else if(st.charAt(i)=='R'){
                    x1++;
                }
                else{
                    x1--;
                }
                if(x1==x && y1==y){
                    ans = true;
                    break;
                }
            }
            if(ans){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
