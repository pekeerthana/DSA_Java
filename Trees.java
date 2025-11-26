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

    int size = Inorder(root,0);
    System.out.print("Size of trees is: ");
    System.out.println(size);

  }

  private static int Inorder(Node root,int size){
    while(root == null){
      return size;
    }
    size = Inorder(root.left,size+1);
    System.out.println(root.data);
    size = Inorder(root.right,size);
    return size;

  }


  
}
