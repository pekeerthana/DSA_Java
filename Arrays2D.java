import java.util.*;

public class Arrays2D{

    public static void main(String args[]){

        //initialization
        int[][] arr = new int[5][6];

        arr[0][4] = 5;

        System.out.println(arr[0][4]);
        System.out.println(arr[0][0]);

        //row count
        System.out.println("rows of the 2d array is: "+arr.length);

        //col count
        System.out.println("Columns of 2d array is: "+arr[0].length);

        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int[][] arr2 ={{1,2,3},{-1,-10,20},{40,999,90}};

        //custom input from terminal
        // Scanner sc = new Scanner(System.in);
        // int[] size =new int[2];
        // for(int i=0;i<2;i++){
        //     size[i] = sc.nextInt();
            
        // }

        // System.out.println("Transpose of arr2 is: "+java.util.Arrays.deepToString(Transpose(arr2)));

        //90 degree rotation clockwise of 2d array
        int[][] transpose_arr = Transpose(arr2);
        int n = transpose_arr.length;
        for (int[] row : transpose_arr) {
            System.out.println(java.util.Arrays.toString(row));
            for(int i = 0; i< row.length/2 ; i++){
               int a =  row[i];
                row[i] = row[n-1-i];
                row[n-1-i] = a;
            }
        }
        System.out.println("Array after 90 degree : "+ java.util.Arrays.deepToString(transpose_arr));
        
    }

    //Transpose of matrix
    public static int[][] Transpose(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<i; j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        return arr;
    }
    
}