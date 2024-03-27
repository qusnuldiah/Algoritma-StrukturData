package minggu7;

import java.util.Arrays;

public class PencarianMhs24 {
    Mahasiswa24 listMhs[];
    int idx;

    public PencarianMhs24(int jumlahMahasiswa) {
        listMhs = new Mahasiswa24[jumlahMahasiswa];
        idx = 0;
    }

    void tambah(Mahasiswa24 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil() {
        for (Mahasiswa24 m : listMhs) {
            if (m != null) {
                m.tampil();
                System.out.println("--------------------");
            }
        }
    }

    // Metode tambah() dan tampil() tidak berubah

    public int findBinarySearchByName(String nama, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = listMhs[mid].nama.compareToIgnoreCase(nama);
            
            if (compareResult == 0) {
                // Nama ditemukan
                return mid;
            } else if (compareResult < 0) {
                // Nama yang dicari berada di sebelah kanan
                left = mid + 1;
            } else {
                // Nama yang dicari berada di sebelah kiri
                right = mid - 1;
            }
        }
        
        // Nama tidak ditemukan
        return -1;
    }

    public void searchAndPrint(String nama) {
        // Mengurutkan array berdasarkan nama
        Arrays.sort(listMhs, (a, b) -> a.nama.compareToIgnoreCase(b.nama));
        
        int pos = findBinarySearchByName(nama, 0, idx - 1);
        if (pos != -1) {
            System.out.println("Data ditemukan pada indeks " + pos);
            System.out.println("Detail Mahasiswa:");
            listMhs[pos].tampil();
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    public void searchAllAndPrint(String nama) {
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (listMhs[i].nama.equalsIgnoreCase(nama)) {
                if (!found) {
                    found = true;
                    System.out.println("Data ditemukan pada indeks:");
                }
                System.out.println(i);
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
