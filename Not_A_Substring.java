//  https://codeforces.com/problemset/problem/1860/A

import java.util.Scanner;

public class Not_A_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            StringBuilder sb = new StringBuilder();
            int n = s.length();
            if(s.equals("()")){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
                if(s.contains("((") || s.contains("))")){
                    for(int i=0; i<n; i++){
                        sb.append("()");
                    }
                }
                else {
                    for (int i = 0; i < n; i++) {
                        sb.append("(");
                    }
                    for (int i = 0; i < n; i++) {
                        sb.append(")");
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }

//    public static String genereateValidSequence(String st) {
//        StringBuilder sb = new StringBuilder();
//        int openCount = 0,closeCount=0;
//        for(int i=0;i<st.length();i++){
//            if(st.charAt(i) == '('){
//                openCount++;
//            }
//            else{
//                closeCount++;
//            }
//        }
//        for(int i=0;i<openCount;i++){
//            sb.append('(');
//        }
//        for(int i=0;i<closeCount;i++){
//            sb.append(')');
//        }
//        return sb.toString();
//    }
//
//    public static boolean isValidString(String st) {
//        int c = 0;
//        for (int i = 0; i < st.length(); i++) {
//            if(st.charAt(i) == '('){
//                c++;
//            }
//            else{
//                c--;
//            }
//            if(c < 0){
//                return false;
//            }
//        }
//        if(c == 0){
//            return true;
//        }
//        return false;
//    }
}
