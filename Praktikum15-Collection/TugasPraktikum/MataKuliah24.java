package TugasPraktikum;

public class MataKuliah24 {
    String kodeMk, namaMk;
    int sks;

    public MataKuliah24(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String toString() {
        return String.format("%-8s %-40s %-3s", kodeMk, namaMk, sks);
    }
}
