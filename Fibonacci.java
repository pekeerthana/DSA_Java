import java.util.*;

public class Fibonacci {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] visisted= new int[n+1];
    
    // Method 1: Simple Recursion
    long start1 = System.nanoTime();
    int result1 = getFibonacci(n);
    long end1 = System.nanoTime();
    System.out.println("Result (Simple Recursion): " + result1);
    System.out.println("Time taken: " + (end1 - start1) / 1_000_000.0 + " ms\n");

    // Method 2: Top-Down (Memoization)
    long start2 = System.nanoTime();
    int result2 = getFibonacciTD(n, visisted);
    long end2 = System.nanoTime();
    System.out.println("Result (Top-Down): " + result2);
    System.out.println("Time taken: " + (end2 - start2) / 1_000_000.0 + " ms\n");

    // Method 3: Bottom-Up (Tabulation)
    long start3 = System.nanoTime();
    int result3 = getFibonacciBU(n);
    long end3 = System.nanoTime();
    System.out.println("Result (Bottom-Up): " + result3);
    System.out.println("Time taken: " + (end3 - start3) / 1_000_000.0 + " ms\n");

  }
  
  public static int getFibonacci(int n) {
    if(n ==0 || n==1){
      return n;
    }
    else{
      int result = getFibonacci(n-1)+ getFibonacci(n-2);
      return result;
    }
  }

  public static int getFibonacciTD(int n, int[] visisted){
      
    if(n ==0 || n==1){
      return n;
    }
    else{
      if(visisted[n] !=0){
        return visisted[n];
      }
      int nm1 = getFibonacciTD(n-1,visisted);
      int nm2 = getFibonacciTD(n-2,visisted);
      int result = nm1 + nm2;
      visisted[n] = result;
      return result;
    }
    
  }

  public static int getFibonacciBU(int n){

    int[] visisted= new int[n+1];
    visisted[0] = 0;
    visisted[1] = 1;

    for(int i = 2;i< n+1;i++){

      visisted[i] = visisted[i-1]+ visisted[i-2];

    }

    return visisted[n];

  }

}