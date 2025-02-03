public class Pessoa {

    public String nome;
    public int idade;
    public double altura;
    public double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void malhar(double q) {
        this.peso += q;
    }
}
