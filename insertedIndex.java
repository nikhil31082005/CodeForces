public class insertedIndex {
    public static void main(String[] args) {
        int[] arr = {1,5,9,11,16,19,26};
        int target = 27;
        System.out.println(find_Index(arr,target));
    }

    public static int find_Index(int[] arr, int target) {
        if(arr[arr.length-1] < target) return arr.length;
        if(arr[0] > target) return 0;
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target ){
                if(arr[mid+1] > target){
                    return mid+1;
                }
                else{
                    lo = mid + 1;
                }
            }
            else{
                if(arr[mid-1] < target){
                    return mid;
                }
                else{
                    hi = mid - 1;
                }
            }
        }

        return -1;
    }
}
