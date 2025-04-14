package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph<N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    private void addNode(N node){
        if(!this.adjacencyList.containsKey(node)){
            this.adjacencyList.put(node, new ArrayList<>());
        }
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public String toString(){
        return this.adjacencyList.toString();
    }
    public boolean connected(N from, N to){
        return this.adjacencyList.containsKey(from) &&
                this.adjacencyList.get(from).contains(to);
    }

    public boolean validPath(ArrayList<N> path){
        for (int x=0; x<path.size()-1; x++){
            N from=path.get(x);
            N to=path.get(x+1);
            if (!this.connected(from,to)){
                return false;
            }
        }
        return true;
    }
    public HashMap<N,Integer> countDestinations(){
        HashMap<N,Integer> destCount=new HashMap<>();
        for (ArrayList<N> edges: this.adjacencyList.values()){
            for (N destination : edges){
                if (destCount.containsKey(destination)){
                    destCount.put(destination,destCount.get(destination)+1);
                } else {
                    destCount.put(destination,1);
                }
            }
        }
        return destCount;
    }
    /*public ArrayList<N> mostIncomingHelper(HashMap<N,Integer> destCount){
        HashMap<Integer,ArrayList<N>> counts=new HashMap<>();
        for (N node: destCount.keySet()){
            int count=destCount.get(node);
            if (counts.containsKey(count)){
                ArrayList<N> temp=counts.get(count);
                temp.add(node);
                counts.put(count,counts.get(count));
            } else {
                counts.put(count,new ArrayList<>());
            }
        }
        return counts;
    }
    public ArrayList<N> mostIncoming(){
        HashMap<N,Integer> destinationCount=countDestinations();
        return mostIncomingHelper(destinationCount);
    }*/
    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        //add edges
        graph.addEdge("JFK","BUF");
        graph.addEdge("JFK","HOU");
        graph.addEdge("JFK","HCA");
        graph.addEdge("BUF","JFK");
        graph.addEdge("BUF","CHI");
        graph.addEdge("HOU","JFK");
        graph.addEdge("HOU","CHI");
        graph.addEdge("HOU","HCA");
        graph.addEdge("CHI","HOU");
        graph.addEdge("CHI","BUF");
        graph.addEdge("CHI","HCA");
        System.out.println(graph);

        ArrayList<String> path1=new ArrayList<>(
                Arrays.asList("JFK","HOU","HCA")
        );
        System.out.println(graph.validPath(path1));
        ArrayList<String> path2=new ArrayList<>(
                Arrays.asList("JFK","HOU","BUF")
        );
        System.out.println(graph.validPath(path2));
        ArrayList<String> path3=new ArrayList<>(
                Arrays.asList("JFK","HOU","JFK","BUF","CHI")
        );
        System.out.println(graph.validPath(path3));
    }
}
