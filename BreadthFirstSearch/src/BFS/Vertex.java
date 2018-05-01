/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ranjith
 */
public class Vertex {
    private int data; 
    private boolean visited; 
    private List<Vertex> neighborList;

    public Vertex(int data) {
        this.data = data;
        this.neighborList = new ArrayList<Vertex>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    @Override
    public String toString() {
        return data+" ";
    }
    
    public void addNeighborVertex(Vertex neighbor){
        this.neighborList.add(neighbor);
    }
    
    
}
