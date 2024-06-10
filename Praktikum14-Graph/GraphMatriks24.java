public class GraphMatriks24 {
    int vertex;
    int[][] matriks;

    public GraphMatriks24(int v) {
        vertex = v;
        matriks = new int[v][v];
        // Inisialisasi matriks dengan nilai 0
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = 0;
            }
        }
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void updateJarak(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
            }
            System.out.println();
        }
    }

    // Method untuk menghitung inDegree
    public int inDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[i][vertex] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    // Method untuk menghitung outDegree
    public int outDegree(int vertex) {
        int outDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[vertex][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    // Method untuk menghitung total degree (degree = inDegree + outDegree)
    public int degree(int vertex) {
        return inDegree(vertex) + outDegree(vertex);
    }
}
