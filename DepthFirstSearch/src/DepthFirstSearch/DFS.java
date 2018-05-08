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

    public void doDFSWithRecursion(Vertex root) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);
        doRecursion(stack);
        System.out.println();
    }

    private void doRecursion(Stack<Vertex> stack) {
        //base condition - when the stack is empty break
        if (stack.isEmpty()) {
//            System.out.println("empty stack");
            return;
        }
        Vertex popVertex = stack.pop();
        if (!popVertex.isVisited()) {
//            System.out.println("inside conditions");
            System.out.print(popVertex + " ");
            popVertex.setVisited(true);
            List<Vertex> neighbors = popVertex.getNeighborList();
            for (Vertex v : neighbors) {
                stack.add(v);
            }
            doRecursion(stack);
        }

    }
}
