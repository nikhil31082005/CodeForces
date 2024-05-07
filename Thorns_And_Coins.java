import java.util.Scanner;

public class Thorns_And_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while(t > 0){
            int n = sc.nextInt();
            String st = sc.next();
            int c = 0;
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='@'){
                    c++;
                }
                else if(st.charAt(i)=='.'){
                    continue;
                }
                else if(st.charAt(i)=='*'){
                    if(i!=st.length()-1 && st.charAt(i+1)=='*'){
                        break;
                    }
                }
            }
            System.out.println(c);
            t--;
        }
    }
}
