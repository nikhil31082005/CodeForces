import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coin_Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            List<Character> ls = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ls.add(str.charAt(i));
            }
            if(isWin(ls)){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }

    private static boolean isWin(List<Character> ls) {
        int n = ls.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ls.size(); j++) {
                if(ls.get(j) == 'U' && ls.size() <= 2){
                    ls.remove(j);
                    count++;
                    break;
                }
                if (ls.get(j) == 'U') {
                    if (ls.get((j - 1 + ls.size()) % ls.size()) == 'U') {
                        ls.set(j - 1 + ls.size(), 'D');
                    } else {
                        ls.set((j - 1 + ls.size()) % ls.size(), 'U');
                    }
                    if (ls.get((j + 1) % ls.size()) == 'U') {
                        ls.set((j + 1) % ls.size(), 'D');
                    } else {
                        ls.set((j + 1) % ls.size(), 'U');
                    }
                    count++;
                    ls.remove(j);
                    break;
                }
            }
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
