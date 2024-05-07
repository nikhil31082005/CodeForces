import java.util.Scanner;

//  https://codeforces.com/problemset/problem/1380/A
public class Three_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String res = "NO";
            int idx = 0;
            for(int i=1;i<n-1;i++){
                if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                    res = "YES";
                    idx = i;
                    break;
                }
            }
            idx += 1;
            System.out.println(res.equals("YES") ? ("YES\n" + (idx-1) + " " + (idx) + " " + (idx + 1)) : "NO");
        }
    }
}
