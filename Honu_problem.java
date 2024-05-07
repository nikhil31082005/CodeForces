import java.util.Arrays;

public class Honu_problem {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(min_speed(piles,h));
    }

    private static int min_speed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo = 0;
        int hi = piles[piles.length-1];
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isPossible(piles,mid,h)){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] piles, int speed, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed; // Calculate hours needed to eat each pile
        }
        return hours <= h;
    }

//    private static boolean isPossible(int[] piles, int mid, int h) {
//        int c = 0;
//        int eaten = piles[0];
//        for(int i=1;i<piles.length;i++){
//            if(eaten + piles[i] > mid){
//                c++;
//                eaten = piles[i];
//            }
//            else{
//                eaten += piles[i];
//            }
//            if(c > h){
//                return false;
//            }
//        }
//        return true;
//    }

    private static int sum(int[] piles) {
        int sum = 0;
        for(int i: piles){
            sum += i;
        }
        return sum;
    }
}
