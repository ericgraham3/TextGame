import java.util.ArrayList;

public class Warrior extends Character {
    private String specialty;
    // TODO figure out whether to keep the "weapon" variable in the Warrior class, to do away with it entirely and house in inventory, or something else
    private Weapon weapon;
    private int armorBonus;
    private int attackBonus;
    private int damageBonus;


    public Warrior(String specialty, String name, String playerName, String alignment, String description) {
        super(name, alignment, playerName, description);
        this.specialty = specialty;
        super.setArmorRating(10);

        // TODO probably don't need specialties, maybe just drop archer since range means nothing? Either way, handle this as subclass
        switch (specialty) {
            case "Knight":
                weapon = new Longsword();
                armorBonus = 3;
                break;
            case "Berserker":
                damageBonus = 3;
                weapon = new BattleAxe();
                break;
            case "Archer":
                attackBonus = 3;
                weapon = new LongBow();
                break;
            default:
                throw new IllegalArgumentException("Invalid specialty: " + specialty);
        }
    }
    // functional methods
    // TODO what makes a warrior's attack special?
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