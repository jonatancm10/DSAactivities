package DSA.eetac.upc;

/**
 * Created by Jonatan on 21/11/2016.
 */
public class User extends DAO {
    public int id;
    public String address, name;

    public User(int id, String address, String name) {
        super();
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

