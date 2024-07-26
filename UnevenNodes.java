import java.util.*;

public class UnevenNodes{
    /**
     *
     * @param root      Root Node
     * @param k         Minimum difference in height of subtrees for uneven node
     * @return          Number of uneven nodes
     */
    public static int countUneven(Node root, int k){
        num index = new num();
        index.value = 0;
        count(root, k, index);
        return index.value;
    }
    public static int count(Node root, int k, num c){
        if(root == null){
            return 0;
        }
        int left = count(root.left, k, c);
        int right = count(root.right, k, c);
        int x = left-right;
        if(x<0){
            x = -1*x;
        }
        if(x>=k){
            c.value++;
        }
        if(left>right){
            return left+1;
        }else{
            return right+1;
        }
    }
    public static Node createTree(int a[], int i){
        if(i >= a.length || a[i] == -1) return null;
        Node newnode = new Node(a[i]);
        newnode.left = createTree(a, 2*i+1);
        newnode.right = createTree(a, 2*i+2);
        return newnode;
    }
    public static void main(String args[]){
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int a[] = new int[n];
        // read values
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        sc.close();
        Node root = createTree(a, 0);

        System.out.println(countUneven(root, k));
    }
}

class num{
    int value;
}
class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        left = right = null;
    }
};

//import java.util.*;
//
//public class UnevenNodes{
//    /**
//     *
//     * @param root      Root Node
//     * @param k         Minimum difference in height of subtrees for uneven node
//     * @return          Number of uneven nodes
//     */
//    public static int countUneven(Node root, int k){
//
//        return count(root,k);
//
//    }
//
//
//    private static int count(Node root, int k) {
//        if(root == null){
//            return 0;
//        }
//        int count = 0;
//        int left = countHeightLeft(root.left,k,0);
//        int right = countHeightRight(root.right,k,0);
//        if(Math.abs(left - right) >= k){
//            count++;
//        }
//        count += count(root.left,k) + count(root.right,k);
//        return count;
//    }
//    private static int countHeightRight(Node root, int k, int c) {
//        if(root == null){
//            return 0;
//        }
//        return 1 +  countHeightRight(root.right,k,c);
//    }
//
//    private static int countHeightLeft(Node root, int k, int c) {
//        if(root == null){
//            return 0;
//        }
//        return 1 +  countHeightLeft(root.left,k,c);
//    }
//
//    public static Node createTree(int a[], int i){
//        if(i >= a.length || a[i] == -1) return null;
//        Node newnode = new Node(a[i]);
//        newnode.left = createTree(a, 2*i+1);
//        newnode.right = createTree(a, 2*i+2);
//        return newnode;
//    }
//    public static void main(String args[]){
//        int n, k;
//        Scanner sc = new Scanner(System.in);
////        n = sc.nextInt();
////        k = sc.nextInt();
////        int a[] = new int[n];
////        // read values
////        for(int i=0;i<n;i++){
////            a[i] = sc.nextInt();
////        }
//
//        n = 7;
//        k = 1;
//        int[] a = {4,-1,5};
//
//        sc.close();
//        Node root = createTree(a, 0);
//
//        System.out.println(countUneven(root, k));
//    }
//}
//
//class Node {
//    int data;
//    Node left, right;
//    Node(int data)
//    {
//        this.data = data;
//        left = right = null;
//    }
//};