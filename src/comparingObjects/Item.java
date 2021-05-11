package comparingObjects;

public class Item implements Comparable<Item> {

    private String itemName;
    private int itemPrice;

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }

    public Item(String itemName, int itemPrice) {
                this.itemName = itemName;
                this.itemPrice = itemPrice;
            }

    @Override
    public int compareTo(Item anotherItem) {
        return itemName.compareTo(anotherItem.itemName);
    }

    public int getItemPrice() {
        return itemPrice;
    }
}