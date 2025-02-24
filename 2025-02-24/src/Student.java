public class Student extends User {

    private final double ide;

    public Student(String name, String[] disciplines, int id, double ide) {
        super(name, disciplines, id, "Estudante");

        this.ide = ide;
    }
}
