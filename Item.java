public class Item {
    private static int itemIdCounter = 0;
    private final int uniqueID;
    String itemType;
    String itemName;
    String itemDescription;

// TODO what is the purpose of itemType if we have subclasses? can you create a subclass from a base class constructor?
    public Item() {
        itemIdCounter++;
        this.uniqueID = itemIdCounter;
    }

    public Item(String itemType, String itemName) {
        itemIdCounter++;
        this.itemType = itemType;
        this.itemName = itemName;
        this.uniqueID = itemIdCounter;
        }

    public String getItemType() {
        return itemType;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
}

