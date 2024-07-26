import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Zoros_Network {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] arr = new int[e][2];
        for (int i = 0; i < e; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            ls.add(new ArrayList<>());
        }
        for (int[] edge : arr) {
            int u = edge[0];
            int y = edge[1];
            ls.get(u).add(y);
            ls.get(y).add(u);
        }
        HashSet<Integer> set = new HashSet<>();
        int nbr_1 = 0;
        int nbr_2 = 0;
        int last = 0;
        for (int i = 1; i <= n; i++) {
            set.add(ls.get(i).size());
            if (ls.get(i).size() == 1) {
                nbr_1 = nbr_1 + 1;
            }
            else if (ls.get(i).size() == 2) {
                nbr_2 = nbr_2 + 1;
            }
            else if (ls.get(i).size() == n - 1) {
                last = last + 1;
            }
        }
        if (set.size() == 1 && set.contains(2)) {
            System.out.println("ring topology");
        }
        else if (set.size() == 2 && nbr_1 == 2 && nbr_2 == n - 2) {
            System.out.println("bus topology");
        }
        else if (set.size() == 2 && nbr_1 == n - 1 && last == 1) {
            System.out.println("star topology");
        }
        else {
            System.out.println("unknown topology");
        }
    }

}
