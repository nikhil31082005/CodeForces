import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        StringBuilder sb = new StringBuilder();

        for(char ch : st.toCharArray()){
            if(isVowel(ch)){
                continue;
            }
            else if(Character.isUpperCase(ch)){
                sb.append("." + (char)(ch + 32));
            }
            else{
                sb.append("." + ch);
            }
        }
        System.out.println(sb.toString());
    }

    private static boolean isVowel(char ch) {
        List<Character> ls = new ArrayList<>();
        ls.add('a');
        ls.add('e');
        ls.add('i');
        ls.add('o');
        ls.add('u');
        ls.add('y');
        ls.add('A');
        ls.add('E');
        ls.add('I');
        ls.add('O');
        ls.add('U');
        ls.add('Y');

        if(ls.contains(ch)){
            return true;
        }
        return false;
    }
}
