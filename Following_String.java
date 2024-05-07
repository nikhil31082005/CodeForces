import java.util.Scanner;

public class Following_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            StringBuilder sb = new StringBuilder();
            int[] freq = new int[26];
            for(int i=0;i<n;i++){
                for(int j=0;j<26;j++){
                    if(freq[j]==arr[i]){
                        sb.append((char)(97+j));
                        freq[j]++;
                        break;
                    }
                }
            }
            System.out.println(sb);
            t--;
        }
    }
}
