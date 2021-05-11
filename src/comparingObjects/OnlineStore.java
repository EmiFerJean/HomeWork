package comparingObjects;

import java.util.ArrayList;
import java.util.Comparator;

public class OnlineStore {
    public static void main(String[] args)
    {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Shirt", 79));
        items.add(new Item("Short", 50));
        items.add(new Item("Blouse", 80));
        items.add(new Item("Flip-flops", 30));
        items.add(new Item("T-shirt", 85));
        items.add(new Item("Hoodie", 150));
        items.add(new Item("Trousers", 99));


        items.sort(Comparator.naturalOrder());
        System.out.println(items);

        items.sort(Comparator.reverseOrder());
        System.out.println(items);

        items.sort(new PriceComparator());
        System.out.println(items);

        items.sort(new PriceComparator().reversed());
        System.out.println(items);
    }
}