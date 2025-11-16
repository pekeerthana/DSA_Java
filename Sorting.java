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

    SelectionSort(array);
  }


  public static void SelectionSort(int[] inputArray)
  {
    int n = inputArray.length;
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

  
}
