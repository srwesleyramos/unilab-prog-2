public class SaldoThread extends Thread {

    public static int saldo = 0;

    /*
     * synchronized:
     *   Garante que apenas uma thread por vez possa acessar este método,
     *   evitando condições de corrida e possíveis perdas de dados.
     */

    public static synchronized void sum() {
        saldo++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            sum();
        }
    }
}
