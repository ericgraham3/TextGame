package model;

import java.util.ArrayList;

public class Character extends Entity {
    private String playerName;


    public Character() {
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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
