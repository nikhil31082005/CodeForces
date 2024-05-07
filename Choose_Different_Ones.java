//import java.util.*;
//
//public class Choose_Different_Ones {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t > 0){
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int k = sc.nextInt();
//            int[] arr = new int[n];
//            int[] brr = new int[m];
//            for(int i=0;i<n;i++){
//                arr[i] = sc.nextInt();
//            }
//            for(int i=0;i<m;i++){
//                brr[i] = sc.nextInt();
//            }
//            System.out.println(ans(n,m,arr,brr,k));
//            t--;
//        }
//    }
//
//    private static boolean ans(int n, int m, int[] arr, int[] brr, int k) {
//        Set<Integer> a = new HashSet<>();
//        int c = 0;
//        Arrays.sort(arr);
//        for(int i=0;i<n;i++){
//            if(arr[i]<=k){
//                a.add(arr[i]);
//                c++;
//            }
//        }
//        if(c<k/2){
//            return false;
//        }
//        c = 0;
//        for(int i=0;i<m;i++){
//            if(brr[i]<=k){
//                a.add(brr[i]);
//                c++;
//            }
//        }
//        if(c<k/2){
//            return false;
//        }
//
//        for(int i=1;i<=k;i++){
//            if(!a.contains(i)){
//                return false;
//            }
//        }
//        return true;
//    }
//}



import java.util.*;
public class Choose_Different_Ones
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int[]arr=new int[n];
            int[]brr=new int[m];
            HashSet<Integer>pahla=new HashSet<>();
            HashSet<Integer>dooshra=new HashSet<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                pahla.add(arr[i]);
            }
            for(int i=0;i<m;i++){
                brr[i]=sc.nextInt();
                dooshra.add(brr[i]);
            }
            int count1=k/2;
            int count2=k/2;
            for(int i=1;i<=k;i++){
                if(pahla.contains(i)&&!dooshra.contains(i)){
                    count1=count1-1;
                }
                if(!pahla.contains(i)&&dooshra.contains(i)){
                    count2=count2-1;
                }
            }
            for(int i=1;i<=k;i++){
                if(pahla.contains(i)&&dooshra.contains(i)){
                    if(count1>count2){
                        count1=count1-1;
                    }
                    else{
                        count2=count2-1;
                    }
                }
            }
            if(count1==0 && count2==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}