public class Skeleton extends Antagonist{

    public Skeleton(){
        this.setName("Skeleton ID# " +String.valueOf(this.getUniqueId()));
        Weapon startingWeapon = new ShortSword();
        this.addToInventory(startingWeapon);
        this.setEquippedWeapon(startingWeapon);
        startingWeapon.setEquipped(true);
    }
    public void attack(Entity target) {
        int attackRoll = Mechanics.rollDice(20, 0);
        System.out.println(this.getName() +"'s attack roll is: " +attackRoll);
        System.out.println(target.getName() +"s armor rating is " +target.getArmorRating());
        if (attackRoll >= target.getArmorRating()) {
            int damageAmount = Mechanics.rollDice(this.getEquippedWeapon().getDamageSize(), 0);
            System.out.println(this.getName() +"'s damage amount is: " +damageAmount);
            target.takeDamage(damageAmount);
            System.out.println(this.getName() + " deals " + damageAmount + " damage to " + target.getName() + " with their " + this.getEquippedWeapon().getItemName());
        } else {
            System.out.println(this.getName() + " attacks " + target.getName() + " with their " + this.getEquippedWeapon().getItemName() + " but misses.");
        }
    }
}
