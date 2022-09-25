import java.util.Random;

public class Producer implements Runnable {

    private Buffer buffer;
    private final int rounds;

    public Producer(Buffer buffer, int rounds) {
        this.buffer = buffer;
        this.rounds = rounds;
    }

    public void run() {
        Item nextProduced;
        for (int i = 0; i < rounds; i++) {
            nextProduced = produce();

            while (((buffer.getIn() + 1) % buffer.getSize()) == buffer.getOut()) {}

            buffer.setItem(buffer.getIn(), nextProduced);
            buffer.setIn((buffer.getIn() + 1) % buffer.getSize());
        }
    }

    private Item produce() {
        Random random = new Random();
        int value = random.nextInt(100);
        System.out.println("^ " + value);
        return new Item(value);
    }
}
