public class Main {

    public static void main(String[] args) {
        Buffer buffer = new Buffer(4);
        Producer producer = new Producer(buffer, 12);
        Consumer consumer = new Consumer(buffer, 12);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
