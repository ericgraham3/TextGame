public class Skeleton extends Antagonist{
    String description;
    Weapon weapon = new Weapon("rusty short sword");
    public Skeleton(String name, String alignment, int location, String description){
        super(name, alignment);
        this.description = description;
        super.setArmorRating(10);
    }
    public void attack(Entity target) {
        int attackRoll = Mechanics.rollDice(20, 0);
        System.out.println(this.getName() +"'s attack roll is: " +attackRoll);
        System.out.println(target.getName() +"s armor rating is " +target.getArmorRating());
        if (attackRoll >= target.getArmorRating()) {
            int damageAmount = Mechanics.rollDice(weapon.getDamageSize(), 0);
            System.out.println(this.getName() +"'s damage amount is: " +damageAmount);
            target.takeDamage(damageAmount);
            System.out.println(this.getName() + " deals " + damageAmount + " damage to " + target.getName() + " with their " + weapon.getItemName());
        } else {
            System.out.println(this.getName() + " attacks " + target.getName() + " with their " + weapon.getItemName() + " but misses.");
        }
    }

}
