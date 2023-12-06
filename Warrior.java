import java.util.ArrayList;

public class Warrior extends Character {
    private String specialty;
    private Weapon weapon;
    private int armorBonus;
    private int attackBonus;
    private int damageBonus;
    private ArrayList<Item> inventory = new ArrayList<>();

    public Warrior(String specialty, String name, String playerName, String alignment, String description) {
        super(name, alignment, playerName, description);
        this.specialty = specialty;
        super.setArmorRating(10);

        switch (specialty) {
            case "Knight":
                weapon = new Weapon("longsword");
                armorBonus = 3;
                break;
            case "Berserker":
                damageBonus = 3;
                weapon = new Weapon( "battle axe");
                break;
            case "Archer":
                attackBonus = 3;
                weapon = new Weapon( "longbow");
                break;
            default:
                throw new IllegalArgumentException("Invalid specialty: " + specialty);
        }
    }
    // functional methods
    public void attack(Entity target){
        int attackRoll = Mechanics.rollDice(20, this.attackBonus);
        System.out.println(this.getName() +"'s attack roll is: " +attackRoll);
        System.out.println(target.getName() +"s armor rating is " +target.getArmorRating());
        if (attackRoll >= target.getArmorRating()){
            int damageAmount = Mechanics.rollDice(weapon.getDamageSize(), this.damageBonus);
            target.takeDamage(damageAmount);
            System.out.println(this.getName() +"'s damage amount is: " +damageAmount);
            System.out.println(this.getName() +" deals " +damageAmount +" damage to " +target.getName()  +" with their trusty " +weapon.getItemName());
        }
        else {
            System.out.println(this.getName() +" attacks " +target.getName() +" with their trusty " +weapon.getItemName() +" but misses.");
        }
    }

}