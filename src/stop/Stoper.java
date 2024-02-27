package stop;

public class Stoper extends Thread {
    private final int stopTime;

    private volatile boolean canStop = false;

    public Stoper(int stopTime) {
        this.stopTime = stopTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(stopTime * 1000L);
            canStop = true;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isCanStop() {
        return canStop;
    }
}
