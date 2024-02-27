import storage.Consumer;
import storage.Producer;
import storage.Store;
import sum.ArrayWorker;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Part 1
//        System.out.println("Hello and welcome!");
//
//        stop.Stoper stoper = new stop.Stoper(4);
//
//        stop.MyRunnable myRunnable = new stop.MyRunnable(3, stoper);
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//
//        new Thread(new stop.MyRunnable(4, stoper)).start();
//
//        new Thread(new stop.MyRunnable(5, stoper)).start();
//
//        new Thread(new stop.MyRunnable(6, stoper)).start();
//
//        new Thread(new stop.MyRunnable(7, stoper)).start();

// Part 2
//        ArrayWorker arrayWorker = new ArrayWorker();
//        System.out.println(arrayWorker.getSum());
//        System.out.println(arrayWorker.getParallelSum());

// Part 3
        Store store = new Store();
        new Consumer(store);
       // new Producer(store);
    }
}