/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepthFirstSearch;

/**
 *
 * @author Ranjith
 */
public class App {

    public static void main(String[] args) {

        Vertex root = new Vertex(9);
        Vertex A = new Vertex(1);
        Vertex B = new Vertex(2);
        Vertex C = new Vertex(3);
        Vertex D = new Vertex(4);
        Vertex E = new Vertex(5);
        Vertex F = new Vertex(6);
        Vertex G = new Vertex(7);
        Vertex H = new Vertex(8);

        root.addNeighborVertex(A);

        A.addNeighborVertex(B);
        A.addNeighborVertex(C);
        A.addNeighborVertex(D);

        B.addNeighborVertex(E);
        B.addNeighborVertex(F);

        C.addNeighborVertex(G);

        D.addNeighborVertex(H);

//        DFS dfs = new DFS();
//        dfs.doDFS(root);
        DFS dfs1 = new DFS();
        System.out.println("with recursion");
        dfs1.doDFSWithRecursion(root);

    }
}
