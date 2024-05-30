public class BinaryTreeArrayMain24 {
    public static void main(String[] args) {
        BinaryTreeArray24 bta = new BinaryTreeArray24();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);

        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);

        System.out.print("\n\nAdding data 2, 10, and 1 to the tree recursively...\n");
        bta.addRecursive(2);
        bta.addRecursive(10);
        bta.addRecursive(1);

        System.out.print("\nInOrder Traversal after addition : ");
        bta.traverseInOrder(0);

        System.out.println("\n\nMinimum value: " + bta.findMin());
        System.out.println("Maximum value: " + bta.findMax());
        System.out.print("Leaf nodes: ");
        bta.printLeafNodes();
        System.out.println("\nNumber of leaf nodes: " + bta.countLeafNodes());

        System.out.print("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);

        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
    }
}
