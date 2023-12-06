public class Item {
    private static int itemIdCounter = 0;
    private final int uniqueId;
    String itemType;
    String itemName;
    String itemDescription;

// look into why we have two constructors
    public Item() {
        itemIdCounter++;
        this.uniqueId = itemIdCounter;
    }

    public Item(String itemType, String itemName) {
        itemIdCounter++;
        this.itemType = itemType;
        this.itemName = itemName;
        this.uniqueId = itemIdCounter;
        }

    public String getItemType() {
        return itemType;
    }

    public int getUniqueId() {
        return uniqueId;
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

