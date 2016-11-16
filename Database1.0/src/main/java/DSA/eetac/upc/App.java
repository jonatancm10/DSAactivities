package DSA.eetac.upc;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        User user1 = new User(1, "address", "Toni");
        user1.insert();
        System.out.println("--------------------------");
        user1.select(1);
        System.out.println("********************************");
        Department floor1 = new Department(2, 50, "floor 1", "main department");
        floor1.insert();
        System.out.println("--------------------------");
        floor1.select(2);

    }
}
