public class Semaforo {

    public boolean green, yellow, red;

    public Semaforo(boolean green, boolean yellow, boolean red) {
        this.green = green;
        this.yellow = yellow;
        this.red = red;
    }

    public void update() {
        if (green) {
            this.green = false;
            this.yellow = true;
        } else if (yellow) {
            this.yellow = false;
            this.red = true;
        } else if (red) {
            this.red = false;
            this.green = true;
        }
    }

    @Override
    public String toString() {
        return !green ? (yellow ? "\u001B[33mYELLOW\u001B[0m" : "\u001B[31mRED\u001B[0m") : "\u001B[32mGREEN\u001B[0m";
    }
}
