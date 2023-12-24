class Data<T> {
    T i;

    public T add(T i) {
        return i;
    }
}

class GenericClass {
    public static void main(String[] args) {
        Data<Integer> m1 = new Data<Integer>();
        Data<String> m2 = new Data<String>();
        System.out.println(m1.add(12));
        System.out.println(m2.add("hello"));
    }
}
