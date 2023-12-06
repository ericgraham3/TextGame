import java.util.ArrayList;

public class Encounter {
    private String location;
    private ArrayList<Entity> entities = new ArrayList<>();
    private ArrayList<String> menuOptions = new ArrayList<>();

    public void runMenu(){
        for (String o : this.menuOptions){
            System.out.println(o);
        }
    }
}