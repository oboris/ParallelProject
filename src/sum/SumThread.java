package sum;

public class SumThread extends Thread{

    private final int firstIndex, lastIndex;
    private final ArrayWorker arrayWorker;

    public SumThread(int firstIndex, int lastIndex, ArrayWorker arrayWorker) {
        this.firstIndex = firstIndex;
        this.lastIndex = lastIndex;
        this.arrayWorker = arrayWorker;
    }

    @Override
    public void run() {
        long sum = arrayWorker.getPartSum(firstIndex, lastIndex);
        arrayWorker.setSum(sum);
    }
}
