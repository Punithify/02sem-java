class LastBench{
    public String thanga="public to all";
    private String pratham="private to his gf";
    String kushal="default to hostel";
    public void setMod(String gfName){
        System.out.println("set a mod to the attributes");
        pratham=gfName;
        System.out.println("Pivate Pratham belongs to "+pratham);

    }   
}


class AccessMode extends LastBench{
    public static void main(String args[]){
        LastBench prathu=new LastBench();
        LastBench lt1=new LastBench();

        prathu.setMod("apoorva");
        System.out.println(lt1.kushal);
        System.out.println(lt1.thanga);
    }
}