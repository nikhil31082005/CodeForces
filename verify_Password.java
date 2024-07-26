import java.util.Scanner;

public class verify_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean check(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isLowerCase(c) && !Character.isDigit(c)) {
                return false;
            }
        }
        String letter = "";
        String digits = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits += c;
            } else {
                letter += c;
            }
        }
        String combined = digits + letter;
        if (!combined.equals(s)) {
            return false;
        }
        if (!isSorted(digits.toString())) {
            return false;
        }
        if (!isSorted(letter.toString())) {
            return false;
        }
        return true;
    }
    private static boolean isSorted(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
