class Med1 {
    public void treatment() {
        System.out.println("med1");
    }
}

class Med2 extends Med1 {
    public void treatment() {
        System.out.println("med2");
    }
}

class Med3 extends Med2 {
    public void treatment() {
        System.out.println("med3");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        Med1 obj1 = new Med1();
        Med2 obj2 = new Med2();
        Med3 obj3 = new Med3();

        Med3 Dispatch;
        Dispatch = obj3;
        Dispatch.treatment();

    }

}