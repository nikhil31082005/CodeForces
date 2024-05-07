import java.util.Scanner;

public class Vlad_And_Best_of_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String st = sc.next();
            int ca = 0;
            int cb = 0;
            for(int i=0;i<st.length();i++){
                if(st.charAt(i)=='A'){
                    ca++;
                }
                else{
                    cb++;
                }
            }
            if(ca > cb){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
            t--;
        }
    }
}
