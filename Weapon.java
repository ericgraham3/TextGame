public class Weapon extends Item{
    private int damageSize;
    private int attackBonus;
    private String weaponDescription;
    private boolean isEquipped = false;

    public Weapon() {
    }

    public Weapon (String itemName){
        this.setItemName(itemName);
    }
    public int getDamageSize() {
        return damageSize;
    }
    public void setDamageSize(int damageSize) {
        this.damageSize = damageSize;
    }

    public String getWeaponDescription() {
        return weaponDescription;
    }

    public void setWeaponDescription(String weaponDescription) {
        this.weaponDescription = weaponDescription;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public boolean isEquipped() {
        return isEquipped;
    }

    public void setEquipped(boolean equipped) {
        isEquipped = equipped;
    }
}
