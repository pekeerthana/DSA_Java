import java.util.Scanner;

public class Array_Queue {

  private int[] queue;
  private int size = 0, head=0, tail = 0;


  public Array_Queue(int n){
    queue = new int[n];
  }

  public boolean add(int val){
    if(queue.length == size) return false;
    queue[tail] = val;
    size++;
    tail = (tail + 1) % queue.length;
    return true;
  }

  public int peek() {
    if (size == 0) throw new java.util.NoSuchElementException("Queue is empty");
    return queue[head];
  }

  public int pop(){
    if(queue.length ==0)  throw new java.util.NoSuchElementException("Queue is empty");
    int val = queue[head];
    head = (head + 1) % queue.length;
    size--;
    return val;
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      int idx = (head + i) % queue.length;
      System.out.print(queue[idx] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();                     // capacity

    Array_Queue queue = new Array_Queue(n);
    queue.add(1);
    queue.add(-200);
    queue.add(2);
    queue.add(40);
    queue.print();
    System.out.println(queue.peek());
    System.out.println(queue.pop());
    queue.print();

  }
  
}
