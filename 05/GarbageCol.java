class Garbage{
    public void show(){
        System.out.println("Garbage collector invoked");;
    }
    public static void main(String args[]){
        Garbage g1=new Garbage();
        Garbage g2=new Garbage();
        g1=null;
        g1=g2;
        g1.show();
        g2.show();
        System.gc();
    }
}