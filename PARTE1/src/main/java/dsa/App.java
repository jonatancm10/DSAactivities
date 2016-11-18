package dsa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User(1,"direccion", "Jona");
        user1.insert();
        user1.select(1);
        Etakemon etakemon1 = new Etakemon(2,"pikachu");
        Etakemon.insert();
        Etakemon.select(2);


    }
}
