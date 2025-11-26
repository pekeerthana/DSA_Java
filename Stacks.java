import java.util.*;
public class Stacks {

  // stack is first in last out

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();

    //add
    st.push(1);
    st.push(10);
    st.push(33);
    st.push(34);
    st.push(99);
    st.push(23);

    System.out.println(st);

    System.out.println(st.peek());

    st.pop();
    System.out.println(st);

    System.out.println(st.size());

      //stack using linkedlist
      LinkedList<Integer> stack = new LinkedList<>();
      stack.add(1);
      stack.add(74);
      stack.add(99);

      stack.addFirst(20);
      stack.addFirst(34);
      stack.addFirst(11);


      System.out.println(stack.removeFirst());
      System.out.println(stack.removeFirst());
      System.out.println(stack);

  }







  
}
