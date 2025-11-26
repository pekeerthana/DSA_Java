public class LinkedLists 
{

  public static class Node {
    int data;
    Node next;

    Node(int val){
      this.data = val;
    }
  }
  public static void main(String[] args) 
  {
    Node n1 = new Node(3);
    Node n2 = new Node(6);
    Node n3 = new Node(10);
    n1.next  = n2;
    n2.next = n3;

    //adding a new data before first element
    Node result_1 = addFirst(n1, 60);
    printList(result_1);
    Node result_2 = addLast(n1, 23);
    printList(result_2);
    Node result_3 = addAt(n1, 99, 5);
    printList(result_3);
    Node result_4 = removeFirst(result_3);
    printList(result_4);
    Node result_5 = removeLast(result_3);
    printList(result_5);
    Node result_6 = removeAt(result_2, 2);
    printList(result_6);
    isKPresent(result_2,22);
    isKPresent(result_2,6);

  }

  public static Node addFirst(Node head,int val)
  {
    Node n = new Node(val);
    n.next = head;
    return n;
  }

  public static Node addLast(Node head, int val) {
    Node n = new Node(val);

    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = n;
    return head;
  }

  public static Node addAt(Node head,int val,int index){

    Node n = new Node(val);

    if(index == 0){
      n.next = head;
      return n;
    }
    
    Node curr = head;
    int i = 0;
    while(curr != null){
      if(i == index-1){
        n.next = curr.next;
        curr.next = n;
        break;
      }
      i++;
      curr = curr.next;
    }
     return head;

  }

  public static Node removeFirst(Node head){
    if(head == null){
      return null;
    }

    head = head.next;
    return head;
  }

  public static Node removeLast(Node head){

    Node curr = head.next;
    while(curr.next.next != null){
    curr = curr.next;
    }
    curr.next = null;
    
    return head;
  }

  public static Node removeAt(Node head,int index){

    if(index == 0) {
        return (head != null) ? head.next : null;
    }
    else if(index < 0){
      return head;
    }
    Node curr = head;
    int i = 0;

    while(curr.next != null && curr!= null){

      if(i == index-1){
        curr.next = curr.next.next;
        break;
      }
      i++;
      curr = curr.next;
    }


    return head;
  }

  public static void isKPresent(Node head,int K){

    Node temp = head;
    boolean isKPresent = false;
    while(temp != null){
      if(temp.data == K){
        isKPresent = true;
        break;
      }
      else{
        isKPresent = false;
      }
      temp = temp.next;
    }

    if(isKPresent) System.out.println(K+" is present in linkedlist");
    else  System.out.println(K+" is not present in linkedlist");

  }

  public static void getMidVal(Node head){

    int n = getLength(head);
    if(n%2==0){
      
    }



  }

  public static int getLength(Node head){
    Node curr = head;
    int i = 0;
    while (curr != null) {
      i= i+1;
      curr = curr.next;
    }
    return i;
  }
  public static void printList(Node head) {
    Node curr = head;
    int i = 0;
    while (curr != null) {
      System.out.print(curr.data);
      i= i+1;
      if (curr.next != null) System.out.print(" -> ");
      curr = curr.next;
    }
    System.out.println(" -> null");
    System.out.println("Length of linked list is: "+i);
  }
}

