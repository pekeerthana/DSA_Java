import java.util.*;

public class Arrays {
    
    public static void main(String[] args){
        int[] arr = {3,7,33,555};

        System.out.println(arr[03]);
        System.out.println(java.util.Arrays.toString(arr));


        int[] arr2 = new int[5];
        System.out.println(arr2.length);

        /// sum of array 
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] newArr = new int[n];
        for(int i = 0; i<n; i++){
            newArr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i =0; i < n; i++){
            sum+= newArr[i];        
        }

        System.out.println("Sum of arry elements is :"+sum);


        /// maximum value of array
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(newArr[i]> max){
                max = newArr[i];
            }
        }

        System.out.println("Maximum value in the array is : "+max);

        /// minimum value of array
        int min = Integer.MAX_VALUE;
        for(int i =0; i< n ;i++){
            if(newArr[i]< min){
                min = newArr[i];
            }
        }

        System.out.println("Minimum value in the array is: "+min);


        /// array reversing
        for(int i = 0; i< n/2 ; i++){
               int a =  newArr[i];
                newArr[i] = newArr[n-1-i];
                newArr[n-1-i] = a;
        }
        System.out.println("Reversed array is : "+ java.util.Arrays.toString(newArr));

        /// subarrays of array
        
        for (int j = 0; j < n; j++) {
            
            for (int k = j; k < n; k++) {
                for(int i = j; i<=k;i++){
                    System.out.print(newArr[i]+" ");
                }
                
                System.out.println();
            }
            
        }
        
    }

}
