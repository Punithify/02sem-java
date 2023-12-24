abstract class Bank{
    abstract int getRateOfInterest();
} 
 
class SBI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
 
class ICIC extends Bank{
    int getRateOfInterest(){
        return 10;
    }
}
 

 class Main1{
    int x=6;
    public static void main(String args[]){
      Bank a=new SBI();
      System.out.println(a.getRateOfInterest());
        Bank b=new ICIC();
      System.out.println(b.getRateOfInterest());
    }
}