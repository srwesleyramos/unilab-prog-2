package tarefa;

public class Main {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("Wesley", 10101, 6, 7, 5);

        estudante.calcularMedia();
        estudante.imprimirInfo();
    }
}
