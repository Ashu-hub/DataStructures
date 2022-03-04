package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/*
 * Input: n = 4, e = 6 
	0 -> 1, 0 -> 2, 1 -> 2, 2 -> 0, 2 -> 3, 3 -> 3 
	Output: DFS from vertex 1 : 1 2 0 3 
 */
public class GraphDFS {

	private int V;
	private LinkedList[] adj;

	public GraphDFS(int v) {
		V = v;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<>();
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public static void main(String[] args) {
		GraphDFS graph = new GraphDFS(5);

		graph.addEdge(1, 0);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 4);
		System.out.println("Following is Depth First Traversal (starting from vertex 2)");

		graph.dfs(0);
	}

	private void dfs(int s) {
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<>();

		visited[s] = true;
		stack.push(s);

		while (!stack.empty()) {
			s = stack.pop();
			System.out.print(s + " ");

			Iterator<Integer> itr = adj[s].iterator();
			while (itr.hasNext()) {
				int n =  itr.next();
				if (!visited[n]) {
					visited[n] = true;
					stack.push(n);
				}
			}
		}

	}

}
