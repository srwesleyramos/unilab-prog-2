public class Main {

    public static void main(String[] args) {
        SaldoThread s1 = new SaldoThread();
        SaldoThread s2 = new SaldoThread();
        SaldoThread s3 = new SaldoThread();
        SaldoThread s4 = new SaldoThread();

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        try {
            s1.join();
            s2.join();
            s3.join();
            s4.join();
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }

        System.out.println("Saldo final: " + SaldoThread.saldo);
    }
}
