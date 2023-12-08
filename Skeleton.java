public class Skeleton extends Antagonist{
    // TODO move this and the warrior weapon stuff all the way up to Entity
    private Weapon equippedWeapon;
    public Skeleton(){
        super.setName("Skeleton ID# " +String.valueOf(this.getUniqueId()));
        Weapon startingWeapon = new ShortSword();
        super.addToInventory(startingWeapon);
        this.setEquippedWeapon(startingWeapon);
        startingWeapon.setEquipped(true);
    }
    public void attack(Entity target) {
        int attackRoll = Mechanics.rollDice(20, 0);
        System.out.println(this.getName() +"'s attack roll is: " +attackRoll);
        System.out.println(target.getName() +"s armor rating is " +target.getArmorRating());
        if (attackRoll >= target.getArmorRating()) {
            int damageAmount = Mechanics.rollDice(equippedWeapon.getDamageSize(), 0);
            System.out.println(this.getName() +"'s damage amount is: " +damageAmount);
            target.takeDamage(damageAmount);
            System.out.println(this.getName() + " deals " + damageAmount + " damage to " + target.getName() + " with their " + equippedWeapon.getItemName());
        } else {
            System.out.println(this.getName() + " attacks " + target.getName() + " with their " + equippedWeapon.getItemName() + " but misses.");
        }
    }
    // getters and setters
    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }
}
