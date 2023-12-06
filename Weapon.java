public class Weapon extends Item{
    private int damageSize;
    public Weapon (String itemName){
        super.setItemType("game.Weapon");
        super.setItemName(itemName);
        switch (itemName) {
            case "longsword":
                this.damageSize = 8;
                break;
            case "battle axe":
                this.damageSize = 12;
                break;
            case "longbow":
                this.damageSize = 6;
                break;
            case "rusty short sword":
                this.damageSize = 4;
                break;
            default:
                throw new IllegalArgumentException("Invalid weapon: " + itemName);
            }
    }
    public int getDamageSize() {
        return damageSize;
    }
    public void setDamageSize(int damageSize) {
        this.damageSize = damageSize;
    }
}
