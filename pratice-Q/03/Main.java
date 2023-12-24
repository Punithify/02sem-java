public class Main {
    static void increment(int index) {
        index++;
    }

    public static void main(String[] args) {
        int i = 0;
        increment(i);
        i++;
        System.out.println(i);
    }

}
