
public class Sample {
    public String makinStrings() {
        String s = "Fred";
        s = s + "47";
        s = s.substring(2, 5);
        s = s.toUpperCase();
        return s.toString();
    }

    public static void main(String[] args) {
        // Sample obj = new Sample();
        // System.out.println(obj.makinStrings());

        StringBuilder sb = new StringBuilder("Java");
        String s = "Java";
        if (sb.toString().equals(s.toString())) {
            System.out.println("Match 1");
        } else if (sb.equals(s)) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
        // short s1 = 200;
        // Integer s2 = 400;
        // Long s3 = (long) s1 + s2;
        // String s4 = (String) (s3 * s2);
        // System.out.println(s4);

    }

}
