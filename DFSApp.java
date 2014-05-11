package dfs;

class DFSApp {
	public static void main(String[] args){
		Graph theGraph = new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');
		theGraph.addVertex('G');
		theGraph.addVertex('H');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		theGraph.addEdge(4, 5);
		theGraph.addEdge(4, 6);
		theGraph.addEdge(3, 7);
		
		System.out.print("Visits: ");
		theGraph.dfs();
		System.out.println();
	}
}
