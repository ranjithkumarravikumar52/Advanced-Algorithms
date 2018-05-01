/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFS;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

/**
 *
 * @author Ranjith
 */
public class BFS {

    public void doBFSAlgorithm(Vertex rootVertex) {
        Queue<Vertex> queue = new LinkedList<Vertex>();
        queue.add(rootVertex);

        while (!queue.isEmpty()) {
            if (queue.peek().isVisited() == false) {
                queue.peek().setVisited(true);
                
                Vertex removedVertex = queue.remove();
                System.out.print(removedVertex);
                List<Vertex> neighborList = removedVertex.getNeighborList();
                
                ListIterator iterator = neighborList.listIterator();
                while (iterator.hasNext()) {
                    queue.add((Vertex) iterator.next());
                }
                
//                printQueue(queue);

            }

        }
        System.out.println();
    }

    private void printQueue(Queue<Vertex> queue) {
        //printing queue
        for(Vertex index: queue){
            System.out.print(index);
        }
        System.out.println();
        //B C D -> print(A)
        //C D E F -> Print(B)
        //D E F G -> print(C)
        //E F G H -> print(D)
        //F G H -> print(E)
        //G H -> print(F)
        //H  - Print(G)
        //empty break; - print (H)
    }
}
