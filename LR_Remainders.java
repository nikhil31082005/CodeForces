import java.util.Scanner;

public class LR_Remainders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            long prod = 1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                prod = (prod * arr[i]); // Update prod with the product modulo m
            }
            String st = sc.next();
            int j = n-1;
            int k = 0;
            for(int i = 0; i < n; i++){
                System.out.print(prod%m + " "); // Print the current product modulo m
                if(st.charAt(i) == 'L'){
                    prod = prod / arr[k]; // Remove the leftmost element
                    k++;
                } else {
                    prod = prod / arr[j]; // Remove the rightmost element
                    j--;
                }
            }
            System.out.println();
            t--;


//            int[] ans = new int[n];
//            int i = 0;
//            int j = n-1;
//            int k = 0;
//            while(i<=j){
//                ans[k] = (int)prod%m;
//                if(st.charAt(k)=='L'){
//                    if(arr[i]==0){
//                        i++;
//                    }
//                    else{
//                        prod = prod/arr[i];
//                        i++;
//                    }
//                }
//                else{
//                    if(arr[j]==0){
//                        j--;
//                    }
//                    else{
//                        prod = prod/arr[j];
//                        j--;
//                    }
//                }
//                k++;
//            }
//            for(int ele : ans){
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//            t--;
        }
    }
}
