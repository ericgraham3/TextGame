public class Treasure extends Item{
    private int value;

    public Treasure(String itemName, int value){
        super.setItemName(itemName);
        super.setItemType("game.Treasure");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
