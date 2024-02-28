public class CanteenDemo {
    public static void main(String[] args) {
        Item24 item1 = new Item24();
        item1.name = "Soto";
        item1.price = 16000;
        item1.stock = 20;

        Item24 item2 = new Item24();
        item2.name = "Sate";
        item2.price = 15000;
        item2.stock = 10;

        Item24 item3 = new Item24();
        item3.name = "Kopi";
        item3.price = 7000;
        item3.stock = 12;

        Item24[] items = {item1, item2, item3};

        for (int i = 0; i < items.length; i++) {
            System.out.println("Item " + (i + 1) + " " + items[i].name + ", price : " + items[i].price + ", stock : " + items[i].stock);
        }
    }
}
