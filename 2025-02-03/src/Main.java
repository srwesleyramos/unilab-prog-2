public class Main {

    public static void main(String[] args) {
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
}
