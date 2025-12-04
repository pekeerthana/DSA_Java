public class Trees {

   public static class Node {
    int data;
    Node left;
    Node right;

    Node(int val){
      this.data = val;
    }
  }
  public static void main(String[] args) {

    Node root = new Node(3);
    Node n2 = new Node(6);
    Node n3 = new Node(10);
    Node n4 = new Node(23);
    Node n5 = new Node(11);
    Node n6 = new Node(-90);
    Node n7 = new Node(1234);

    root.left  = n2;
    root.right = n4;
    n2.right = n3;
    n4.left = n5;
    n4.right = n6;
    n3.left = n7;

    int size = Inorder(root);
    System.out.print("Size of trees is: ");
    System.out.println(size);
    int sum = getNodeSum(root);
    System.out.print("Sum of node values is: ");
    System.out.println(sum);
    int max = getMax(root);
    System.out.print("Max value of tree is: ");
    System.out.println(max);

  }

  private static int Inorder(Node root){
    if(root == null){
      return 0;
    }
    int leftSize = Inorder(root.left);
    System.out.println(root.data);
    int rightSize = Inorder(root.right);
    return 1+leftSize+rightSize;

  }

  private static int getNodeSum(Node root){
    if(root == null){
      return 0;
    }

    int leftsum = getNodeSum(root.left);
    System.out.println(leftsum);
    int rightSum = getNodeSum(root.right);
    System.out.println(rightSum);

    return root.data+leftsum+rightSum ;
  }
  
  private static int getMax(Node root){
    if(root == null){
      return Integer.MIN_VALUE ;
    }
    int leftMax = getMax(root.left);
    int rightMax = getMax(root.right);

    return Math.max(Math.max(leftMax,rightMax),root.data);

  }
}
