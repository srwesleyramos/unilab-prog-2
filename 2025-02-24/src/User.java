import java.util.StringJoiner;

public class User {

    private final int id;
    private final String name, profile;
    private final String[] disciplines;

    public User(String name, String[] disciplines, int id, String profile) {
        this.name = name;
        this.disciplines = disciplines;
        this.id = id;
        this.profile = profile;
    }

    public void display() {
        StringJoiner joiner = new StringJoiner(", ");

        for (int i = 0; i < this.disciplines.length; i++) {
            joiner.add(this.disciplines[i]);
        }

        System.out.println(this.name + " - #" + this.id);
        System.out.println("  Cargo atual: " + this.profile);
        System.out.println("  Disciplinas: " + joiner);
    }
}
