public class Graph() {
	private final int v; // vertex
	private int e; // edge
	private int[] s; // set of vertices
	// PriorityQueue<Vertex> v;

	public Graph(int V) {
		this.v = v;
		this.e = 0;
		for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }

		v = new PriorityQueue<Vertex>(10,new Vertex());
	}

	public int getVertex() {
		return v;
	}	

	public int getEdge() {
		return e;
	}

	public void setVertex() {

	}

	public void setEdge() {

	}
}