import java.util.*;

public class DepthFirstSearch {

  public static void main(String[] args) {

    List<List<Integer>> listGraph = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

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

    boolean[] vis = new boolean[n];

    DFS(listGraph,0,vis);
    
  }

  public static void DFS(List<List<Integer>> graph,int src,boolean[]vis) {

    System.out.println(src);
    vis[src] = true;

    List<Integer> nbrs = graph.get(src);
    for(int nbr:nbrs){
      if(vis[nbr] == false){
        DFS(graph,nbr,vis);
      }
    }


    
  }
  
}
