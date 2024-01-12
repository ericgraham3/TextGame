package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Location extends Adventure {
    private static int locationIdCounter = 0;
    private int uniqueID;
    private ArrayList<Object> location = new ArrayList<>();
    private ArrayList<Integer> linkedLocations = new ArrayList<>();
    HashMap<String, String> locationMenu = new HashMap<>();
    private String name;
    private String description;


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

    // TODO do these methods survive? Or is there a better way?

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
    // getters and setters
    public int getUniqueID() {
        return uniqueID;
    }
    public ArrayList<Object> getLocation() {
        return location;
    }

    public void setLocation(ArrayList<Object> location) {
        this.location = location;
    }

    public ArrayList<Integer> getLinkedLocations() {
        return linkedLocations;
    }

    public void setLinkedLocations(ArrayList<Integer> linkedLocations) {
        this.linkedLocations = linkedLocations;
    }

    public void addLinkedLocation(Location location) {
        this.linkedLocations.add(location.getUniqueID());
    }

    public void removeLinkedLocation(Location location) {
        this.linkedLocations.remove(location.getUniqueID());
    }

    public HashMap<String, String> getLocationMenu() {
        return this.locationMenu;
    }

    public void setLocationMenu(HashMap<String, String> locationMenu) {
        this.locationMenu = locationMenu;
    }

    public void addLocationMenu(String key, String value) {
        this.locationMenu.put(key, value);
    }

    public void editLocationMenu(String key, String value) {
        this.locationMenu.replace(key, value);
    }

    public void removeLocationMenu(String key, String value) {
        this.locationMenu.remove(key, value);
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

