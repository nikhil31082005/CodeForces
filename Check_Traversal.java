import java.util.*;

public class Check_Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }

        for(int i=0;i<n-1;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            ls.get(u-1).add(v);
            ls.get(v-1).add(u);
        }
//        System.out.println(ls);
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int s = arr[0];


        int[] ans = new int[n];
        int[] ans2 = new int[n];
//        System.out.println(Arrays.toString(ans));
//        bfs(ls,ans,0,s);
//        bfsR(ls,ans2,0,s);
        bfsnew(ls,ans,arr,0,s);
        System.out.println(Arrays.toString(ans));
//        System.out.println(Arrays.toString(ans2));
        if(Arrays.equals(arr,ans)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
//    public static void bfs(ArrayList<ArrayList<Integer>> ls,int[] ans,int idx,int source){
//        Queue<Integer> q = new LinkedList<>();
//        boolean[] visited = new boolean[ls.size()];
//        visited[source] = true;
//        q.add(source);
//        while(!q.isEmpty()){
//            int curr = q.poll();
////            System.out.print(curr + " ");
//            ans[idx] = curr;
//            idx++;
//            ArrayList<Integer> nbr = ls.get(curr-1);
//            for(int ele : nbr) {
//                if (!visited[ele]) {
//                    q.add(ele);
//                    visited[ele] = true;
//                }
//            }
//        }
//    }
    public static void bfsnew(ArrayList<ArrayList<Integer>> ls,int[] ans,int[] arr,int idx,int source){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[ls.size()];
        visited[source] = true;
        q.add(source);
        while(!q.isEmpty()){
            int curr = q.poll();
//            System.out.print(curr + " ");
            ans[idx] = curr;
            idx++;
            ArrayList<Integer> nbr = ls.get(curr-1);
            if(arr[idx] == nbr.get(0)){

                for(int ele : nbr) {
                    if (!visited[ele]) {
                        q.add(ele);
                        visited[ele] = true;
                    }
                }
            }
            else{

                for(int i=nbr.size()-1;i>=0;i--){
                int ele = nbr.get(i);
                if (!visited[ele]) {
                    q.add(ele);
                    visited[ele] = true;
                }
            }
            }
        }
    }
//    public static void bfsR(ArrayList<ArrayList<Integer>> ls,int[] ans,int idx,int source){
//        Queue<Integer> q = new LinkedList<>();
//        boolean[] visited = new boolean[ls.size()];
//        visited[source] = true;
//        q.add(source);
//        while(!q.isEmpty()){
//            int curr = q.poll();
////            System.out.print(curr + " ");
//            ans[idx] = curr;
//            idx++;
//            ArrayList<Integer> nbr = ls.get(curr-1);
//            for(int i=nbr.size()-1;i>=0;i--){
//                int ele = nbr.get(i);
//                if (!visited[ele]) {
//                    q.add(ele);
//                    visited[ele] = true;
//                }
//            }
//        }
//    }
}