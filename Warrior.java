public class Warrior extends Character {
    private Weapon equippedWeapon;
    private int armorBonus;
    private int attackBonus;
    private int damageBonus;

    public Warrior() {
    }

    // functional methods
    // TODO what makes a warrior's attack method special?
    public void attack(Entity target){
        int attackRoll = Mechanics.rollDice(20, this.attackBonus);
        System.out.println(this.getName() +"'s attack roll is: " +attackRoll);
        System.out.println(target.getName() +"s armor rating is " +target.getArmorRating());
        if (attackRoll >= target.getArmorRating()){
            int damageAmount = Mechanics.rollDice(equippedWeapon.getDamageSize(), this.damageBonus);
            target.takeDamage(damageAmount);
            System.out.println(this.getName() +"'s damage amount is: " +damageAmount);
            System.out.println(this.getName() +" deals " +damageAmount +" damage to " +target.getName()  +" with their trusty " + equippedWeapon.getItemName());
        }
        else {
            System.out.println(this.getName() +" attacks " +target.getName() +" with their trusty " + equippedWeapon.getItemName() +" but misses.");
        }
    }

    // getters and setters

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
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
}