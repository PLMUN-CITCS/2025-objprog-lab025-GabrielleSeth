class Item {
    // Static variable to keep track of object count
    private static int objectCount = 0;
    
    // Instance variable for item name
    private String itemName;

    // Constructor
    public Item(String itemName) {
        this.itemName = itemName;
        objectCount++;
    }

    // Instance method to display item name
    public void displayItem() {
        System.out.println("Item: " + itemName);
    }

    // Static method to display total objects created
    public static void displayObjectCount() {
        System.out.println("Total objects created: " + objectCount);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        // Creating Item objects
        Item item1 = new Item("Laptop");
        Item item2 = new Item("Smartphone");
        Item item3 = new Item("Tablet");

        // Displaying item details
        item1.displayItem();
        item2.displayItem();
        item3.displayItem();

        // Displaying total objects created
        Item.displayObjectCount();
    }
}
