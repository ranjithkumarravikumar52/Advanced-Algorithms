package toplogicalSort;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String vertexName;
    private List<Vertex> neighborsList;
    private boolean visited;

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
