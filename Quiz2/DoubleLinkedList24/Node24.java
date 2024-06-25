package DoubleLinkedList24;

public class Node24 {
    Mobil24 data; // Data yang disimpan dalam node, berupa objek Mobil24
    Node24 prev; // Pointer ke node sebelumnya dalam daftar
    Node24 next; // Pointer ke node berikutnya dalam daftar

    // Konstruktor untuk membuat node baru dengan data Mobil24 yang diberikan
    public Node24(Mobil24 data) {
        this.data = data;
        this.prev = null; // Menginisialisasi pointer sebelumnya menjadi null
        this.next = null; // Menginisialisasi pointer berikutnya menjadi null
    }
}
