public class BinaryTreeArray24 {
    int[] data;
    int idxLast;
    Node24 root;

    public BinaryTreeArray24() {
        data = new int[10];
        root = null;
        idxLast = -1;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if(idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    // Menambahkan data ke dalam array tree secara rekursif
    void addRecursive(int data) {
        root = addRecursive(root, data);
    }

    private Node24 addRecursive(Node24 current, int data) {
        if (current == null) {
            return new Node24(data);
        }
        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }
        return current;
    }

    // Menampilkan nilai paling kecil dan paling besar di dalam tree
    int findMin() {
        return findMin(root);
    }

    private int findMin(Node24 node) {
        if (node.left == null) {
            return node.data;
        } else {
            return findMin(node.left);
        }
    }

    int findMax() {
        return findMax(root);
    }

    private int findMax(Node24 node) {
        if (node.right == null) {
            return node.data;
        } else {
            return findMax(node.right);
        }
    }

    // Menampilkan data yang ada di leaf
    void printLeafNodes() {
        printLeafNodes(root);
    }

    private void printLeafNodes(Node24 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeafNodes(node.left);
            printLeafNodes(node.right);
        }
    }

    // Menampilkan berapa jumlah leaf yang ada di dalam tree
    int countLeafNodes() {
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node24 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeafNodes(node.left) + countLeafNodes(node.right);
        }
    }

    // Menambahkan data ke dalam tree
    void add(int data) {
        if (idxLast < this.data.length - 1) {
            this.data[++idxLast] = data;
        }
    }

    // Traverse tree in PreOrder
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    // Traverse tree in PostOrder
    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}


