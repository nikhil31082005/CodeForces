import java.util.Scanner;

public class INcrease_Decrease_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
        int t = 1;
        while(t > 0){
            int n = 4;
            int[] arr = {4,2,1,2};
            int[] brr = {2,1,5,2,3};
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            int[] brr = new int[n+1];
//            for(int i=0;i<n;i++){
//                arr[i] = sc.nextInt();
//            }
//            for(int i=0;i<n+1;i++){
//                brr[i] = sc.nextInt();
//            }
            int totalCost = 0;
            for(int i = 1; i < n; i++){
                totalCost += Math.abs(arr[i] - brr[i]);
            }
            if(arr[0] > brr[0] && brr[brr.length-1] <= arr[0] && brr[brr.length-1] >= brr[0]){
                int k = 1;
                for(int i=brr[0];i<arr[0];i++){
                    if(i == brr[brr.length-1]){
                        k = 2;
                    }
                    totalCost += k;
                }
                totalCost++;
            }
            else if(arr[0] <= brr[0] && brr[brr.length-1] >= arr[0] && brr[brr.length-1] <= brr[0]){
                int k = 1;
                for(int i=arr[0];i<brr[0];i++){
                    if(i == brr[brr.length-1]){
                        k = 2;
                    }
                    totalCost += k;
                }
                totalCost++;
            }
            else{
                totalCost += Math.abs(arr[0]-brr[brr.length-1]);
                totalCost += Math.abs(arr[0]-brr[0]);
                totalCost++;
            }
            System.out.println(totalCost);
            t--;
        }
    }
}
