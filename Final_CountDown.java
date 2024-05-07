import java.util.Scanner;

public class Final_CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String str = sc.next();
            long time = 0;
            int k = 2;
            int sum = 0;
            for(int i=str.length()-2;i>=0;i--){
                if(str.charAt(i)!='0'){
                    time += (long) (str.charAt(i) - '0') *k;
                    sum += str.charAt(i)-'0';
                }
                k++;
            }
            time += Long.parseLong(str) - sum;
            System.out.println(time);
            t--;
        }
    }
}
