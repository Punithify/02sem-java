abstract class Parent{
  
    abstract void someFun();
    String name="hello";
}



class Child extends Parent{
    void someFun(){
        System.out.println("Hello");
    }
  
}

class Sample{
    public static void main(String args[]){
        Child p=new Child();
        p.someFun();
        System.out.println(p.name);
    }
}
