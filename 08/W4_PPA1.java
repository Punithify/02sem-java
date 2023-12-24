import java.util.*;
interface Searchable{
    public int search(int start_index, Object key);
}
class Char{
    private char c;
    public Char(char c_) {
        c = c_; // c  =  L
    }
    public boolean equals(Object d) {
            Char chr = (Char) d;  // we converted the object to a Char object
            return (c == chr.c);    // compare L and L
    }
}

class CharArray implements Searchable {
    private Char[] carr;
    public CharArray(Char[] carr_) {
        carr = carr_;  // carr is the character array cA carr = M | I | C | H | E | L |L | E where every element is an object of Char
    }

    public int search(int start_index, Object key) { 
        for (int i = start_index; i < carr.length; i++) {
            if (carr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
}

class FrequencyCounter {
    public static int getFrequency(Searchable ob, Object key) { // takes 2 objects ob and key
        if (ob instanceof CharArray) {
            int num = 0, i = 0;
            i = ob.search(i, key);  //(0, object key)
            while (i > -1) {
                if (i != -1) {
                    num += 1;
                }
                i = ob.search(i + 1, key);
            }
            return num;
        } else
            return 0;
    }
}
class W4_PPA1{
    public static void main(String[] args) {
        String str;
        char c;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine(); // Michelle
        c = sc.next().charAt(0); // L
        Char key = new Char(c); // key is an object of Char and c is a variable.
        Char[] cA = new Char[str.length()]; // cA is a Character Array whichh has all the charachters of str; object of Char
        for(int i = 0; i < str.length(); i++) {
            cA[i] = new Char(str.charAt(i));
        }
        CharArray caObj = new CharArray(cA); // caObj is an object of CHarArray
        System.out.println(FrequencyCounter.getFrequency(caObj, key));
    }
}