// What is the result?

class test3 {
    public static void checkSomething(String str) {
        int check = 4;
        if (check == str.length()) {
            System.out.print(str.charAt(check -= 1) + ", ");
        } else {
            System.out.print(str.charAt(0) + ", ");
        }
    }

    public static void makinStrings() {
        String s = "Fred";
        s = s + "47";
        s = s.substring(2, 5);
        s = s.toUpperCase();
        System.out.println(s.toString());
        // return s.toString();
    }

    public static void main(String args[]) {
        checkSomething("four");
        checkSomething("tee");
        checkSomething("to");

        // 11Q
        makinStrings();

    }
}

// 21.test("four");
// 22.test("tee");
// test("to");
