package TugasPraktikum;

public class Mahasiswa24 {
    String nim, nama, noTelp;

    public Mahasiswa24() {

    }

    public Mahasiswa24(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String toString() {
        return String.format("%-8s %-15s %-10s", nim, nama, noTelp);
    }
}
