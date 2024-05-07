import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while(n>0){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i=0;i<3;i++){
                if(arr[i]==1){
                    count++;
                }
            }
            if(count>=2){
                c++;
            }
            n--;
        }
        System.out.println(c);
    }
}
