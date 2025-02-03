public class Main {

    public static void main(String[] args) {
        testPessoa();

        System.out.println();
        System.out.println("---------- // ----------");
        System.out.println();

        testEstudante();
    }

    public static void testPessoa() {
        Pessoa pessoa = new Pessoa("Abimael", 27, 1.75, 70);

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.altura);
        System.out.println(pessoa.peso);

        pessoa.malhar(3);
        pessoa.malhar(3);
        pessoa.malhar(3);

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.altura);
        System.out.println(pessoa.peso);
    }

    public static void testEstudante() {
        Estudante estudante = new Estudante("Wesley", 10101, 6, 7, 5);

        estudante.calcularMedia();
        estudante.imprimirInfo();
    }
}
