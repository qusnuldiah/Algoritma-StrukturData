import java.text.DecimalFormat;
import java.util.Scanner;

public class Array24 {

    private static double konversiNilaiKeSetara(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return 4.0;
        } else if (nilai > 73 && nilai <= 80) {
            return 3.5;
        } else if (nilai > 65 && nilai <= 73) {
            return 3.0;
        } else if (nilai > 60 && nilai <= 65) {
            return 2.5;
        } else if (nilai > 50 && nilai <= 60) {
            return 2.0;
        } else if (nilai > 39 && nilai <= 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    private static String konversiNilaiKeHuruf(double nilai) {
        if (nilai == 4.0) {
            return "A";
        } else if (nilai == 3.5) {
            return "B+";
        } else if (nilai == 3.0) {
            return "B";
        } else if (nilai == 2.5) {
            return "C+";
        } else if (nilai == 2.0) {
            return "C";
        } else if (nilai == 1.0) {
            return "D";
        } else {
            return "E";
        }
    }

    private static String konversiIPKeKualifikasi(double ip) {
        if (ip >= 3.5) {
            return "Sangat Baik";
        } else if (ip >= 3.0) {
            return "Lebih dari Baik";
        } else if (ip >= 2.5) {
            return "Baik";
        } else if (ip >= 2.0) {
            return "Lebih dari Cukup";
        } else if (ip >= 1.0) {
            return "Cukup";
        } else {
            return "Gagal";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};
        double[] bobotSKS = {3, 3, 3, 4, 3, 3, 2, 2};

        System.out.println("=======================================================================================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================================================================================================");

        double[] nilaiSetara = new double[mataKuliah.length];
        double totalBobot = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + " : ");
            double nilai = scanner.nextDouble();

            nilaiSetara[i] = konversiNilaiKeSetara(nilai);
            totalBobot += bobotSKS[i];
        }

        System.out.println("=======================================================================================================");
        System.out.println("    Hasil Konversi Nilai");
        System.out.println("=======================================================================================================");
        System.out.printf("| %-45s | %-15s | %-15s | %-15s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("=======================================================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("| %-45s | %-15s | %-15s | %-15s |\n", mataKuliah[i], df.format(nilaiSetara[i]),
                    konversiNilaiKeHuruf(nilaiSetara[i]), bobotSKS[i]);
        }

        double totalNilai = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            totalNilai += nilaiSetara[i] * bobotSKS[i];
        }

        double ipSemester = totalNilai / totalBobot;

        System.out.println("=======================================================================================================");
        System.out.println("\nIP Semester: " + df.format(ipSemester));
        System.out.println("Kualifikasi: " + konversiIPKeKualifikasi(ipSemester));

        scanner.close();
    }
}
