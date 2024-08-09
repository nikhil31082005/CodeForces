import java.util.Scanner;

public class Upscalling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                if(f){
                    sb1.append("##");
                    sb2.append("..");
                    f = !f;
                }
                else{
                    sb1.append("..");
                    sb2.append("##");
                    f = !f;
                }
            }
            f = false;
            for(int i=0;i<n;i++){
                if(!f){
                    System.out.println(sb2);
                    System.out.println(sb2);
                    f = !f;
                }
                else{
                    System.out.println(sb1);
                    System.out.println(sb1);
                    f = !f;
                }
            }
            t--;
        }
    }
}
