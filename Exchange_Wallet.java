import java.util.Scanner;

public class Exchange_Wallet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == b){
                if(a % 3 == 0){
                    System.out.println("Alice");
                }else{
                    System.out.println("Bob");
                }
            }
            else {
                int min = Math.min(a, b);
                int max = Math.max(a, b);
                if (2 * min < max || (a + b) % 3 != 0) {
                    System.out.println("Bob");
                }
                else {
                    System.out.println("Alice");
                }
            }
//            int count = 1;
//            while(a!=0 && b!=0){
//                if(count%2!=0){
//                    if(a > b){
//                        int temp = a;
//                        a = b;
//                        b = temp;
//                    }
//                    else{
//                        if(a==0){
//                            break;
//                        }
//                        a--;
//                    }
//                }
//                else{
//                    if(a < b){
//                        int temp = a;
//                        a = b;
//                        b = temp;
//                    }
//                    else{
//                        if(b==0){
//                            break;
//                        }
//                        b--;
//                    }
//                }
//                count++;
//            }
//            if(count%2==0){
//                System.out.println("Bob");
//            }
//            else{
//                System.out.println("Alice");
//            }
        }
    }
}
