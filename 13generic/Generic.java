class Generic {

    public <E> void print(E[] s) {
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    // public void print(Integer[] s) {
    // for (int i = 0; i < s.length; i++) {
    // System.out.println(s[i]);
    // }
    // }

    public static void main(String[] args) {
        String something[] = new String[] { "Hello", "something" };
        Generic e = new Generic();
        e.print(something);
        Integer something1[] = new Integer[] { 1, 4, 5, };
        Generic e1 = new Generic();
        e1.print(something1);

    }
}