package sufa.graph_31;

import java.util.LinkedList;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2018-12-21 15:32
 * @Vertion 1.0
 **/
public class Graph {
    private int v;
    private LinkedList<Integer> adj[];

    public Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;++i){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s,int t){
        adj[s].add(t);
        adj[t].add(s);
    }
}
