import java.util.*;

public class Recursion {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];

    for(int i = 0;i <n;i++){
      array[i] = sc.nextInt();
    }

    System.out.println("Enter the value to find it's first occurence index: ");
    int x = sc.nextInt();

    printArray(n-1,array);
    firstIndex(array, 0,x );

    System.out.println("Enter the number to get the factorial: ");
    int number = sc.nextInt();
    int factorial = 1 ;
    factorial = getFactorial(number);
    System.out.println("Factorial of "+ number +" is "+factorial);
  }

  public static void printArray(int index,int[] inputArray)
  {
    if(index <0){
      return;
    }
    System.out.println(inputArray[index]);
    printArray(index-1,inputArray);

  }
  
  public static void firstIndex(int[] inputArray,int index, int value)
  {
      if(inputArray[index] == value && index < inputArray.length){
        System.out.println("First index for occurence of " + value +" is "+index);
        return;
      }
      else
      {
        if(index+1 == inputArray.length){
          System.out.println("No index matches the value of "+ value);
          return;
        }
        firstIndex(inputArray, index+1, value); 

      }
      
  }

  public static int getFactorial(int number)
  {

    if(number == 0){
      return 1;
    }

    return number*getFactorial(number-1);
  }

}

