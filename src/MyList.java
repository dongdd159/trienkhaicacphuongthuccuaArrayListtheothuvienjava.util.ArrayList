public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(size++);
        }
        for (int i = size - 1; i >= index; i--) elements[i + 1] = elements[i];
        elements[index] = element;
        size++;
    }
    public E remove(int index){
        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];
        elements[size - 1] = null;
        size--;
        return e;
    }
    public int size(){
        return size;
    }
    public E clone(){
        return (E) elements;
    }
    public boolean contains(E o){
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E o) {
        for (int i = 0; i < size; i++)
            if (o.equals(elements[i])) return i;
        return -1;
    }
    public boolean add (E e){
        if (size == elements.length) {
            ensureCapacity(size++);
        }
        elements[size++] = e;
        return true;
    }
    private void ensureCapacity(int minCapacity) {
        if (size >= elements.length) {
            E[] newElements = (E[]) (new Object[minCapacity]);
            System.arraycopy(elements, 0, newElements, 0, minCapacity);
            elements = newElements;
        }
    }
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException
                    ("index " + i + " out of bounds");
        }else {
            return (E) elements[i];
        }
    }
    public void clear(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
