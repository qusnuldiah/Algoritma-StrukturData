package Collection24;

public class Mobil24 {
    private String id;
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    private double harga;
    private String deskripsi;

    // Konstruktor default
    public Mobil24() {
    }

    // Konstruktor untuk menginisialisasi objek Mobil24 dengan semua atribut.
    public Mobil24(String id, String merk, String model, int tahun, String warna, double harga, String deskripsi) {
        this.id = id;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
        this.harga = harga;
        this.deskripsi = deskripsi;
    }

    // Getter dan setter untuk masing-masing atribut
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Override
    public String toString() {
        return String.format("| %-4s | %-8s | %-9s | %-5d | %-8s | Rp.%,.2f | %s |\n",
                id, merk, model, tahun, warna, harga, deskripsi);
    }
}
