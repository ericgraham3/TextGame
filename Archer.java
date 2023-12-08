public class Archer extends Warrior{
    public Archer(String name, String playerName, String alignment, String description) {
        super.setName(name);
        super.setAlignment(alignment);
        super.setArmorRating(10);
        super.setDescription(description);
        super.setPlayerName(playerName);
        super.setAttackBonus(3);
        // create a starting weapon, add it to inventory and equip it
        Weapon startingWeapon = new LongBow();
        super.addToInventory(startingWeapon);
        super.setEquippedWeapon(startingWeapon);
        startingWeapon.setEquipped(true);
    }
}
