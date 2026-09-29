import java.util.*;
public class cycledetec {

    static class Edge{
        int src;
        int dis;

        public Edge(int s,int d){
            this.src = s;
            this.dis = d;
        }
    }

    public static void creategrapg(ArrayList<Edge> []graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();

        }
         graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        
        graph[4].add(new Edge(4,3));
        
    }

    public static boolean detectCycle(ArrayList<Edge> []graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                detectCycleutil(graph,vis,i,-1);
                return true;
            }
        }
        return  false;
    }
    public static boolean detectCycleutil(ArrayList<Edge> []graph,boolean vis[],int curr,int par){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dis] && detectCycleutil(graph, vis, e.dis,curr)){
                return true;
            }

            else if(vis[e.dis] && e.dis != par){
                return false;
            }

        }
        return false;

    }
       public static void main(String args[]){
        int v = 5;
        ArrayList<Edge> graph[] =  new ArrayList[v];
        creategrapg(graph);
        System.out.println(detectCycle(graph));

    }
    
}
