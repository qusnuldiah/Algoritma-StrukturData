package doublelinkedlists;

public class DoubleLinkedListsMain24 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists24 dll = new DoubleLinkedLists24();
        dll.print();
        System.out.println("Size : "+dll.size());
        //System.out.println("=====================================================");
        //dll.addFirst(3);
        //dll.addLast(4);
        //dll.addFirst(7);
        //dll.print();
        //System.out.println("Size : "+dll.size());
        //System.out.println("=====================================================");
        //dll.add(40, 1);
        //dll.print();
        //System.out.println("Size : "+dll.size());
        //System.out.println("=====================================================");
        //dll.clear();
        //dll.print();
        //System.out.println("Size : "+dll.size());
        //dll.addLast(50);
        //dll.addLast(40);
        //dll.addLast(10);
        //dll.addLast(20);
        //dll.print();
        //System.out.println("Size : "+dll.size());
        //System.out.println("=====================================================");
        //dll.removeFirst();
        //dll.print();
        //System.out.println("Size : "+dll.size());
        //System.out.println("=====================================================");
        //dll.removeLast();
        //dll.print();
        //System.out.println("Size : "+dll.size());
        //System.out.println("=====================================================");
        //dll.remove(1);
        System.out.println("=====================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=====================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=====================================================");
        System.out.println("Data awal pada Linked Lists adalah: "+ dll.getFirst());
        System.out.println("Data akhir pada Linked Lists adalah: "+ dll.getLast());
        System.out.println("Data indeks ke-1 pada Linke List adalah: "+ dll.get(1));
    }
}
