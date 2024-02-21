import java.util.Scanner;
public class Pemilihan24 {

    private static boolean nilaiAkhir(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    private static String konversiNilai(double nilai) {
        if (nilai > 80 && nilai <= 100) {
            return "A";
        } else if (nilai > 73 && nilai <= 80) {
            return "B+";
        } else if (nilai > 65 && nilai <= 73) {
            return "B";
        } else if (nilai > 60 && nilai <= 65) {
            return "C+";
        } else if (nilai > 50 && nilai <= 60) {
            return "C";
        } else if (nilai > 39 && nilai <= 50) {
            return "D";
        } else {
            return "E";
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================================");
        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = sc.nextDouble();
        System.out.println("====================================");
        System.out.println("====================================");
        if (!nilaiAkhir(nilaiTugas) || !nilaiAkhir(nilaiKuis) || !nilaiAkhir(nilaiUTS) || !nilaiAkhir(nilaiUAS)) {
            System.out.println("Nilai tidak valid. Harap masukkan nilai antara 0-100.");
            return;
        }


        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
        String nilaiHuruf = konversiNilai(nilaiAkhir);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("====================================");
        System.out.println("====================================");
        System.out.println((nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                            nilaiHuruf.equals("C+") || nilaiHuruf.equals("C") ? "SELAMAT ANDA LULUS" : "MAAF ANDA TIDAK LULUS"));
        sc.close();
    }
}
