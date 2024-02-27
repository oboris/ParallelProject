package sum;

import sum.SumThread;

public class ArrayWorker {

    final int n = 100000000;
    int[] myArray = new int[n];
    public ArrayWorker(){
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
    }

    public long getSum() {
        long sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    public long getPartSum(int firstIndex, int lastIndex) {
        long sum = 0;
        for (int i = firstIndex; i < lastIndex; i++) {
            sum += myArray[i];
        }
        return sum;
    }

    long sum = 0;

    int numThread = 3;
    int threadCount = 0;

    synchronized public void setSum(long sum){
        this.sum += sum;
        threadCount++;
        notify();
    }
    public long getParallelSum() {

        new SumThread(0, n / 3, this).start();
        new SumThread(n / 3, 2 * n / 3, this).start();
        new SumThread(2 * n / 3, myArray.length, this).start();

        synchronized (this) {
            while (threadCount < numThread) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return sum;
    }
}
