import java.util.Scanner;

public class Arranging_Cats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            int steps = 0;

            for(int i=0;i<n;i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                    steps++;
                    // for interchanging bits
                    if(i+1 < n && str1.charAt(i+1)!=str2.charAt(i+1) && str1.charAt(i) == str2.charAt(i + 1)){
                        i++;
                    }
                }
            }

            System.out.println(steps);
            t--;
        }
    }
}
