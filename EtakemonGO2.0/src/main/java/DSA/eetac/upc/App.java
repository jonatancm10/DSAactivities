package DSA.eetac.upc;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User(1, "Pueblo Paleta", "ASH");
        user1.insert();
        System.out.println("--------------------------");
        user1.select(1);
        user1.update();
        System.out.println("********************************");
        Etakemon etakemon1 = new Etakemon(1,"Pikachu","tipo eléctrico");
        etakemon1.insert();
        System.out.println("--------------------------");
        etakemon1.select(2);
        etakemon1.update();

    }
}
