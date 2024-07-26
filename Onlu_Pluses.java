import java.util.PriorityQueue;
import java.util.Scanner;

public class Onlu_Pluses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0;i<3;i++){
                pq.add(sc.nextInt());
            }
            for(int i=0;i<5;i++){
                int a = pq.poll();
                a++;
                pq.add(a);
            }
            long ans = 1;
            while(!pq.isEmpty()){
                ans *= pq.poll();
            }
            System.out.println(ans);
            t--;
        }
    }
}
