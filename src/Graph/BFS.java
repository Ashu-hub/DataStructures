package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Input: n = 4, e = 6 
	0 -> 1, 0 -> 2, 1 -> 2, 2 -> 0, 2 -> 3, 3 -> 3 
	Output: DFS from vertex 1 : 1 2 0 3 
 */
public class BFS {

	private int V;// no of vertices
	private LinkedList[] adj; // Array of List for adjecent list representation.

	BFS(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public static void main(String[] args) {
		BFS graph = new BFS(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
		
		graph.breadthFirstSearch(1);
	}

	//print BFS traversal from given source s
	private void breadthFirstSearch(int s) {
		boolean visited[] = new boolean[V];
		
		//create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size()!= 0) {
			s= queue.poll();
			System.out.print(s+" ");
			
			Iterator<Integer> itr = adj[s].listIterator();
			while(itr.hasNext()) {
				int n=itr.next();
				if(!visited[n]) {//not visited
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		
	}
//ref: https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
	//https://www.youtube.com/watch?v=D21-XVw6nYw&t=1524s
}
