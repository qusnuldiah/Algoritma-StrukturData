package minggu7;

import java.util.Scanner;

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

    public int findBinarySearchByName(String nama, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2;
            if (listMhs[mid] != null && listMhs[mid].nama.equalsIgnoreCase(nama)) {
                return mid;
            } else if (listMhs[mid] != null && listMhs[mid].nama.compareToIgnoreCase(nama) > 0) {
                return findBinarySearchByName(nama, left, mid - 1);
            } else {
                return findBinarySearchByName(nama, mid + 1, right);
            }
        }
        return -1;
    }

    public void searchAndPrint(String nama) {
        int left = 0;
        int right = idx - 1;
        int pos = findBinarySearchByName(nama, left, right);
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
            if (listMhs[i] != null && listMhs[i].nama.equalsIgnoreCase(nama)) {
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
