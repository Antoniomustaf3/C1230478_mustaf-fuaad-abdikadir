import java.util.Arrays;
import java.util.EmptyStackException;

public class AdvancedStackDemo {
    public static void main(String[] args) {
        // Samee stack cusub
        DataPile<Integer> tiroPile = new DataPile<>();

        // Ku dar waxyaabo
        tiroPile.addData(100);
        tiroPile.addData(200);
        tiroPile.addData(300);

        // Muuji stack-ka
        tiroPile.showData();

        // Daawo waxa ugu sareeya
        System.out.println("Waxa ugu sareeya: " + tiroPile.viewTop());

        // Ka saar hal shay
        System.out.println("Shay laga saaray: " + tiroPile.removeData());

        // Muuji mar kale
        tiroPile.showData();

        // Ku dar wax kale
        tiroPile.addData(400);
        tiroPile.addData(500);

        // Muuji stack-ka ugu dambeeya
        tiroPile.showData();

        // Tirada guud
        System.out.println("Tirada guud ee stack-ka: " + tiroPile.totalCount());

        // Hubi haddii uu madhan yahay
        System.out.println("Miyaan madhanahay? " + tiroPile.isPileEmpty());
    }
}

class DataPile<T> {
    private static final int DEFAULT_LIMIT = 2;
    private int topPointer;
    private T[] elements;

    // Constructor aan argument lahayn
    DataPile() {
        this(DEFAULT_LIMIT);
    }

    // Constructor leh capacity
    DataPile(int capacity) {
        topPointer = 0;
        elements = (T[]) (new Object[capacity]);
    }

    // totalCount (tirada waxyaabaha)
    public int totalCount() {
        return topPointer;
    }

    // addData (ku dar)
    public void addData(T item) {
        if (totalCount() == elements.length)
            growSize();
        elements[topPointer] = item;
        topPointer++;
    }

    // removeData (ka saar)
    public T removeData() {
        if (isPileEmpty())
            throw new EmptyStackException();
        T removed = elements[--topPointer];
        elements[topPointer] = null;
        return removed;
    }

    // viewTop (eeg waxa ugu sareeya)
    public T viewTop() {
        if (isPileEmpty())
            throw new EmptyStackException();
        return elements[topPointer - 1];
    }

    // isPileEmpty (hubi madhnaanta)
    public boolean isPileEmpty() {
        return topPointer == 0;
    }

    // growSize (balaadhi xadka)
    private void growSize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    // showData (muuji waxyaabaha)
    public void showData() {
        if (isPileEmpty())
            throw new EmptyStackException();
        System.out.println("Waxyaabaha ku jira stack-ka waa:");
        for (int i = 0; i < topPointer; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
