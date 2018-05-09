package toplogicalSort;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String vertexName;
    private List<Vertex> neighborsList;
    //set when the traversal mets a dead end and before initiating backtracking
    private boolean visited;
    //set when the DFS is in-progress
    private boolean beingVisited; 

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public Vertex(String vertexName) {
        this.vertexName = vertexName;
        neighborsList = new ArrayList<>();
    }

    public String getVertexName() {
        return vertexName;
    }

    public void setVertexName(String vertexName) {
        this.vertexName = vertexName;
    }

    public List<Vertex> getNeighborsList() {
        return neighborsList;
    }

    public void addNeighborsList(Vertex newNeighbor) {
        this.neighborsList.add(newNeighbor);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    @Override
    public String toString() {
        return vertexName + " ";
    }

}
