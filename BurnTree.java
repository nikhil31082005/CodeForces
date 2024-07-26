import java.util.*;

public class BurnTree {
    public static long findTemperature(Node root, int[] initialVertexValues) {

        // implement your code here
        return 5;
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

        int b[] = new int[k];
        for(int i=0;i<k;i++){
            b[i] = sc.nextInt();
        }

        sc.close();
        Node root = createTree(a, 0);

        System.out.println(findTemperature(root, b));
    }
}

//class Node {
//    int data;
//    Node left, right;
//    Node(int data)
//    {
//        this.data = data;
//        left = right = null;
//    }
//};