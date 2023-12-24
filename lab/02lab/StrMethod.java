

class StrMethod{
    public static void main(String[] args){
        String text ="We realizes that while our workers were thriving , the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";

        char result = text.charAt(0);
        System.out.println("CharAt:");
        System.out.println(result);

        System.out.println("compareTo:");
        String text1="We realizes that while our workers were thriving , the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative";
        System.out.println(text.compareTo(text1));

        System.out.println("concat:");
        System.out.println(text.concat(text1));

        System.out.println("contains:");
        System.out.println(text.contains("realizes"));   
        System.out.println(text.contains("e"));   
        System.out.println(text.contains("Hi"));   
        
        System.out.println("endswith:");
        System.out.println(text.endsWith("ive"));   
        System.out.println(text.endsWith("alternative"));  
        System.out.println(text.endsWith("how"));  
        
        System.out.println("equals:");
        System.out.println(text.equals(text1));
        
        System.out.println("equalsIgnoreCase:");
        System.out.println(text.equalsIgnoreCase(text1));
        
        // format()
        String formattedText = String.format("Formatted text: %s", text);
        System.out.println(formattedText);

        // getBytes()
        byte[] textBytes = text.getBytes();
        System.out.println("Text in bytes: " + new String(textBytes));

        // getChars()
        char[] charArray = new char[10];
        text.getChars(5, 15, charArray, 0);
        System.out.println("Extracted characters: " + new String(charArray));

        // indexOf()
        int indexOfThriving = text.indexOf("thriving");
        System.out.println("Index of 'thriving': " + indexOfThriving);

        
        System.out.println("intern:");
        String str = new String("We realizes that while our workers were thriving").intern();  
        String str1 = new String("We realizes that while our workers were thriving").intern();  
        System.out.println(str1 == str);

        System.out.println("isEmpty:");
        String str2 = new String("We realizes that while our workers were thriving , the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative");  
        String str3 = new String("");
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());

        
        String[] words = text.split(" ");
        String joinedText = String.join("-", words);
        System.out.println("Joined text: " + joinedText);

        // lastIndexOf()
        int lastIndexOfVillages = text.lastIndexOf("villages");
        System.out.println("Last index of 'villages': " + lastIndexOfVillages);

        // length()
        int textLength = text.length();
        System.out.println("Text length: " + textLength);

        // replace()
        String replacedText = text.replace("thriving", "prospering");
        System.out.println("Replaced text: " + replacedText);

        // replaceAll()
        String regexReplacedText = text.replaceAll("[0-9]", "X");
        System.out.println("Regex replaced text: " + regexReplacedText);

        // split()
        String[] sentences = text.split("\\.");
        System.out.println("Sentences: ");
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }

        // startsWith()
        boolean startsWithWe = text.startsWith("We");
        System.out.println("Starts with 'We': " + startsWithWe);

        // substring()
        String substring = text.substring(0, 20);
        System.out.println("Substring: " + substring);

        // toCharArray()
        char[] charArray10 = new char[10];  // Rename the variable
        text.getChars(5, 15, charArray10, 0);
        System.out.println("Extracted characters: " + new String(charArray10));

        // toLowerCase()
        String lowerCaseText = text.toLowerCase();
        System.out.println("Lowercase text: " + lowerCaseText);

        // toUpperCase()
        String upperCaseText = text.toUpperCase();
        System.out.println("Uppercase text: " + upperCaseText);

        // trim()
        String trimmedText = text.trim();
        System.out.println("Trimmed text: " + trimmedText);

        // valueOf()
        int number = 42;
        String stringValue = String.valueOf(number);
        System.out.println("String value of number: " + stringValue);

    }

}