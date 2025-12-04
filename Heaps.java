import java.util.*;

public class Heaps {

  public static void main(String[] args) {
    //PriorityQueue<Integer> pq = new PriorityQueue<>();

    // to change the priority order
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


    pq.add(11);
    pq.add(23);
    pq.add(1);
    pq.add(11);
    pq.add(3);

    System.out.println(pq);

    System.out.println(pq.remove());
    System.out.println(pq.remove());
    System.out.println(pq.peek());
    System.out.println(pq.size());

    int[] arr = new int[]{1,0,44,33,2 ,10,-4};

    getKthLarge(arr,5);

  }

  public static void getKthLarge(int[] arr,int k){

    PriorityQueue<Integer> result = new PriorityQueue<>();

    int i = 0;
    while(i<k){
      result.add(arr[i]);
      i++;
    }

    for(int j = k; j < arr.length;j++){
      if( result.peek() < arr[j]){
        result.remove();
        result.add(arr[j]);

      }
    }

    System.out.println(result);

  }
  
}
