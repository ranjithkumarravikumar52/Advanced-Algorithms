package toplogicalSort;

public class App {
    public static void main(String[] args) {
        Graph simpleGraph = new Graph(); 
        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        
        v5.addNeighborsList(v2);
        v5.addNeighborsList(v0);
        
        v2.addNeighborsList(v3);
        
        
        v4.addNeighborsList(v0);
        v4.addNeighborsList(v1);
        
        v3.addNeighborsList(v1);
        
        simpleGraph.doTopologicalSort(v5);
        while(!simpleGraph.getStack().isEmpty()){
            System.out.print(simpleGraph.getStack().pop()+" ");
        }
        
        
        
        
    }
}
