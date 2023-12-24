class Restricted{
    static String something="hello";
}


class StaticProg extends Restricted{
    public static void main(String[] args) {
        System.out.println(Restricted.something);
    }
}
