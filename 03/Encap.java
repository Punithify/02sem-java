//encpsulation
class Doctor{
    Doctor(){
        System.out.println("Doctor Constructor");
    }
    void fun(){
        System.out.println("Doctor class");
    }
}

class Nurse extends Doctor{
    Nurse(){
        System.out.println("Nurse Constructor");

    }
    void fun1(){
        System.out.println("Nurse class");
    }
}

class Encap{
   public static void main(String args[]){
    Doctor d1=new Nurse();
    

   } 
}


// Doctor d1=new Nurse();