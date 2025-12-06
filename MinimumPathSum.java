public class MinimumPathSum {

  public static void main(String[] args) {

    int[][] input = new int[][]{{1,3,1},
                                {1,5,1},
                                {4,2,1}};
    System.out.println(getminSum(input,0,0));

   
    
  }

  public static int getminSum(int[][] input, int i,int j) {

    if(i>=input.length || j>= input[0].length){
      return Integer.MAX_VALUE;
    }

    if(i==input.length-1 && j == input[0].length-1){
      return input[i][j];
    }

    int rightPathSum = getminSum(input, i, j+1);
    int leftPathSum = getminSum(input, i+1, j);

    int minSum = Math.min(rightPathSum, leftPathSum);

    return input[i][j]+minSum;
  
  }
  
}
