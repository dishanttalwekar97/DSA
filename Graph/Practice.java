import java.util.*;
public class Practice {

    static class Edge{
        int source;
        int destination;
        int weighet;

        public Edge(int s,int d,int w){
            this.source = d;
            this.destination = d;
            this.weighet = w;
        }
    }

    public static void bfs(ArrayList<Edge> []graph){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]){
                System.out.println(curr + " ");
                vis[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.destination);
                }
            }
            
        }
    }

    public static void dfs(ArrayList<Edge> []graph,int curr ,boolean vis[]){
        System.out.println(curr + " ");
        vis[curr] = true;

        for(int i=0;i<graph[curr].get(i);i++){
            Edge e = graph[curr].get(i);
        }
    }

    public static void main(String args[]){
        int v = 5;
        ArrayList<Edge> []graph = new ArrayList[v];

        for(int i=0;i<v;i++){
            graph[i] =  new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));
        
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));
    
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));
        
        graph[2].add(new Edge(4, 2, 2));

        for(int i=0;i<graph[3].size();i++){
            Edge e = graph[3].get(i);
            System.out.println("source : "+ e.source+" Destination : "+ e.destination + " weight : " + e.weighet);
        }
        bfs(graph);

    }
    
}
