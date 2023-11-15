package GIT.Patrones.Creacionales.Singleton;

public class Database {

    private static Database instance;

    private Database (){
        
    }

    public static Database getInstance() {
        if (Database.instance == null) {
           return Database.instance = new Database();
        }else {
            return Database.instance;
        }
    }

    public void Query(String data) {
        System.out.println("SELECT FROM " + data);
    }
}
