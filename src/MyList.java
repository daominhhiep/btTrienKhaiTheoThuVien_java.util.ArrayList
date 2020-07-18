import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elements[index];
    }

    private void ensureCap() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void addFirst(E element) {
        if (size == elements.length) {
            ensureCap();
        }
        for (int elementsIndex = size - 1; elementsIndex >= 0; elementsIndex--) {
            elements[elementsIndex + 1] = elements[elementsIndex];
        }
        elements[0] = element;
        size++;
    }

    public void addLast(E element) {
        if (size == elements.length) {
            ensureCap();
        }
        elements[size++] = element;
    }

    public void add(E element, int index) {
        if (size == elements.length) {
            ensureCap();
        }
        for (int elementsIndex = size - 1; elementsIndex >= index; elementsIndex--) {
            elements[elementsIndex + 1] = elements[elementsIndex];
        }
        elements[index] = element;
        size++;
    }

    public boolean add(E element) {
        if (size == elements.length) {
            return false;
        }
        elements[size++] = elements;
        return true;
    }

    public void removeFirst() {
        for (int elementsIndex = 0; elementsIndex < size; elementsIndex++) {
            elements[elementsIndex] = elements[elementsIndex + 1];
        }
        size--;
    }

    public void removeLast() {
        size--;
    }

    public void remove(int index) {
        for (int elementsIndex = index; elementsIndex < size; elementsIndex++) {
            elements[elementsIndex] = elements[elementsIndex + 1];
        }
        size--;
    }

    public Object clone() {
        MyList cloneList = new MyList();
        cloneList.elements = this.elements;
        cloneList.size = this.size;
        return cloneList;
    }

    public boolean isContain(E element) {
        for (int index = 0; index < size; index++) {
            if (elements[index] == element) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E element) {
        for (int index = 0; index < size; index++) {
            if (elements[index] == element) {
                return index;
            }
        }
        return -1;
    }

    public void clear() {
        for (int index = 0; index < size; index++) {
            elements[index] = null;
        }
    }

}