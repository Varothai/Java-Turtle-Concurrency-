public class Bob implements Runnable {
    private int positionX, positionY;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.bgcolor("pink");
        bob.penColor(this.penColor);
        bob.speed(20);
            bob.forward(100);
            bob.left(90);
            bob.forward(200);
            bob.left(90);
            bob.forward(200);
            bob.left(90);
            bob.forward(200);
            bob.left(90);
            bob.forward(100);

            bob.forward(100);
            bob.left(90);
            bob.forward(190);
            bob.left(90);
            bob.forward(190);
            bob.left(90);
            bob.forward(50);
            bob.left(90);
            bob.forward(170);
            bob.left(90);
            bob.forward(40);
            bob.left(90);
            bob.forward(160);
            bob.left(90);
            bob.forward(30);
            bob.left(90);
            bob.forward(150);
            bob.left(90);
            bob.forward(20);
            bob.left(90);
            bob.forward(140);
            bob.left(90);
            bob.forward(10);
            bob.left(90);
            bob.forward(130);
    }
}