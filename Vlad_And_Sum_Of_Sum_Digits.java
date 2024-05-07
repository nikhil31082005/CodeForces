import java.util.Scanner;

public class Vlad_And_Sum_Of_Sum_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] digitSum = new long[1000001];
        for (int i = 1; i <= 1000000; i++) {
            digitSum[i] = digitSum[i / 10] + i % 10;
        }
        while(t > 0){
            int n = sc.nextInt();
            long sum = 0;


            for(int i=1;i<=n;i++){
                sum += digitSum[i];
            }
            System.out.println(sum);
            t--;
        }
    }
}
