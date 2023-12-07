import java.util.ArrayList;

public class Character extends Entity {
    private String playerName;
    private String description;

    public Character(String name, String alignment, String playerName, String description){
        super(name, alignment);
        this.playerName = playerName;
        this.description = description;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void lootLocation(Location location) {
        for (int i = 0; i<location.getLocation().size(); i++){ // second and third elements of this loop are evaluated/executed every time we step through loop
            if (location.getLocation().get(i) instanceof Item){
            Item item = (Item) location.getLocation().remove(i);
            this.addToInventory(item);
            i--;
            // i is a pointer!!! how is it moving through data structure?
            }
            else {
                System.out.println("Not an item");
            }
        }
        System.out.println("Items in inventory: " +this.getInventory().size());
        }
    }
