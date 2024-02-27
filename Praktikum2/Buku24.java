public class Buku24 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println("Penjualan berhasil. Sisa stok: " + stok);
        } else {
            System.out.println("Stok habis. Tidak dapat melakukan penjualan.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku24() {
    }

    public Buku24(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int totalHarga) {
        if (totalHarga > 150000) {
            return (int) (0.12 * totalHarga);
        } else if (totalHarga >= 75000 && totalHarga <= 150000) {
            return (int) (0.05 * totalHarga);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int jml) {
        int totalHarga = hitungHargaTotal(jml);
        int diskon = hitungDiskon(totalHarga);
        return totalHarga - diskon;
    }
}