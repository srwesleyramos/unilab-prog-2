public class Main {

    public static void main(String[] args) {
        /*
         * EXEMPLO 1
         */

        String[] array1 = {
                "Física II",
                "Cálculo Numérico",
                "Técnicas de Programação II",
        };

        User user = new User(
                "André",
                array1,
                1234567,
                "Estudante"
        );

        /*
         * EXEMPLO 2
         */

        String[] array2 = {
                "TCC",
                "Estagio",
                "IC I",
        };

        Student student = new Student(
                "Bianca",
                array2,
                9874532,
                9.8
        );

        /*
         * EXEMPLO 3
         */

        String[] array3 = {
                "Cálculo I",
                "Estrutura de Dados",
        };

        Teacher teacher = new Teacher(
                "Sergio",
                array3,
                2435670,
                "48h DE"
        );

        /*
         * EXEMPLO 4
         */

        User[] users = {user, student, teacher};

        for (int i = 0; i < users.length; i++) {
            users[i].display();
        }
    }
}
