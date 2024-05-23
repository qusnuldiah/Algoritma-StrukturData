package vaksinasi;

public class AntrianVaksin24 {
    PenerimaVaksin24 head;
    int size;

    public AntrianVaksin24() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPertama(int noAntrian, String nama) {
        if (isEmpty()) {
            head = new PenerimaVaksin24(null, noAntrian, nama, null);
        } else {
            PenerimaVaksin24 newNode = new PenerimaVaksin24(null, noAntrian, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void hapusPertama() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak dapat dihapus!");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            if (size == 1) {
                head = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }
    }

    public void cetak() {
        if (!isEmpty()) {
            PenerimaVaksin24 tmp = head;
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("|  No.  |        Nama        |");
            System.out.println("|-------|--------------------|");
            while (tmp != null) {
                System.out.printf("|  %-4d | %-18s |\n", tmp.noAntrian, tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Antrian Vaksin Kosong");
        }
    }

    public int ukuran() {
        return size;
    }
}
