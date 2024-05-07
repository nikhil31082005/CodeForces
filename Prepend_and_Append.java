import java.util.Scanner;

public class Prepend_and_Append {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int left = 0;
            int right = s.length()-1;
            int ans = 0;
            while ((left <= right)) {
                if((s.charAt(left)=='1' && s.charAt(right)=='0') || (s.charAt(right)=='1' && s.charAt(left)=='0')){
                    left++;
                    right--;
                }
                else{
                    ans = right - left + 1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
