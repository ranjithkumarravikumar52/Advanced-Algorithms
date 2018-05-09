package toplogicalSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {
    
    private Stack<Vertex> stack; 
    private List<Vertex> listOfAllVertices; 

    public Graph() {
        this.listOfAllVertices = new ArrayList<>();
        //init stack too
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
    
    public void doTopologicalSort(Vertex currentVertex){
        currentVertex.setVisited(true);
        for(Vertex vertexIndex : currentVertex.getNeighborsList()){
            if(!vertexIndex.isVisited()){
                doTopologicalSort(vertexIndex);
            }
        }
        //when code reaches here, it means that traversal of a specific path has reached to a deadend. 
        //which means that, add this current vertex (visualize it as a leaf node) to the stack
        stack.push(currentVertex);
    }
    
    
    
    
}
