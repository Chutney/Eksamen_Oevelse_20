import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<DataObject> listOfDataObjects = new ArrayList<>();

        listOfDataObjects.add(new Student(1,"Noah","noah@noah.dk"));
        listOfDataObjects.add(new Student(2,"Albert","Albert@Albert.dk"));
        listOfDataObjects.add(new User(3,"Peter","peter1234"));

        for(DataObject data : listOfDataObjects) {
            for(String x : data.getData()) {
                System.out.println(x);
            }
        }



    }

}
