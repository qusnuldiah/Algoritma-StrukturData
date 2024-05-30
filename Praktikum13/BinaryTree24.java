public class BinaryTree24 {
    Node24 root;

    public BinaryTree24() {
        root = null;
    }

    boolean IsEmpty() {
        return root == null;
    }

    void add(int data) {
        if (IsEmpty()) { //tree is empty
            root = new Node24(data);
        } else {
            Node24 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = new Node24(data);
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node24(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else { // data already exists
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean result = false;
        Node24 current = root;
        while (current != null) {
            if (current.data == data) {
                result = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node24 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node24 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node24 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node24 getSuccessor(Node24 del) {
        Node24 successor = del.right;
        Node24 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (IsEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        // Find node (current) that will be deleted
        Node24 parent = root;
        Node24 current = root;
        boolean IsLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                IsLeftChild = true;
            } else if(data > current.data) {
                parent = current;
                current = current.right;
                IsLeftChild = false;
            }
        }

        // Deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // If there is no child. Simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (IsLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // If there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (IsLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // If there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (IsLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // If there are 2 children
                Node24 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (IsLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}