import java.util.PriorityQueue;
import java.util.Scanner;

public class kTH_sMALLEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        int[] arr = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
            pq.add(sc.nextInt());
        }
        while(k > 1){
            pq.poll();
            k--;
        }
        System.out.println(pq.poll());
    }
}
