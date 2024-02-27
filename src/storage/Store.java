package storage;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final int storeSize = 3;

    private final List<Item> items = new ArrayList<>(storeSize);

    public void addItem(Item item){
        items.add(item);
    }

    public Item getItem(){
        Item item = items.get(0);
        items.remove(0);
        return item;
    }
}
