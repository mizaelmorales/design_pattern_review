package GIT.Patrones.Creacionales.Singleton;

public class Initialize {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        System.out.println(foo);
        foo.Query("MIZA");

        Database foo2 = Database.getInstance();
        System.out.println(foo);

    }
}
