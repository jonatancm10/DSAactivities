package dsa;

/**
 * Created by Jonatan on 18/11/2016.
 */
public class Etakemon extends DAO{

    public int id;
    public String name;

    public Etakemon(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
