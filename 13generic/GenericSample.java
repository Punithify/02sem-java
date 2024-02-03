class GenericSample {
    public <E> void printSomething(E[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }

    public static void main(String[] args) {
        String something[] = new String[] { "Hello", "something" };
        GenericSample e = new GenericSample();
        e.printSomething(something);
        Integer something1[] = new Integer[] { 1, 4, 5, };
        GenericSample e1 = new GenericSample();
        e1.printSomething(something1);
    }

}
