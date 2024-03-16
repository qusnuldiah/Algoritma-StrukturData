import java.util.Scanner;
public class MainAkar24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan bilangan untuk menghitung akar kuadrat: ");
        int bilangan = sc.nextInt();

        // Menghitung akar kuadrat dengan algoritma Brute Force
        int akarBruteForce = Akar24.AkarBF(bilangan);
        System.out.println("=====================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Akar kuadrat dari " + bilangan + " adalah : " + akarBruteForce);

        // Menghitung akar kuadrat dengan algoritma Divide Conquer
        int akarDivideConquer = Akar24.AkarDC(bilangan);
        System.out.println("=====================================================");
        System.out.println("Algoritma Divide dan Conquer");
        System.out.println("Akar kuadrat dari " + bilangan + " adalah : " + akarDivideConquer);
        System.out.println("=====================================================");
        sc.close();
    }
}
