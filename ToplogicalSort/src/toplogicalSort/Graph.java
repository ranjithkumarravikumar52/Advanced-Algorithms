package toplogicalSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {
    
    private Stack<Vertex> stack; 
    private List<Vertex> listOfAllVertices; 

    public Graph(List<Vertex> listOfAllVertices) {
        //to include all the clusters of a graph
        this.listOfAllVertices = new ArrayList<>();
        this.listOfAllVertices = listOfAllVertices;
        this.stack = new Stack<>();
    }

    public Stack<Vertex> getStack() {
        return stack;
    }

    public void setStack(Stack<Vertex> stack) {
        this.stack = stack;
    }

    public List<Vertex> getListOfAllVertices() {
        return listOfAllVertices;
    }

    public void setListOfAllVertices(List<Vertex> listOfAllVertices) {
        this.listOfAllVertices = listOfAllVertices;
    }

    @Override
    public String toString() {
        return "Graph{" + "listOfAllVertices: \n" + listOfAllVertices + '}';
    }
    
    private void doTopologicalRecursion(Vertex currentVertex){
        currentVertex.setVisited(true);
        for(Vertex vertexIndex : currentVertex.getNeighborsList()){
            if(!vertexIndex.isVisited()){
                doTopologicalRecursion(vertexIndex);
            }
        }
        //when code reaches here, it means that traversal of a specific path has reached to a deadend. 
        //which means that, add this current vertex (visualize it as a leaf node) to the stack
        stack.push(currentVertex);
    }
    
    public void doTopologicalSort(Vertex currentVertex){
        doTopologicalRecursion(currentVertex);
        //to consider any wrangler-clusters of a graph
        for(Vertex vertexIndex: this.listOfAllVertices){
            if(!vertexIndex.isVisited()){
                doTopologicalRecursion(vertexIndex);
            }
        }
        displayStack();
    }

    private void displayStack() {
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    } 
    
    public void detectCycle(Vertex currentVertex){
        //if(bV == false)
            //currentVertex bV = true
            //check all neighbors
            //while backtracking add it into stack
                //if 
            //push into stack
            //isV = true
        //else
            //detected a cycle
       if(!currentVertex.isBeingVisited()){
           currentVertex.setBeingVisited(true);
           for(Vertex vertexIndex: currentVertex.getNeighborsList()){
               if(!vertexIndex.isVisited()){
                   detectCycle(vertexIndex);
               }
           }
           stack.push(currentVertex);
           currentVertex.setVisited(true);
       }
       else{
           System.out.println("Cycle detected");
       }
        
    }
    
}
