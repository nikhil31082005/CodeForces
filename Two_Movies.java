import java.util.Scanner;

public class Two_Movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i] = sc.nextInt();
            }

            int m1 = 0,m2 = 0, pos = 0, neg = 0;

            for(int i=0;i<n;i++){
                if(arr1[i] < arr2[i]) {
                    m2 += arr2[i];
                }
                else if(arr1[i] > arr2[i]){
                    m1 += arr1[i];
                }
                else if(arr1[i] == 1){
                    pos++;
                }
                else if(arr1[i] == -1){
                    neg++;
                }
            }


            while(pos > 0){
                if(m1 > m2){
                    m2++;
                }
                else{
                    m1++;
                }
                pos--;
            }

            while(neg > 0){
                if(m1 > m2){
                    m1--;
                }
                else{
                    m2--;
                }
                neg--;
            }

            System.out.println(Math.min(m1,m2));
            t--;
        }
    }
}
