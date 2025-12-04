import java.util.*;

public class Graphs {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    // adjacency matrix representation code
    int[][] graph = new int[n][n];

    for(int i =0;i<m;i++){
      int u = sc.nextInt();
      int v = sc.nextInt();

      graph[u][v] = 1;
      graph[v][u] = 1;
    }

    System.out.println(graph);

    // adjacency list representation code
    List<List<Integer>> listGraph = new ArrayList<>();

    for(int i =0;i<n;i++){
      listGraph.add(new ArrayList<>());
    }

    for(int i =0;i<m;i++){
      int u = sc.nextInt();
      int v = sc.nextInt();

      listGraph.get(u).add(v);
      listGraph.get(v).add(u);
    }

    System.out.println(listGraph);
    breadthTraversel(listGraph,0);

    
  }

  public static void breadthTraversel(List<List<Integer>> adj,int src){

    Queue<Integer> queue = new ArrayDeque<>();
    int n = adj.size();


    List<Boolean> visited = new ArrayList<>();

    for(int i=0;i<n;i++){
      visited.add(false);
    }

    queue.add(0);

    while(queue.size()>0){
      int curr = queue.remove();
      System.out.println(curr);

      for(int x: adj.get(curr)){
        if(!visited.get(x)){
            visited.set(x, true) ;
            queue.add(x);
        }
      }

    }

    
  }
  
}
