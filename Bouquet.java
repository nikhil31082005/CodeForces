import java.util.*;

public class Bouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            HashMap<Integer,Integer> map = new HashMap<>();
            for(int ele: arr){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }

            List<Integer> ls = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for(int key: map.keySet()){
                ls.add(key);
                max = Math.max(max,key);
            }
//            Collections.sort(ls);
//            System.out.println(ls);


            for(int i=0;i<ls.size()-1;i++){
                int a = ls.get(i);
                int b = ls.get(i+1);
                if(b-a != 1){
                    continue;
                }
                int val1 = map.get(a);
                int val2 = map.get(b);

//                System.out.println(a*val1 + b*val2);

                while(a*val1 + b*val2 > m){
                    max = Math.max(max,a*val1 + b*val2);
//                    System.out.println(max);
                }
            }
            System.out.println(max);
            t--;
        }
    }
}
