package Tugas2;

public class Main24 {
    public static void main(String[] args) {
        GameScavengerHunt24 game = new GameScavengerHunt24();

        game.tambahPoint("Apa planet terdekat dengan Matahari ?", "merkurius", 20);
        game.tambahPoint("Planet apakah yang memiliki cincin paling spektakuler dalam Tata Surya ?", "saturnus", 30);
        game.tambahPoint("Planet apakah yang dikenal sebagai Planet Merah ?", "mars", 50);

        game.mulaiPermainan();
    }
}