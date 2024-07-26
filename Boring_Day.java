import java.util.Scanner;

public class Boring_Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            long round = 0;
            long sum = 0;
//            int[] pre = new int[n];
//            pre[0] = arr[0];
//            for(int i=1;i<n;i++){
//                pre[i] = pre[i-1] + arr[i];
//            }
            int j = 0;
            for(int i=0;i<n;i++){
                sum = sum + arr[i];
                while (sum > r ) {
                    sum = sum - arr[j];
                    j = j + 1;
                }
                if (sum >= l && sum <= r) {
                    round = round + 1;
                    sum=0;
                    j=i+1;
                }
            }

//            int i = 0;
//            int j = 0;
//            int round2 = 0;
//            while(i < n && j < n){
//                if(pre[j]-pre[i] >= l && pre[j]-pre[i] <= r){
//                    round2++;
//                    i = j;
//                    j++;
//                }
//                else{
//                    j++;
//                }
//            }


//            System.out.println(Math.max(round,round2));
            System.out.println(round);
            t--;

//            int i = 0;
//            while(i < n){
//                sum += arr[i];
//                if(sum >= l && sum <= r){
//                    round++;
//                    sum = 0;
//                    pre = 0;
//                }
//                else if(sum-pre <= r && sum-pre >= l){
//                    round++;
//                    pre = 0;
//                    sum = 0;
//                }
//                else{
//                    pre = sum;
//                    sum = 0;
//                }
//                i++;
//            }
//            System.out.println(round);
//            t--;




//            System.out.println(round);
//            t--;
        }
    }
}
