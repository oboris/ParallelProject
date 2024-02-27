package stop;

public class MyThread extends Thread {
    private final int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum++;
        }
        System.out.println("Parallel thread " + id + " finished " + sum);
    }
}
