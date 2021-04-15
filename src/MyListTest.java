import java.lang.reflect.Array;

public class MyListTest {
    public static void main(String[] args) {
        MyList arr = new MyList(6);
        arr.add(7);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        Object[] arr2 = null;
        arr2 = (Object[]) arr.clone();
        System.out.println(arr.get(4));
    }
}
