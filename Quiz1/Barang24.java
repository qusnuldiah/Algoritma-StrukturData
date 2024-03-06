import java.util.ArrayList;
import java.util.Scanner;

class Barang24 {
    Scanner scanner = new Scanner(System.in);
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang24(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getInfoBarang() {
        return "Kode: " + kode + ", Nama: " + nama + ", Harga: " + harga + ", Stok: " + stok;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }
}

class TransaksiBarang {
    private ArrayList<Barang24> barangs;

    public TransaksiBarang() {
        this.barangs = new ArrayList<>();
    }

    public void tampilkanBarang(ArrayList<Barang24> daftarBarang) {
        System.out.println("==========================");
        System.out.println("DAFTAR BARANG");
        System.out.println("==========================");
        for (Barang24 barang : daftarBarang) {
            System.out.println(barang.getInfoBarang());
        }
    }

    public void tampilkanPembelian() {
        if (barangs.isEmpty()) {
            System.out.println("Belum ada barang yang dibeli.");
        } else {
            System.out.println("Barang yang Dibeli:");
            for (Barang24 barang : barangs) {
                System.out.println(barang.getInfoBarang());
            }
        }
    }

    public void melakukanPembelian(ArrayList<Barang24> daftarBarang, String kodeBarang, int jumlah) {
        for (Barang24 barang : daftarBarang) {
            if (barang.getStok() > 0 && barang.getKode().equals(kodeBarang)) {
                barangs.add(barang);
                barang.kurangiStok(jumlah);
                System.out.println("Pembelian berhasil.");
                return;
            }
        }
        System.out.println("Barang tidak tersedia atau stok habis.");
    }
}