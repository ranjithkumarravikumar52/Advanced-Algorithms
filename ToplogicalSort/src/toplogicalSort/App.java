package toplogicalSort;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
//        Vertex v0 = new Vertex("0");
//        Vertex v1 = new Vertex("1");
//        Vertex v2 = new Vertex("2");
//        Vertex v3 = new Vertex("3");
//        Vertex v4 = new Vertex("4");
//        Vertex v5 = new Vertex("5");
//
//        v5.addNeighborsList(v2);
//        v5.addNeighborsList(v0);
//        v2.addNeighborsList(v3);
//        v4.addNeighborsList(v0);
//        v4.addNeighborsList(v1);
//        v3.addNeighborsList(v1);
//
//        List<Vertex> list = new ArrayList<>();
//        list.add(v0);
//        list.add(v1);
//        list.add(v2);
//        list.add(v3);
//        list.add(v4);
//        list.add(v5);
//
//        Graph example1 = new Graph(list);
//
//        example1.doTopologicalSort(v5);

        Vertex v0 = new Vertex("0");
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");

        v0.addNeighborsList(v1);
        v0.addNeighborsList(v3);

        v1.addNeighborsList(v2);
        v1.addNeighborsList(v3);

        v2.addNeighborsList(v4);
        v2.addNeighborsList(v5);

        v3.addNeighborsList(v4);
        v3.addNeighborsList(v5);

        v4.addNeighborsList(v5);

        List<Vertex> list = new ArrayList<>();
        list.add(v0);
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);

        Graph example2 = new Graph(list);

//        example2.doTopologicalSort(v2);
    }
}
