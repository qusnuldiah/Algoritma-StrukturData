import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection24 {
    public static void main(String[] args) {
        Stack <String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");
        fruits.pop(); // Mengeluarkan elemen terakhir
        fruits.push("Strawberry"); // Menambahkan "Strawberry" sebagai elemen terakhir
        // Tambahkan buah "Mango", "Guava", dan "Avocado"
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Konversi Stack menjadi ArrayList
        ArrayList<String> tempList = new ArrayList<>(fruits);

        // Lakukan pengurutan
        Collections.sort(tempList);

        // Konversi kembali ArrayList menjadi Stack
        fruits = new Stack<>();
        for (String fruit : tempList) {
            fruits.push(fruit);
        }

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it =fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
