public class Main {

    public static Semaforo a = new Semaforo(true, false, false);
    public static Semaforo b = new Semaforo(false, false, true);

    public static void main(String[] args) {
        while (true) {
            if (a.green) { // GREEN - RED = YELLOW - RED
                a.update();
            } else if (a.yellow) { // YELLOW - RED = RED - GREEN
                a.update();
                b.update();
            } else if (b.green) { // RED - GREEN = RED - YELLOW
                b.update();
            } else if (b.yellow) { // RED - YELLOW = GREEN - RED
                b.update();
                a.update();
            }

            System.out.println(a.toString() + " x " + b.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
        }
    }
}