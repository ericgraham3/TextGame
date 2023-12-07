public class Treasure extends Item{
    private int value;
// TODO are we correctly constructing treasure?
    public Treasure(String itemName, int value){
        super.setItemName(itemName);
        super.setItemType("Treasure");
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
