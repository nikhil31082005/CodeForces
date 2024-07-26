//import java.util.*;
//
//public class KLCASolution{
//
//    // Function to create a binary tree from array representation
//    public static Node createTree(int[] a, int i) {
//        if (i >= a.length || a[i] == -1) return null;
//
//        Node newNode = new Node(a[i]);
//        newNode.left = createTree(a, 2 * i + 1);
//        newNode.right = createTree(a, 2 * i + 2);
//
//        return newNode;
//    }
//
//    // Function to find k-th ancestor of lowest common ancestor of nodes p and q
//    public static int findKLCA(Node root, int p, int q, int k) {
//        // implement your code here
//        List<List<Node>> ls = new ArrayList<>();
//
//        lowestCommon(root,p,ls,new ArrayList<>());
//        lowestCommon(root,q,ls,new ArrayList<>());
//
//        int l1 = ls.get(0).size();
//        int l2 = ls.get(1).size();
//        int i = 0;
//        int j = 0;
//        List<Integer> ans = new ArrayList<>();
//        while(i < l1 && j < l2){
//            if(ls.get(0).get(i) != ls.get(1).get(j)){
//                break;
//            }
//            else{
//                ans.add(ls.get(0).get(i).data);
//                i++;
//                j++;
//            }
//        }
////        System.out.println(ans);
//        if(ans.size() - k - 1 < 0){
//            return -1;
//        }
//        return ans.get(ans.size() - k - 1);
//    }
//
//     public static void lowestCommon(Node root, int p,List<List<Node>>ls,List<Node> tempList){
//         if(root==null){
//             return;
//         }
//         if(root.data==p){
//             tempList.add(root);
//             ls.add(new ArrayList<>(tempList));
//         }
//         tempList.add(root);
//         lowestCommon(root.left,p,ls,tempList);
//         lowestCommon(root.right,p,ls,tempList);
//         tempList.remove(tempList.size()-1);
//     }
//
//
//    // Main function
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Read n, m and k
//        int n = sc.nextInt(); // Size of array a
//        int m = sc.nextInt(); // Number of pairs (p, q)
//        int k = sc.nextInt();
//
//        // Read array a
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        // Read pairs (p, q)
//        int[][] pairs = new int[m][2];
//        for (int i = 0; i < m; i++) {
//            pairs[i][0] = sc.nextInt();
//            pairs[i][1] = sc.nextInt();
//        }
//
//        sc.close();
//
//        // Create the binary tree
//        Node root = createTree(a, 0);
//
//        // Find k-th ancestor of lowest common ancestor for each pair (p, q)
//        for (int i = 0; i < m; i++) {
//            int p = pairs[i][0];
//            int q = pairs[i][1];
//            int lca = findKLCA(root, p, q, k);
//            System.out.println(lca);
//        }
//    }
//}
//
//class Node {
//    int data;
//    Node left, right;
//
//    Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}