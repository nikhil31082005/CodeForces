import java.util.Scanner;

public class Word_on_the_Paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String st = "";
            for(int i=0;i<8;i++){
                String s = sc.next();
                for(int j=0;j<8;j++){
                    if(s.charAt(j)!='.'){
                        st += s.charAt(j);
                    }
                }
            }
            System.out.println(st);
        }
    }
}
