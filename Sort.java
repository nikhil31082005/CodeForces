import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();

            int[][] freqA = new int[n + 1][26];
            int[][] freqB = new int[n + 1][26];

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < 26; j++) {
                    freqA[i][j] = freqA[i - 1][j];
                    freqB[i][j] = freqB[i - 1][j];
                }
                freqA[i][s1.charAt(i - 1) - 'a']++;
                freqB[i][s2.charAt(i - 1) - 'a']++;
            }

            String aCopy = s1, bCopy = s2;


////            int[] ch1 = new int[26];
////            int[] ch2 = new int[26];
////            for(int i=0;i<s1.length();i++){
////                ch1[s1.charAt(i) - 'a']++;
////                ch2[s2.charAt(i) - 'a']++;
////            }

            while (q > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int c = 0;

                for (int i = 0; i < 26; i++) {
                    c += Math.abs(freqA[r][i] - freqA[l - 1][i] - (freqB[r][i] - freqB[l - 1][i]));
                }

                System.out.println(c / 2);
                q--;
            }
            t--;
//            while(q > 0){
//                int l = sc.nextInt();
//                int r = sc.nextInt();
//
////                HashMap<Character,Integer> map = new HashMap<>();
////                for(int i=l-1;i<r;i++){
////                    map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
////                }
//                int[] freq = new int[26];
//                for(int i=l-1;i<r;i++){
//                    freq[s1.charAt(i)-'a']++;
//                }
//
//                for(int i=l-1;i<r;i++){
//                    if(freq[s2.charAt(i)-'a'] != 0){
//                        freq[s2.charAt(i)-'a']--;
//                    }
//                }
//
////                for(int i=l-1;i<r;i++){
////                    if(map.containsKey(s2.charAt(i))){
////                        map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
////                        if(map.get(s2.charAt(i)) == 0){
////                            map.remove(s2.charAt(i));
////                        }
////                    }
////                }
//                int c = 0;
//                for(int key: freq){
//                    c += key;
//                }
//                System.out.println(c);
//
//                q--;
//            }
//
//            t--;
        }
    }
}
