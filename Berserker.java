public class Berserker extends Warrior{
    public Berserker(String name, String playerName, String alignment, String description) {
        this.setName(name);
        this.setAlignment(alignment);
        this.setArmorRating(10);
        this.setDescription(description);
        this.setPlayerName(playerName);
        this.setDamageBonus(3);
        // create a starting weapon, add it to inventory and equip it
        Weapon startingWeapon = new BattleAxe();
        this.addToInventory(startingWeapon);
        this.setEquippedWeapon(startingWeapon);
        startingWeapon.setEquipped(true);
    }
}
