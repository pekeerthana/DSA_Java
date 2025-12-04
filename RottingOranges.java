import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {

  public static void main(String[] args) {

    int[][] inputArray = {{ 0,2,1,0},
                          {1,0,1,1},
                          {1,1,2,0},
                          {1,1,1,1}};

    getTimeForRotting(inputArray);
    
  }
  public static void getTimeForRotting(int[][] arr){

    Queue<int[]> queue = new ArrayDeque<>();

    for(int i =0;i<arr.length;i++){
      for(int j =0;j<arr[0].length;j++){

        if(arr[i][j] ==2){
          int[] temp = {i,j,0};
          queue.add(temp);
        }
      }
    }
        int result = 0;
        while(queue.size() >0){
          int[] curr = queue.remove();
          
          int r = curr[0];
          int c = curr[1];
          int time = curr[2];
          result = time;

          if(r+1 < arr.length && arr[r+1][c]==1){
            int[] temp = {r+1,c,time+1};
            queue.add(temp);
            arr[r+1][c] = 2;
          }

          if(c+1 < arr[0].length && arr[r][c+1] ==1){
             int[] temp = {r,c+1,time+1};
            queue.add(temp);
            arr[r][c+1] = 2;

          }
          
          if(r-1 >= 0 && arr[r-1][c]==1){
            int[] temp = {r-1,c,time+1};
            queue.add(temp);
            arr[r-1][c] = 2;
          }

          if(c-1 >= 0 && arr[r][c-1] ==1){
            int[] temp = {r,c-1,time+1};
            queue.add(temp);
            arr[r][c-1] = 2;
          }
      
        }

        

        for(int i =0;i<arr.length;i++){
        for(int j =0;j<arr[0].length;j++){
        if(arr[i][j] == 1){
          result = -1;
        }
      }   
    }

    System.out.println("Total time taken to rot oranges is "+result);
  }
  
}
