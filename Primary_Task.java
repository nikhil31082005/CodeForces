import java.util.Scanner;

public class Primary_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String str = sc.next();

            if(str.length() < 3){
                System.out.println("NO");
            }
            else{
                if(!str.substring(0,2).equals("10")){
                    System.out.println("NO");
                }
                else{
                    if(str.charAt(2) == '0'){
                        System.out.println("NO");
                    }
                    else{
                        int x = Integer.parseInt(str.substring(2));
                        if(x >= 2){
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }
            }
            t--;
        }
    }
}
