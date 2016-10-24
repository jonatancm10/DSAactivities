package DSA.eetac.upc;

/**
 * Created by Jonatan on 17/10/2016.
 */
public class Department extends DAO {

    public int id;
    public int numWorkers;
    public String name, description;


    public Department(int id, int numWorkers, String name, String description) {
        this.id = id;
        this.numWorkers = numWorkers;
        this.name = name;
        this.description = description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
