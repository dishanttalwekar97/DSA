import java.util.*;
public class Bipartet {
    
    static class Edge{
        int src;
        int dis;

        public Edge(int s,int d){
            this.src = s;
            this.dis = d;
        }

    }
static void createGraph(ArrayList<Edge>graph[]){
     for(int i = 0;i<graph.length;i++){
            graph[i]  = new ArrayList<>();

        }

        //0 vertex
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));

       

}
    
    public static boolean isBipartet(ArrayList<Edge>[] garaph){
        int col[] = new int[garaph.length];
        for(int i=0;i<col.length;i++){
            col[i] = -1;  // initilize with no color
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<garaph.length;i++){
            if(col[i] == -1){
                //bfs
                q.add(i);
                col[i] = 0; // yellow colour
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    for(int j=0;j<garaph[curr].size();j++){
                        Edge e = garaph[curr].get(i);
                        if(col[e.dis] == -1){
                            int nestcol = col[curr] == 0 ? 1 : 0;
                            col[e.dis] = nestcol;
                            q.add(e.dis);

                        }else if(col[e.dis] == col[curr]){
                            return false;

                        }
                    }

                    }
                    
                }
                
            }
            return true;
        }
    
    public static void main(String args[]){
        
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        isBipartet(graph);
       

       
    
    }
    
}
