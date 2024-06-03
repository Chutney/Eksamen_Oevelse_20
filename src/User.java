import java.util.ArrayList;

public class User implements DataObject {

    private int id;
    private String name;
    private String username;

    public User(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        data.add("ID: " + id);
        data.add("Name: "+ name);
        data.add("Username: " + username);

        return data;
    }
}
