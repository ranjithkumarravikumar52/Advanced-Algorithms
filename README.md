# Advanced-Algorithms

#### Graph Algorithms
##### Breadth First Search
  * Implemented using queue ADT

##### Depth First Search
  * Implemented using stack (non-recursive)
  * Implemented using stack (recursive)
    * Performance wise both methods have approximately same levels since operating system uses stack anyways

##### Topological Sort (Ordering)
* Topological ordering of a directed graph is a linear ordering of its vertices such that every directed edge **uv** from vertex u to vertex v, **u** comes **BEFORE** **v** in ordering
  * In layman terms, the graph should be directed
  * There's a order or flow in the which the traversals occurs
  * No directed cycles in the graph either (No DAG - Directed Acyclic Graphs)
* Linear time complexity
* **Example:**
  * Project management
  * Dependency injections
  * Task scheduling
  * Constructing the syllabus  
* Hamiltonian path: it is a path in an undirected/directed graph where every node is visited exactly once
  * If this path exists, then the Topological order is unique for the graph
  * And if the starting and ending vertex are the same, then it's called Hamiltonian cycle
  * find Hamiltonian path is a NP-complete problem (so its difficult to find the path when the size increases, but we can determine whether such path exists in linear time)
* Basic Algorithm (pen-paper) is
  * find a vertex that has no incoming edges
  * remove all its outgoing edges
  * print the vertex
    * keep repeating it over and over again till the graph is empty
  * If there exist no vertex which has zero incoming edges, it means that the graph is a cyclic graph
  * [Tutorial Link](https://courses.cs.washington.edu/courses/cse326/03wi/lectures/RaoLect20.pdf) with detailed explanation
* Pseudo-code
  * select a vertex that has no incoming edges
  * traverse all its neighbors till you reach a dead-end
  * while traversing each node, set its attribute "visited" to true
  * once a dead-end has been reached add it to the stack
* OOP design
  * Entities
    * Graph: which contains list of all the vertices
      * topologicalSort() method 
    * Vertex: which contains data, and list of neighboring vertex
