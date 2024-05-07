import java.util.Scanner;

public class Recoving_A_Small_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            System.out.println(make(n));

            t--;
        }
    }
    public static String make(int n){
        StringBuilder sb = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++){
            for (char ch1 = 'a'; ch1 <= 'z'; ch1++){
                for(char ch2 = 'a'; ch2 <= 'z'; ch2++){
                    if((int)ch-96 + (int)ch1 -96 + (int)ch2-96 == n){
                        sb.append(ch);
                        sb.append(ch1);
                        sb.append(ch2);
                        return sb.toString();
                    }
                }
            }
        }
        return "";
    }
}
