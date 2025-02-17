public class Main {

    public static int soma(int x, int y) {
        int z;

        z = x + y;

        return z;
    }

    public static int soma(int x, int y, int z) {
        int w;

        w = x + y + z;

        return w;
    }

    public static String soma(String x, String y) {
        String z;

        z = x + y;

        return z;
    }

    public static Complexo soma(Complexo a, Complexo b) {
        return new Complexo(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static void main(String[] args) {
        Complexo a = new Complexo(2, 3);
        Complexo b = new Complexo(4, 5);
        Complexo c;

        c = soma(a, b);

        System.out.println();
        System.out.println("A = " + a.real + " + " + a.imaginary + "i");
        System.out.println("B = " + b.real + " + " + b.imaginary + "i");
        System.out.println("C = " + c.real + " + " + c.imaginary + "i");
        System.out.println();
    }
}
