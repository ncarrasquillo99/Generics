import java.util.ArrayList;
import java.util.List;

class Container<T> {
    private final List<T> items = new ArrayList<>();

    // Adding an item to the container
    public void add(T item) {
        items.add(item);
    }

    // Print the contents of the container
    public void printItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
