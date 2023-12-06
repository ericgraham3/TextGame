public class Entity {
    private static int entityIdCounter = 0;
    private final int uniqueID;
    private String name;
    private String alignment;
    private int armorRating = 0;
    private int movementSpeed = 0;
    private int hitPoints = 10;
    private int wounds = 0;
    private int strength = 0;
    private int agility = 0;
    private int stamina = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int rizz = 0;
    private int luck = 0;

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
            System.out.println(attacker.getName() +" deals " +damageAmount +" damage to " +target.getName());
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

    // setters and getters

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

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getRizz() {
        return rizz;
    }

    public void setRizz(int rizz) {
        this.rizz = rizz;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }
}
