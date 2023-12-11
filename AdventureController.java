import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdventureController {
    private Location model;
    private AdventureView view;

    public AdventureController (Location model, AdventureView view) {
        this.model = model;
        this.view = view;
    }

    // control Location object

    public int getUniqueId () {
        return model.getUniqueID();
    }

    public ArrayList<Object> getLocation() {
        return model.getLocation();
    }

    public void setLocation(ArrayList<Object> location) {
        model.setLocation(location);
    }

    public ArrayList<Integer> getLinkedLocations() {
        return model.getLinkedLocations();
    }

    public void setLinkedLocations(ArrayList<Integer> linkedLocations) {
        model.setLinkedLocations(linkedLocations);
    }

    public void addLinkedLocation(Location location) {
        model.addLinkedLocation(location);
    }

    public void removeLinkedLocation(Location location) {
        model.removeLinkedLocation(location);
    }

    public HashMap<String, String> getLocationMenu() {
        return model.getLocationMenu();
    }

    public void setLocationMenu(HashMap<String, String> locationMenu) {
        model.setLocationMenu(locationMenu);
    }

    public void addLocationMenu(String key, String value) {
        model.addLocationMenu(key, value);
    }

    public void removeLocationMenu(String key, String value) {
        model.removeLocationMenu(key, value);
    }

    public void editLocationMenu(String key, String value) {
        model.editLocationMenu(key, value);
    }

    public String getLocationName () {
        return model.getName();
    }

    public void setLocationName(String locationName) {
        model.setName(locationName);
    }

    public String getLocationDescription() {
        return model.getDescription();
    }

    public void setLocationDescription(String locationDescription) {
        model.setDescription(locationDescription);
    }

    // control AdventureView object

    public void printViewNarrative(String narrative) {
        view.printNarrative(narrative);
    }

    public void printViewLink(String link) {
        view.printLink(link);
    }

    public void printViewSearch(String search) {
        view.printSearch(search);
    }

    public void printViewLoot(String loot) {
        view.printLoot(loot);
    }

    public void printViewEmpty(String empty) {
        view.printEmpty(empty);
    }

    public void adventureMenu() {
        HashMap<String, String> locationMenu = getLocationMenu();
        System.out.println("Location Name: " +model.getName());
        System.out.println("Location Description: " +model.getDescription());
        for (Map.Entry<String, String> entry : locationMenu.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equals("narrative1")) {
                printViewNarrative(value);
            }
            else if (key.equals("search")) {
                printViewSearch(value);
            }
            else if (key.equals("link1")) {
                printViewLink(value);
            }
            else {
                System.out.println("No locationMenu entries for this location");
            }
        }
    }

}
