package Collection24;

import java.util.ArrayList;
import java.util.Comparator;

public class MobilCollection24 {
    // ArrayList untuk menyimpan objek Mobil24
    private ArrayList<Mobil24> listMobil;

    // Konstruktor untuk inisialisasi ArrayList.
    public MobilCollection24() {
        listMobil = new ArrayList<>();
    }

    // Menambahkan objek Mobil24 ke dalam koleksi.
    public void tambahMobil(Mobil24 m) {
        listMobil.add(m);
    }

    // Menghapus objek Mobil24 dari koleksi berdasarkan ID.
    public void hapusMobil(String id) {
        listMobil.removeIf(m -> m.getId().equals(id));
    }

    // Mengembalikan objek Mobil24 berdasarkan ID.
    public Mobil24 getMobil(String id) {
        for (Mobil24 m : listMobil) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    // Mengembalikan semua objek Mobil24 dalam bentuk ArrayList.
    public ArrayList<Mobil24> getAllMobil() {
        return listMobil;
    }

    // Mencetak semua objek Mobil24 ke layar.
    public void cetakSemuaMobil() {
        for (Mobil24 m : listMobil) {
            System.out.println(m);
        }
    }

    // Sorting berdasarkan ID
    public void sortById() {
        listMobil.sort(Comparator.comparing(Mobil24::getId));
    }

    // Sorting berdasarkan Merk
    public void sortByMerk() {
        listMobil.sort(Comparator.comparing(Mobil24::getMerk));
    }

    // Sorting berdasarkan Tahun
    public void sortByTahun() {
        listMobil.sort(Comparator.comparingInt(Mobil24::getTahun));
    }

    // Searching mobil berdasarkan merk
    public Mobil24 searchByMerk(String merk) {
        for (Mobil24 m : listMobil) {
            if (m.getMerk().equalsIgnoreCase(merk)) {
                return m;
            }
        }
        return null;
    }

    // Searching mobil berdasarkan tahun
    public ArrayList<Mobil24> searchByTahun(int tahun) {
        ArrayList<Mobil24> result = new ArrayList<>();
        for (Mobil24 m : listMobil) {
            if (m.getTahun() == tahun) {
                result.add(m);
            }
        }
        return result;
    }
}
