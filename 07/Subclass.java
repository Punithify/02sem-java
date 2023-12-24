class Main{
    Main(){
        System.out.println("main constructor name called");
    }
    void subClassAccess(){
        Sub s1=new Sub();
        s1.doSomething();
    }

    class Sub{
        Sub(){
            super();
        }
        void doSomething(){
            System.out.println("Sub class method called");
        }
    }
}

class Subclass{
    public static void main(String[] args) {
        Main main=new Main();
        main.subClassAccess();
    }
}