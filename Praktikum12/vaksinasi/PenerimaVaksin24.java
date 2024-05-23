package vaksinasi;

public class PenerimaVaksin24 {
    int noAntrian;
    String nama;
    PenerimaVaksin24 prev, next;

    PenerimaVaksin24(PenerimaVaksin24 prev, int noAntrian, String nama, PenerimaVaksin24 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = next;
    }
}


