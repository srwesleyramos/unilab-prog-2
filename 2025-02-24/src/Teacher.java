public class Teacher extends User {

    private final String regime;

    public Teacher(String name, String[] disciplines, int id, String regime) {
        super(name, disciplines, id, "Professor");

        this.regime = regime;
    }
}
