package storage;

public class Consumer extends Thread {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 7; i++) {
            Item item = store.getItem();
            System.out.println("Get Item - " + item.getId());
        }
    }
}
