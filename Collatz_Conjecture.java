import java.util.Scanner;

public class Collatz_Conjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int k = sc.nextInt();

            long remainder = num1 % num2;
            if (num2 - remainder == num2) {
                remainder = 0;
            } else {
                remainder = num2 - remainder;
            }

            long ptanhi = num2 - num1 % num2;
            boolean f = false;
            while (k >= ptanhi) {
                if (num1 == 1) {
                    k %= ptanhi;
                    num1 += k;
                    f = true;
                    System.out.println(num1);
                    t--;
                    continue;
                }

                k -= ptanhi;
                num1 += ptanhi;

                if (remainder != 0) {
                    remainder = num2 - remainder;
                }

                while (num1 % num2 == 0) {
                    num1 /= num2;
                }
                ptanhi = num2 - num1 % num2;
            }
            if(f){
                continue;
            }

            System.out.println(num1 + k);
//            System.out.println(min);
            t--;
        }
    }

//    private static long finalValue(long num1, long num2, long k) {
//
//    }


//    private static int solve(int x, int y, int k) {



//        while(k > 0){
//            int rem = x % y;
//            if(y - rem > k){
//                return x + k;
//            }
//            else{
//                x += y - rem;
//                k -= y - rem;
//                while( x%y == 0){
//                    x /= y;
//                }
//            }
//        }
//        return x;

//        while(k > 0){
//            int rem = x%y;
//            if(y-rem > k){
//                return x + k;
//            }
//            else{
//                x += rem;
////                x /= y;
//                k -= rem;
//            }
//            while(x%y == 0){
//                x /= y;
//            }
//        }
//        return x;
//    }
}
