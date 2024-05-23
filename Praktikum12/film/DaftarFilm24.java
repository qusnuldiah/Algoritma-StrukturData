package film;

public class DaftarFilm24 {
    Film24 head;
    Film24 tail;

    public DaftarFilm24() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAwal(int id, String judul, double rating) {
        Film24 newNode = new Film24(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void tambahAkhir(int id, String judul, double rating) {
        Film24 newNode = new Film24(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void tambahIndex(int id, String judul, double rating, int posisi) {
        Film24 newNode = new Film24(id, judul, rating);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            Film24 current = head;
            int index = 1;
            while (current != null && index < posisi - 1) {
                current = current.next;
                index++;
            }
            if (current == null) {
                System.out.println("Posisi yang dimasukkan melebihi panjang daftar.");
            } else {
                newNode.next = current.next;
                current.next = newNode;
                newNode.prev = current;
                if (newNode.next != null) {
                    newNode.next.prev = newNode;
                } else {
                    tail = newNode;
                }
            }
        }
    }

    public void hapusAwal() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    public void hapusAkhir() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    public void hapusIndex(int posisi) {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            Film24 current = head;
            int index = 1;
            while (current != null && index < posisi) {
                current = current.next;
                index++;
            }
            if (current == null) {
                System.out.println("Posisi yang dimasukkan melebihi panjang daftar.");
            } else {
                if (current == head) {
                    hapusAwal();
                } else if (current == tail) {
                    hapusAkhir();
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public void cetak() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            Film24 current = head;
            while (current != null) {
                System.out.println("ID: " + current.id);
                System.out.println("Judul: " + current.judul);
                System.out.println("Rating: " + current.rating);
                System.out.println();
                current = current.next;
            }
        }
    }

    public int cari(int idCari) {
        int posisi = 1;
        Film24 current = head;
        while (current != null) {
            if (current.id == idCari) {
                return posisi;
            }
            current = current.next;
            posisi++;
        }
        return -1;
    }

    public void urutkanRatingDesc() {
        if (isEmpty() || head == tail) {
            return;
        }
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            Film24 current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    double tempRating = current.rating;
                    current.rating = current.next.rating;
                    current.next.rating = tempRating;

                    int tempId = current.id;
                    current.id = current.next.id;
                    current.next.id = tempId;
                    String tempJudul = current.judul;
                    current.judul = current.next.judul;
                    current.next.judul = tempJudul;

                    sorted = false;
                }
                current = current.next;
            }
        }
    }
}


