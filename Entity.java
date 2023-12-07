import java.util.ArrayList;

public class Entity {
    private static int entityIdCounter = 0;
    private final int uniqueID;
    private String name;
    private String alignment;
    private int armorRating = 0;
    private int hitPoints = 10;
    private int wounds = 0;
    private int initiative = 0;

    private ArrayList<Item> inventory = new ArrayList<>();

    // constructor
    public Entity(String name, String alignment){
        entityIdCounter++;
        this.name = name;
        this.alignment = alignment;
        this.uniqueID = entityIdCounter;
    }
    // functional methods

    public void attack(Entity attacker, Entity target, int damageSize){
        int attackRoll = Mechanics.rollDice(20, 0);
        if (attackRoll >= target.armorRating){
            int damageAmount = Mechanics.rollDice(damageSize, 0);
            target.takeDamage(damageAmount);
            System.out.println(attacker.getName() +" attacks " +target.getName() +" and deals " +damageAmount +" damage to them.");
        }
        else {
            System.out.println(attacker.getName() +" attacks " +target.getName() +" but misses.");
            }
        }
    public void takeDamage(int damageTaken){
        this.wounds += damageTaken;
    }

    public void increaseArmorRating(int armorBonus){
        this.armorRating += armorBonus;
    }

    public int getCurrentHealth(){
        return this.hitPoints - this.wounds;
    }

    // getters and setters

    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getArmorRating() {
        return armorRating;
    }

    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getWounds() {
        return wounds;
    }

    public void setWounds(int wounds) {
        this.wounds = wounds;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public ArrayList<Item> getInventory() {
        for (Item item : inventory){
            System.out.println(item.getItemName());
        }
        return inventory;
    }
    public void addToInventory(Item item) {
        inventory.add(item);
    }
}
