package DoubleLinkedList24;

import java.util.ArrayList;

public class MobilDoubleLinkedList24 {
    private Node24 head; // Pointer ke node pertama dalam daftar
    private Node24 tail; // Pointer ke node terakhir dalam daftar

    // Konstruktor untuk inisialisasi Double Linked List
    public MobilDoubleLinkedList24() {
        this.head = null;
        this.tail = null;
    }

    // Menambahkan objek Mobil24 ke dalam daftar di akhir
    public void tambahMobil(Mobil24 data) {
        Node24 newNode = new Node24(data);
        if (head == null) {
            head = newNode;
            tail = newNode; // Jika daftar kosong, head dan tail menunjuk ke node baru
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Menghapus objek Mobil24 dari daftar berdasarkan ID
    public void hapusMobil(String id) {
        Node24 current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Jika node pertama yang dihapus
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // Jika node terakhir yang dihapus
                }
                return;
            }
            current = current.next;
        }
    }

    // Mengembalikan objek Mobil24 berdasarkan ID
    public Mobil24 getMobil(String id) {
        Node24 current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Pengurutan berdasarkan ID
    public void sortById() {
        if (head == null || head == tail) {
            return; // Tidak ada atau hanya satu elemen, tidak perlu diurutkan
        }

        boolean swapped;
        Node24 current;
        Node24 last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.getId().compareTo(current.next.data.getId()) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    // Pengurutan berdasarkan Merk
    public void sortByMerk() {
        if (head == null || head == tail) {
            return; // Tidak ada atau hanya satu elemen, tidak perlu diurutkan
        }

        boolean swapped;
        Node24 current;
        Node24 last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.getMerk().compareTo(current.next.data.getMerk()) > 0) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    // Pengurutan berdasarkan Tahun
    public void sortByTahun() {
        if (head == null || head == tail) {
            return; // Tidak ada atau hanya satu elemen, tidak perlu diurutkan
        }

        boolean swapped;
        Node24 current;
        Node24 last = null;

        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.data.getTahun() > current.next.data.getTahun()) {
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            last = current;
        } while (swapped);
    }

    // Metode bantu untuk pertukaran data antara dua node
    private void swap(Node24 a, Node24 b) {
        Mobil24 temp = a.data;
        a.data = b.data;
        b.data = temp;
    }

    // Mencetak semua objek Mobil24 dalam daftar
    public void cetakSemuaMobil() {
        Node24 current = head;
        System.out.println("\n======================================================================================================================================");
        System.out.println("| ID   | Merk       | Model      | Tahun | Warna   | Harga             | Deskripsi                                                   |");
        System.out.println("======================================================================================================================================");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("======================================================================================================================================");
    }

    // Pencarian berdasarkan ID
    public Mobil24 searchById(String id) {
        Node24 current = head;
        while (current != null) {
            if (current.data.getId().equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Pencarian berdasarkan Tahun
    public ArrayList<Mobil24> searchByTahun(int tahun) {
        ArrayList<Mobil24> result = new ArrayList<>();
        Node24 current = head;
        while (current != null) {
            if (current.data.getTahun() == tahun) {
                result.add(current.data);
            }
            current = current.next;
        }
        return result;
    }
}
