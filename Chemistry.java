import java.util.Scanner;

//  https://codeforces.com/problemset/problem/1883/B
public class Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            String s = sc.next();
            int[] arr = new int[26];
            for (int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            int cnt = 0;
            for (int i = 0; i < arr.length; i++) {
                cnt += arr[i]%2;
            }
            String ans = cnt <= k + 1 ? "Yes" : "No";
            System.out.println(ans);
        }
    }
}
