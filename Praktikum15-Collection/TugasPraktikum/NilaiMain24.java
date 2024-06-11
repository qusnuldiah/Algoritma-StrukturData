package TugasPraktikum;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class NilaiMain24 {
    String kodeNil;
    double nilai;
    Mahasiswa24 mhs;
    MataKuliah24 mk;

    public NilaiMain24(String kodeNil, double nilai, Mahasiswa24 mhs, MataKuliah24 mk) {
        this.kodeNil = kodeNil;
        this.nilai = nilai;
        this.mhs = mhs;
        this.mk = mk;
    }

    List<Mahasiswa24> mhsA = new ArrayList<>();
    List<MataKuliah24> matkulA = new ArrayList<>();
    Queue<Mahasiswa24> antrianMahasiswa = new LinkedList<>();

    public void tambahMhs(Mahasiswa24... mahasiswa) {
        mhsA.addAll(Arrays.asList(mahasiswa));
        antrianMahasiswa.addAll(Arrays.asList(mahasiswa));
    }

    public void tambahMatkul(MataKuliah24... matkul) {
        matkulA.addAll(Arrays.asList(matkul));
    }

    public void tampilMhs() {
        System.out.println("================================================================================");
        System.out.println("NIM     Nama                          Telf");
        System.out.println("--------------------------------------------------------------------------------");
        for (Mahasiswa24 mhs : mhsA) {
            System.out.println(String.format("%-8s %-25s %-15s", mhs.nim, mhs.nama, mhs.noTelp));
        }
    }

    public void tampilMatkul() {
        System.out.println("================================================================================");
        System.out.println("Kode    Mata Kuliah                               SKS");
        System.out.println("--------------------------------------------------------------------------------");
        for (MataKuliah24 mk : matkulA) {
            System.out.println(String.format("%-8s %-40s %-3s", mk.kodeMk, mk.namaMk, mk.sks));
        }
    }

    public void tampilAntrianMahasiswa() {
        System.out.println("================================================================================");
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("================================================================================");
        if (!antrianMahasiswa.isEmpty()) {
            int counter = 1;
            for (Mahasiswa24 mahasiswa : antrianMahasiswa) {
                System.out.println(counter + ". " + mahasiswa.nama + " (" + mahasiswa.nim + ")");
                counter++;
            }
        } else {
            System.out.println("Antrian mahasiswa kosong.");
        }
    }

    int linearSearchMhs(String nim) {
        for (int i = 0; i < mhsA.size(); i++) {
            if (nim.equals(mhsA.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    int linearSearchMatkul(String matkul) {
        for (int i = 0; i < matkulA.size(); i++) {
            if (matkul.equals(matkulA.get(i).kodeMk)) {
                return i;
            }
        }
        return -1;
    }

    Mahasiswa24 cariMhs(String nim) {
        for (int i = 0; i < mhsA.size(); i++) {
            if (nim.equals(mhsA.get(i).nim)) {
                return mhsA.get(i);
            }
        }
        return null;
    }

    MataKuliah24 cariMatkul(String matkul) {
        for (int i = 0; i < matkulA.size(); i++) {
            if (matkul.equals(matkulA.get(i).kodeMk)) {
                return matkulA.get(i);
            }
        }
        return null;
    }

    public String toString(int idx1, int idx2) {
        return String.format("%-8s %-25s %-40s %-3s", mhsA.get(idx1).nim, mhsA.get(idx1).nama, matkulA.get(idx2).namaMk, matkulA.get(idx2).sks);
    }

    static Comparator<NilaiMain24> CompNilai = (n1, n2) -> {
        return Double.compare(n1.nilai, n2.nilai);
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);

        List<NilaiMain24> nill = new ArrayList<>();
        NilaiMain24 n = new NilaiMain24("", 0, null, null);

        Mahasiswa24 m1 = new Mahasiswa24("20001", "Thalhah", "021xxx");
        Mahasiswa24 m2 = new Mahasiswa24("20002", "Zubair", "021xxx");
        Mahasiswa24 m3 = new Mahasiswa24("20003", "Abdur-Rahman", "021xxx");
        Mahasiswa24 m4 = new Mahasiswa24("20004", "Sa'ad", "021xxx");
        Mahasiswa24 m5 = new Mahasiswa24("20005", "Sa'id", "021xxx");
        Mahasiswa24 m6 = new Mahasiswa24("20006", "Ubaidah", "021xxx");

        n.tambahMhs(m1, m2, m3, m4, m5, m6);

        MataKuliah24 mk1 = new MataKuliah24("00001", "Internet of Things", 3);
        MataKuliah24 mk2 = new MataKuliah24("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah24 mk3 = new MataKuliah24("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah24 mk4 = new MataKuliah24("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah24 mk5 = new MataKuliah24("00005", "Praktikum Algoritma dan Pemrograman", 3);

        n.tambahMatkul(mk1, mk2, mk3, mk4, mk5);

        NilaiMain24 n1 = null;
        String nimMhs, mkMhs;

        int menu = 0;
        do {
            System.out.println("================================================================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("================================================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.println("================================================================================");
            System.out.print("Pilih   : ");
            menu = sd.nextInt();
            System.out.println("");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan data\nkode   : ");
                    String kd = sc.nextLine();
                    System.out.print("Nilai   : ");
                    double nilMhs = sb.nextDouble();
                    System.out.println("");

                    System.out.println("================================================================================");
                    System.out.println("DAFTAR MAHASISWA");
                    n.tampilMhs();
                    System.out.print("Pilih mahasiswa by nim: ");
                    nimMhs = sc.nextLine();
                    Mahasiswa24 mahaSiswas = n.cariMhs(nimMhs);
                    System.out.println("");

                    System.out.println("================================================================================");
                    System.out.println("DAFTAR MATA KULIAH");
                    n.tampilMatkul();
                    System.out.print("Pilih MK by kode: ");
                    mkMhs = sc.nextLine();
                    MataKuliah24 mataKuliahs = n.cariMatkul(mkMhs);
                    System.out.println("");

                    if (mahaSiswas != null && mataKuliahs != null) {
                        n1 = new NilaiMain24(kd, nilMhs, mahaSiswas, mataKuliahs);
                        nill.add(n1);
                    } else {
                        System.out.println("Mahasiswa atau Mata Kuliah tidak ditemukan.");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("================================================================================");
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("================================================================================");
                    System.out.println("NIM     Nama                          Mata Kuliah                 SKS   Nilai");
                    System.out.println("--------------------------------------------------------------------------------");
                    for (NilaiMain24 nilai : nill) {
                        System.out.println(String.format("%-8s %-25s %-30s %-6s %.2f", nilai.mhs.nim, nilai.mhs.nama, nilai.mk.namaMk, nilai.mk.sks, nilai.nilai));
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("================================================================================");
                    System.out.println("Pencarian Data Mahasiswa");
                    System.out.println("================================================================================");
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("================================================================================");
                    System.out.println("NIM     Nama                          Mata Kuliah                 SKS   Nilai");
                    System.out.println("--------------------------------------------------------------------------------");
                    int totalSKS = 0;
                    System.out.print("Masukkan data mahasiswa [nim] : ");
                    String input = sc.nextLine();
                    System.out.println("");
                    for (NilaiMain24 nilai : nill) {
                        if (input.equalsIgnoreCase(nilai.mhs.nim)) {
                            totalSKS += nilai.mk.sks;
                            System.out.println(String.format("%-8s %-25s %-30s %-6s %.2f", nilai.mhs.nim, nilai.mhs.nama, nilai.mk.namaMk, nilai.mk.sks, nilai.nilai));
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Total SKS " + totalSKS + " telah diambil.");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("================================================================================");
                    System.out.println("Pengurutan Data Nilai");
                    System.out.println("================================================================================");
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("================================================================================");
                    System.out.println("NIM     Nama                          Mata Kuliah                 SKS   Nilai");
                    System.out.println("--------------------------------------------------------------------------------");
                    nill.sort(CompNilai);
                    for (NilaiMain24 nilai : nill) {
                        System.out.println(String.format("%-8s %-25s %-30s %-6s %.2f", nilai.mhs.nim, nilai.mhs.nama, nilai.mk.namaMk, nilai.mk.sks, nilai.nilai));
                    }
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("================================================================================");
                    System.out.println("Penghapusan Data Mahasiswa");
                    System.out.println("================================================================================");
                    n.tampilAntrianMahasiswa();
                    if (!n.antrianMahasiswa.isEmpty()) {
                        Mahasiswa24 mhsDihapus = n.antrianMahasiswa.poll();
                        if (mhsDihapus != null) {
                            n.mhsA.remove(mhsDihapus);
                            System.out.println("Mahasiswa dengan NIM " + mhsDihapus.nim + " dan nama " + mhsDihapus.nama + " telah dihapus dari antrian.");
                        }
                    } else {
                        System.out.println("Antrian mahasiswa kosong.");
                    }
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("================================================================================");
                    System.out.println("+                                 Terima Kasih                                 +");
                    System.out.println("================================================================================");
                    break;
            }
        } while (menu < 6 && menu > 0);
    }
}
