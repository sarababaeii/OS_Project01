public class Consumer implements Runnable {

    private Buffer buffer;
    private final int rounds;

    private int sum = 0;

    public Consumer(Buffer buffer, int rounds) {
        this.buffer = buffer;
        this.rounds = rounds;
    }

    public void run() {
        Item nextConsumed;
        for (int i = 0; i < rounds; i++) {
            while (buffer.getIn() == buffer.getOut()) {}

            nextConsumed = buffer.getItem(buffer.getOut());
            buffer.setOut((buffer.getOut() + 1) % buffer.getSize());

            consume(nextConsumed);
        }
    }

    private void consume(Item item) {
        sum += item.getValue();
        System.out.println("% " + sum);
    }
}
