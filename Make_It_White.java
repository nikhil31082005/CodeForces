import java.util.Scanner;

public class Make_It_White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String st = sc.next();
            int i = 0;
            int j = n-1;
            for(i=0;i<n;i++){
                if(st.charAt(i)=='B'){
                    break;
                }
            }
            for(j=n-1;j>=0;j--){
                if(st.charAt(j)=='B'){
                    break;
                }
            }
            System.out.println(j-i+1);
            t--;
        }
    }
}
