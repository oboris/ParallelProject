package stop;

public class MyRunnable implements Runnable{
    private final int id;
    private final Stoper stoper;

    public MyRunnable(int id, Stoper stoper) {
        this.id = id;
        this.stoper = stoper;
    }

    @Override
    public void run() {
        long sum = 0;
        boolean canStop;
        do{
            sum++;
            canStop = stoper.isCanStop();
        } while (!stoper.isCanStop());
        System.out.println("Parallel runnable " + id + " finished " + sum);
    }
}
