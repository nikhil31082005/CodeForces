import java.util.Scanner;

public class Ten_Words_of_Wisdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int size=0,quality=0;
            for(int i=1;i<=n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a <= 10 && b >= quality){
                    quality = b;
                    size=i;
                }
            }
            System.out.println(size);
        }
    }
}
