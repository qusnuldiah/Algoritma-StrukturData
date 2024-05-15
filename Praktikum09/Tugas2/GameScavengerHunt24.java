package Tugas2;

import java.util.Scanner;

public class GameScavengerHunt24 {
    Poin24 head;
    Poin24 currentPoint;
    int totalPoin;

    public void tambahPoint(String pertanyaan, String jawaban, int poin) {
        Poin24 newPoint = new Poin24(pertanyaan, jawaban, poin, null);
        if (head == null) {
            head = newPoint;
            currentPoint = head;
        } else {
            Poin24 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newPoint;
        }
    }

    public void mulaiPermainan() {
        Scanner sc = new Scanner(System.in);
        Poin24 current = head;
        while (current != null) {
            System.out.println("====================================================================");
            System.out.println(current.pertanyaan);
            System.out.print("Jawaban Anda: ");
            String jawabanUser = sc.nextLine();
            if (jawabanUser.equalsIgnoreCase(current.jawaban)) {
                System.out.println("Benar! Anda mendapatkan " + current.poin + " poin.");
                totalPoin += current.poin;
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
            current = current.next;
        }
        System.out.println("====================================================================");
        System.out.println("Selamat! Anda menemukan harta karun dengan total poin " + totalPoin + "!");
        sc.close();
    }
}
