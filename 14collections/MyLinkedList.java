import java.util.Iterator;
import java.util.LinkedList;

class MyLinkedList {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("hello");
        list.add(1, "between");
        // System.out.println(list.get(0));
        list.addLast("last");
        System.out.println(list.getFirst());
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
