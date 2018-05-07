package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {

    public void doDFS(Vertex root) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Vertex popVertex = stack.pop();
            if (!popVertex.isVisited()) {
                System.out.print(popVertex + " ");
                popVertex.setVisited(true);
                List<Vertex> neighbors = popVertex.getNeighborList();
                for (Vertex v : neighbors) {
                    stack.add(v);
                }
            }
        }
        System.out.println();
    }
}
