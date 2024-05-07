import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Helpful_Math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)!='+'){
                arr.add(Integer.parseInt(String.valueOf(st.charAt(i))));
            }
        }
        Collections.sort(arr);
        String s = "";
        for(int i=0;i<arr.size()-1;i++){
            s += String.valueOf(arr.get(i)) + "+";
        }
        s += String.valueOf(arr.get(arr.size()-1));
        System.out.println(s);
    }
}
