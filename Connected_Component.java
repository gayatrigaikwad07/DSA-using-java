import java.util.*;
public class Connected_Component {
    
    static class Edge{
        int src;
        int dest;
        int wt;
        
    
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        
        }
    }

    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
    
            // for 1
        graph[1].add(new Edge(1, 0, 1 ));
        graph[1].add(new Edge(1, 2,1));
        graph[1].add(new Edge(1, 3, 1));
    
            // for 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4,1));
    
            // 3 vertex
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 2, 1));
    
            // 4 vertex
        graph[4].add(new Edge(4, 2, 1));
    }

    public static void bfs(ArrayList<Edge> [] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                bfsUtil(graph, vis);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]){
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!vis[curr]){
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
                dfsUtil(graph, i, vis);
                System.out.println();
        }
                
        
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, int boolean vis[]){
        System.out.print(curr + " ");
        vis[curr] = true;

        for(int i =0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get[i];
            if(!sis[curr]){
               dfs(graph, e.dest, vis); 

            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean vis){
        if(src == dest){
            return true;
        }
        for(int i=0; i<graph[src].size(); i++){
            Edge e= graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, src, dest, vis)){
                return true;

            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        //dfs(graph, 0, new boolean[V] );
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
    
       
    }
        
}
    


