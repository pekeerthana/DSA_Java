import java.util.*;

public class Sorting {

  public static void main(String args[]){

    //taking custom input from terminal
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];

    for(int i = 0;i <n;i++){
      array[i] = sc.nextInt();
    }

    //SelectionSort(n, array);
    //BubbleSort(n, array);
    InsertionSort(n, array);

  }


  public static void SelectionSort(int n, int[] inputArray)
  {
    for(int i = 0; i<n-1 ;i++){
      int minIndex = i;
      for(int j = i+1; j<n;j++){
        if(inputArray[j]<inputArray[minIndex]){
          minIndex = j;
        }
      }
      int temp = inputArray[i];
      inputArray[i] =  inputArray[minIndex];
      inputArray[minIndex] = temp;
    }

    System.out.println("Sorted array after selection sort: "+java.util.Arrays.toString(inputArray));


  }
  
  public static void BubbleSort(int n , int[] inputArray)
  {
    for(int i = n-1;i>=0;i-- ){
      for(int j = 0; j<i;j++){
        if(inputArray[j]> inputArray[j+1]){
          int temp = inputArray[j+1];
          inputArray[j+1] = inputArray[j];
          inputArray[j] = temp;
        }
      }
      System.out.println(java.util.Arrays.toString(inputArray));
    }

    System.out.println("Sorted array after bubble sort: "+java.util.Arrays.toString(inputArray));


  }
  
  public static void InsertionSort(int n , int[] inputArray)
  {

      for(int j = 1; j <n ;j++ ){
        int key = inputArray[j];
        int i = j-1;
        while( i >=0 && inputArray[i] > key){
          inputArray[i+1] = inputArray[i];
          i--;

        }
        inputArray[i+1] = key;
      }
    System.out.println("Sorted array after Insertion sort: "+java.util.Arrays.toString(inputArray));


  }
}
