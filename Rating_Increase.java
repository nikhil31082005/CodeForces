import java.util.Scanner;

public class Rating_Increase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String s = sc.next();
            boolean f = false;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i) == '0'){
                    continue;
                }
                int a = Math.abs(Integer.parseInt(s.substring(0,i)));
                int b = Math.abs(Integer.parseInt(s.substring(i)));

                if(b > a){
                    System.out.println(s.substring(0,i) + " " + s.substring(i));
                    f = true;
                    break;
                }
            }
            if(!f){
                System.out.println("-1");
            }
            t--;
        }
    }
}
