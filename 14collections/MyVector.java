import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector v1 = new Vector(8, 2);
        v1.add(12);
        v1.add(50);
        v1.add("Hello");
        System.out.println(v1.capacity());
        System.out.println(v1.indexOf("hello"));
    }
}
