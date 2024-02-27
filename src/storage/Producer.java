package storage;

public class Producer extends Thread {

    private final Store store;
    public Producer(Store store) {
        this.store = store;
        start();
    }

    private int id = 0;
    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            Item item = new Item(++id);
            System.out.println("Produced Item - " + item.getId());
            store.addItem(item);
        }
    }
}
