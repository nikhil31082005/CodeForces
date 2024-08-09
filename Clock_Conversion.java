import java.util.Scanner;

public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            String time = sc.next();
            int h = Integer.parseInt(time.substring(0,2));

            String time_in_12 = "";
            if(h > 12){
                if(h > 21){
                    time_in_12 += (h-12) + time.substring(2) + " PM";
                }
                else{
                    time_in_12 += "0" + (h-12) + time.substring(2) + " PM";
                }
            }
            else if(h == 12){
                time_in_12 += 12 + time.substring(2) + " PM";
            }
            else if(h == 0){
                time_in_12 += 12 + time.substring((2)) + " AM";
            }
            else{
                if(h > 9){
                    time_in_12 += h + time.substring(2) + " AM";
                }
                else{
                    time_in_12 += "0" + h + time.substring((2)) + " AM";
                }
            }
            System.out.println(time_in_12);
            t--;
        }
    }
}
