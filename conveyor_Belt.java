//A conveyor belt has packages that must be shipped from one port to another within D days.
//        The i-th package on the conveyor belt has a weight of weights[i]. Each day,
//        we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the
//        maximum weight capacity of the ship.
//        Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within K days.


import java.lang.reflect.Array;
import java.util.Arrays;

public class conveyor_Belt {
    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int k = 3;
        System.out.println(least_weigth_capacity(weights,k));
    }

    private static int least_weigth_capacity(int[] weights, int k) {
        Arrays.sort(weights);
        int lo = 0;
        int hi = 0;
        for(int i : weights){
            hi += i;
        }
        int ans = 0;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isPossible(weights,mid,k)){
                ans = mid;
                hi = mid - 1;
            }
            else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] weights,int mid, int k) {
        int initial_weight = weights[0];
        int count = 1;
        for(int i=1;i<weights.length;i++){
            if(initial_weight + weights[i] > mid){
                count++;
                initial_weight = weights[i];
            }
            else{
                initial_weight += weights[i];
            }
            if(count > k){
                return false;
            }
        }
        return true;
    }
}
