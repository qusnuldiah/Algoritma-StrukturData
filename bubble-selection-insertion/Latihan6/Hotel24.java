package Latihan6;

public class Hotel24 {
    String nama;
    String kota;
    int harga;
    byte bintang;

    public Hotel24(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public String getNama() {
        return nama;
    }

    public String getKota() {
        return kota;
    }

    public int getHarga() {
        return harga;
    }

    public byte getBintang() {
        return bintang;
    }

    public void printAsTableRow() {
        System.out.printf("| %-20s | %-10s | %10d | %8d |\n", nama, kota, harga, bintang);
    }
}