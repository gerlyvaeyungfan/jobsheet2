public class Graph {
    public int numVertices;
    public int[][] adjMartix;
    public int weight;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjMartix = new int[numVertices][numVertices];
    }

    public void addEdge(int i, int j, int w) {
        if (i < numVertices && j < numVertices) {
            adjMartix[i][j] = w;
            adjMartix[j][i] = w;
        }
    }

    public void removeEdge(int i, int j, int w) {
        adjMartix[i][j] = 0;
        adjMartix[j][i] = 0;
    }

    public void print() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");

            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMartix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getEdge (int i, int j) {
        if (i < numVertices && j < numVertices) {
            return adjMartix[i][j];
        }
        return 0;
    }

    public int getDegree(int vertex) {
        int degree = 0;
        if(vertex < numVertices) {
            for (int j = 0; j < numVertices; j++) {
                if(adjMartix[vertex][j] != 0) {
                    degree++;
                }
            }
        }
        return degree;
    }

    public void printGetDegree() {
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Degree dari vertex " + i + ": " + getDegree(i));
        }
    }
}