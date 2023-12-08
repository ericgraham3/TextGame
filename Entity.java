import java.util.ArrayList;

public class Entity {
    private static int entityIdCounter = 0;
    private final int uniqueId;
    private String name;
    private String alignment;
    private int armorRating = 0;
    private int hitPoints = 10;
    private int wounds = 0;
    private int initiative = 0;
    private int armorBonus;
    private int attackBonus;
    private int damageBonus;
    private ArrayList<Item> inventory = new ArrayList<>();
    private String description;
    private Weapon equippedWeapon;

    // constructor
    public Entity(){
        entityIdCounter++;
        this.uniqueId = entityIdCounter;
    }
    // functional methods

    public void attack(Entity target){
        int attackRoll = Mechanics.rollDice(20, this.attackBonus);
        System.out.println(this.getName() +"'s attack roll is: " +attackRoll);
        System.out.println(target.getName() +"s armor rating is " +target.getArmorRating());
        if (attackRoll >= target.getArmorRating()){
            int damageAmount = Mechanics.rollDice(this.getEquippedWeapon().getDamageSize(), this.damageBonus);
            target.takeDamage(damageAmount);
            System.out.println(this.getName() +"'s damage amount is: " +damageAmount);
            System.out.println(this.getName() +" deals " +damageAmount +" damage to " +target.getName()  +" with their " + this.getEquippedWeapon().getItemName());
        }
        else {
            System.out.println(this.getName() +" attacks " +target.getName() +" with their " + this.getEquippedWeapon().getItemName() +" but misses.");
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

    public int getUniqueId() {
        return uniqueId;
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

    public int getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(int armorBonus) {
        this.armorBonus = armorBonus;
    }

    public void increaseArmorBonus(int armorBonus) {
        this.armorBonus += armorBonus;
    }

    public void decreaseArmorBonus(int armorBonus) {
        this.armorBonus -= armorBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void increaseAttackBonus(int attackBonus) {
        this.attackBonus += attackBonus;
    }

    public void decreaseAttackBonus(int attackBonus) {
        this.attackBonus -= attackBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    public void increaseDamageBonus(int damageBonus) {
        this.damageBonus += damageBonus;
    }

    public void decreaseDamageBonus(int damageBonus) {
        this.damageBonus -= damageBonus;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }
}
