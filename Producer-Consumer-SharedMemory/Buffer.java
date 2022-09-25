public class Buffer {

    private int size;
    Item[] items;
    private int in;
    private int out;

    public Buffer(int size) {
        this.size = size;
        this.items = new Item[size];
        this.in = 0;
        this.out = 0;
    }

    public int getSize() {
        return size;
    }

    public Item getItem(int index) {
        return items[index];
    }

    public void setItem(int index, Item item) {
        items[index] = item;
    }

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }
}
