//6.  What gets displayed on the screen when the following program is compiled and run. 

public class test {
    public static void main(String args[]) {
        boolean x = true;
        int a;
        if (x)
            a = x ? 1 : 2;
        else
            a = x ? 3 : 4;
        System.out.println(a);
    }
}
