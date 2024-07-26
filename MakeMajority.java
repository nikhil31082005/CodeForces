import java.util.Scanner;

public class MakeMajority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String s = sc.next();
            char[] ch = s.toCharArray();
            StringBuilder sb = new StringBuilder();

            for(int i=0;i<n-1;i++){
                if(ch[i] == '0' && ch[i+1] == '1'){
                    sb.append('0');
                }
                else if(ch[i] == '1'){
                    sb.append('1');
                }
            }
            sb.append(ch[n-1]);

            int c0 = 0;
            int c1 = 0;
            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i) == '0'){
                    c0++;
                }
                else{
                    c1++;
                }
            }
            if(c0 >= c1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
