import java.util.ArrayList;

public class Student implements DataObject {


    private int id;
    private String name;
    private String email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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
        data.add("Email: " + email);

        return data;
    }
}
