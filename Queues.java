import java.util.*;

public class Queues {

  //Queue is fist in first out

  public static void main(String[] args) {
    Queue<Integer> queue = new ArrayDeque<>();

    queue.add(11);
    queue.add(12);
    queue.add(99);
    queue.add(21);
    queue.offer(2);

    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue.remove());
    System.out.println(queue);
    System.out.println(queue.size());

    //queue using linked list

    LinkedList<Integer> que = new LinkedList<>();
    que.addLast(2);
    que.addLast(3);
    que.addLast(43);
    que.addLast(44);

    System.out.println(que.removeFirst());
    System.out.println(que.removeFirst());

    System.out.println(que);
    reverseFirstK(queue, 2);

  }

  public static void reverseFirstK(Queue<Integer> queue,int k ){
    
    int n = queue.size();
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<k;i++){
      st.push(queue.remove());
    }

    System.out.println("Queue is"+queue);
    System.out.println("Stack is"+st);


    for(int j=0;j<k; j++){
      queue.add(st.pop());
    }

    System.out.println("Queue is"+queue);
    
    for(int i=0;i< n-k;i++){
      queue.add(queue.remove());
    }
    System.out.println("Queue is"+queue);


  }
  
}
