public class NoOfIsland {

  public static void main(String[] args) {

    int[][] input = new int[][]{{1,1,0,0},
                                {1,0,1,1},
                                {1,0,0,0},
                                {0,1,1,1},
                                {1,0,0,0}};
    int count = 0;
    for(int i=0;i<input.length;i++){
      for(int j=0;j<input[0].length;j++){
        while(input[i][j]==1){
          getIslandCount(input,i,j);
          count++;
        }

      }
    }
    System.out.println("No fo islands: "+count);
    
  }
  public static void getIslandCount(int[][] input,int i ,int j) {
    int r = input.length;
    int c = input[0].length;

    if(i <0 || i >= r || j<0|| j>=c || input[i][j] ==0 ){
      return;
    }
    input[i][j] = 0;

    if(i+1 < r && input[i+1][j] == 1 ){
      getIslandCount(input, i+1, j);
    }
    if(j+1 < c && input[i][j+1] == 1) {
      getIslandCount(input, i, j+1);
    }
    if(i-1 >= 0 && input[i-1][j] == 1 ){
      getIslandCount(input, i-1, j);
    }
    if(j-1 > 0 && input[i][j-1] == 1){
      getIslandCount(input, i, j-1);
    }

    
  }
  
}
