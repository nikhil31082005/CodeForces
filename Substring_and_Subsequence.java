import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Substring_and_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String a = sc.next();
            String b = sc.next();

            long ans = a.length() + b.length();
            long r = 0;
            for(int i=0;i<b.length();i++){
                int j = i;
                for(char c: a.toCharArray()){
                    if(j < b.length() && c == b.charAt(j)){
                        j++;
                    }
                }
                r = Math.max(r,j-i);
            }
            System.out.println(ans - r);
            t--;

//            String str1 = sc.next();
//            String str2 = sc.next();
//            int k = str1.length();
//            int[] freqA = new int[26];
//            int[] freqB = new int[26];
//            for(int i=0;i<str1.length();i++){
//                freqA[str1.charAt(i) - 'str1']++;
//            }
//
//            for(int i=0;i<str2.length();i++){
//                freqB[str2.charAt(i) - 'str1']++;
//            }

//            long ans = str1.length();
//            str1 += str2;

//            int[] arr = new int[26];
//            for(int i=0;i<str1.length();i++){
//                arr[str1.charAt(i) - 'str1']++;
//            }


//            int i = 0;
//            int j = 0;
//            while(i < str1.length() && j < str2.length()){
//                if(str1.charAt(i) == str2.charAt(i)){
//                    i++;
//                    j++;
//                }
//                else{
//                    ans++;
//                    j++;
//                }
//            }

//            String str1 = sc.next();
//            String str2 = sc.next();
//            int ans = str2.length();
//            HashSet<Character> set1 = new HashSet<>();
//            for (char c : str1.toCharArray()) {
//                set1.add(c);
//            }
//
//            for (int i = 0; i < str2.length(); i++) {
//                int p = i;
//                int q = i, r = i;
//                for (int j = 0; j < str1.length(); j++) {
//                    if (str1.charAt(j) == str2.charAt(r)) {
//                        r++;
//                        if (r == str2.length()){
//                            break;
//                        }
//                    }
//                }
//
//                int count = q + str2.length() - r;
//                ans = Math.min(ans, count);
//            }
//
//            int s1 = 0;
//            for (int i = 0; i < str1.length(); i++) {
//                if (s1 == str2.length()) {
//                    break;
//                }
//                if (str1.charAt(i) == str2.charAt(s1)){
//                    s1++;
//                }
//            }
//
//            ans += str1.length();
//            if (s1 == str2.length()) {
//                ans = str1.length();
//            }
//            System.out.println(ans);
//            t--;



//            for(int i=0;i<str2.length();i++){
//                char ch = str2.charAt(i);
//                if(arr[ch-'str1'] == 0){
//                    ans++;
//                }
//                else{
//                    arr[ch-'str1']--;
//                }
//            }
//            System.out.println(ans);
//            t--;
        }
    }
}
