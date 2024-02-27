public class Dragon24 {
    private int x, y, width, height;
    public Dragon24(int initialX, int initialY, int gameWidth, int gameHeight) {
        x = initialX;
        y = initialY;
        width = gameWidth;
        height = gameHeight;
    }

    public void moveLeft() {
        x--;
        checkCollision();
    }

    public void moveRight() {
        x++;
        checkCollision();
    }

    public void moveUp() {
        y--;
        checkCollision();
    }

    public void moveDown() {
        y++;
        checkCollision();
    }

    public void printPosition() {
        System.out.println("Dragon Position - X: " + x + ", Y: " + y);
    }

    private void checkCollision() {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            detectCollision();
        }
    }

    private void detectCollision() {
        System.out.println("Game Over");
        System.exit(0);
    }

    public static void main(String[] args) {
        Dragon24 dragon = new Dragon24(5, 5, 10, 10);
        dragon.moveRight();
        dragon.printPosition();

        dragon.moveDown();
        dragon.printPosition();

        dragon.moveLeft();
        dragon.printPosition();

        dragon.moveUp();
        dragon.printPosition();
    }
}
