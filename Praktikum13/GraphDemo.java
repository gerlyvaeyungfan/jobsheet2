public class GraphDemo {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1, 3);
        g.addEdge(0, 2, 4);
        g.addEdge(1, 2, 5);
        g.addEdge(2, 3, 6);
        g.addEdge(6, 7, 9);

        g.print();
        System.out.println("");
        System.out.println("Edge antara V0 dan V1 adalah " + g.getEdge(0, 1));
        System.out.println("Edge antara V0 dan V3 adalah " + g.getEdge(0, 3));

        System.out.println("");
        g.printGetDegree();
    }
}