package Tugas2;

public class Poin24 {
    String pertanyaan;
    String jawaban;
    int poin;
    Poin24 next;

    public Poin24(String pertanyaan, String jawaban, int poin, Poin24 next) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.poin = poin;
        this.next = next;
    }
}