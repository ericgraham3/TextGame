import java.util.ArrayList;

public class Location {
    private static int locationIdCounter = 0;
    private String name;
    private String description;
    private int uniqueID;
    private ArrayList<Object> location = new ArrayList<>();

    public Location(String name, String description) {
        locationIdCounter++;
        this.name = name;
        this.description = description;
        this.uniqueID = locationIdCounter;
    }

    public void addEntity(Entity entity){
        location.add(entity);
    }

    public void addItem(Item item){
        location.add(item);
    }

    public Entity getEntity(String name) {
        for (Object obj : location) {
            if (obj instanceof Entity) {
                Entity entity = (Entity) obj;
                if (entity.getName().equals(name)) {
                    return entity;
                }
            }
        }
        return null;
    }

    public Item getItem(String name) {
        for (Object obj : location) {
            if (obj instanceof Item) {
                Item item = (Item) obj;
                if (item.getItemName().equals(name)) {
                    return item;
                }
            }
        }
        return null;
    }

    public Item getItem() {
        for (Object obj : location) {
            if (obj instanceof Item) {
                Item item = (Item) obj;
                System.out.println(item);
                return item;
                }
            }
        return null;
    }

    public Item testGet(Item object) {
        Item item = (Item) location.remove(location.indexOf(object));
        return item;
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

    public ArrayList<Object> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Object> location) {
        this.location = location;
    }

    public int getUniqueID() {
        return uniqueID;
    }
}

