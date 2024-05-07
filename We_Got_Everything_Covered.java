//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class We_Got_Everything_Covered {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t > 0) {
//            int n = sc.nextInt();
//            int k = sc.nextInt();
//            int len = sc.nextInt();
//            String st = sc.next();
//            int[] freq = new int[k];
//            for(char ch : st.toCharArray()){
//                freq[ch-'a']++;
//            }
//            char ch = ' ';
//            boolean f = false;
//            for(int i=0;i<k;i++){
//                if(freq[i]!=n){
//                    f = true;
//                    ch = (char)(97+i);
//                }
//            }
//            String ans = "";
//            while(n > 0){
//                ans += ch;
//                n--;
//            }
//            if(!f){
//                System.out.println("YES");
//            }
//            else{
//                System.out.println("NO");
//                System.out.println(ans);
//            }
//            t--;
//        }
//    }
//}



import java.util.Scanner;

public class We_Got_Everything_Covered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int len = sc.nextInt();
            String st = sc.next();
            int[] freq = new int[k];
            for (char ch : st.toCharArray()) {
                freq[ch - 'a']++;
            }
            boolean valid = true;
            for (int i = 0; i < k; i++) {
                if (freq[i] != n) {
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                System.out.println("NO");
                String ans = "";
                for (int i = 0; i < k; i++) {
                    for(int j=0;j<=freq[i];j++){
                        ans += (char)(97+i);
                    }
                }
                System.out.println(ans);
            } else {
                System.out.println("YES");
            }
        }
    }
}
