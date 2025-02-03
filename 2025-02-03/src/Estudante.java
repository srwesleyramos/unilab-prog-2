public class Estudante {

    public String nome;
    public int matricula;
    public double nota1, nota2, nota3, mediaFinal;

    public Estudante(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularMedia() {
        this.mediaFinal = (nota1 + nota2 + nota3) / 3;
    }

    public void imprimirInfo() {
        System.out.println(this.nome + " - " + this.matricula);
        System.out.println("  N1: " + this.nota1);
        System.out.println("  N2: " + this.nota2);
        System.out.println("  N3: " + this.nota3);
        System.out.println("# Media: " + this.mediaFinal);
    }
}
