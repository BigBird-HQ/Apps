package arrayListMethods;

public class ArrayListMethods {

    private int counter;
    public boolean isEmpty() {
        return counter == 0;

    }

    public void add(String item) {
        counter++;
    }

    public void remove(String scissors) {
        if (counter == 0) throw new IllegalArgumentException("Can Not Remove From Empty List!");
        counter--;
    }
}
