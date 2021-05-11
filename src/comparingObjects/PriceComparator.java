package comparingObjects;

import java.util.Comparator;

public class PriceComparator implements Comparator <Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.getItemPrice() - o2.getItemPrice();
    }
}
