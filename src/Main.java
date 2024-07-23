//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String StringA=sc.next();
//        String StringB=sc.next();
//
//        int sumLength = StringA.length() + StringB.length();
//        System.out.println(sumLength);
//        if(StringA.compareTo(StringB)>0){
//            System.out.println("yes");
////        }
//        else {
//            System.out.println("no");
//        }
////        String capitalizedStringA = capitalizeFirstLetter(StringA);
//        String captitalizedStringB = capitalizeFirstLetter(StringB);
//        System.out.println(capitalizedStringA + " " + captitalizedStringB);
//        sc.close();
//    }
//    public static String capitalizeFirstLetter(String str){
//        if(str ==null || str.isEmpty()){
//            return str;
//        }
//        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
//    }
//}


import javax.swing.text.html.StyleSheet;
import java.util.Locale;

//public class Main {
//    public static void main(String[] args) {
//        // 1. char charAt(int index)
//        String str = "Hello";
//        char ch = str.charAt(0);
//        System.out.println(ch);
//
//        //2. int length()
//        int len = str.length();
//        System.out.println(len);
//
//        // 3. static String format(String format, Object... args)
//        String formattted = String.format("Hello, %s!", "World");
////        System.out.println(formattted);
//
//        // 4. String substring(int beginIndex)
//        String sub1 = str.substring(2);
//        System.out.println(sub1);
//
//        //5. String substring(int beginIndex, int endIndex)
//        String sub2 = str.substring(1,4);
//        System.out.println(sub2);
//
//        // 7. boolean contains(CharSequence s)
//        boolean contains = str.contains("llo");
//        System.out.println(contains);
//
//        // 8. static String join(CharSequence delimiter, CharSequence... elements
//        String joined = String.join("-","dev","Balpande");
//        System.out.println(joined);
//
//        // 9. boolean equals(Object another)
//        boolean isequal = str.equals("Hello");
//        System.out.println(isequal);
//
//        // 10. boolean isEmpty()
//        boolean isEmpty = str.isEmpty();
//        System.out.println(true);

//        // 11. String concat
//        String concat = str.concat("World");
//        System.out.println(concat);
//
//        // 12. String replace(char old, char new)
//        String replaced = str.replace('l','z');
//        System.out.println(replaced);
//
//        // 13.  String replace(CharSequence old, CharSequence new)
//        String replaced2 = str.replace("llo","zzz");
//        System.out.println(replaced2);

//        // 14. static String equalsIgnoreCase(String another)
//        Boolean isEqualIgnoreCase = str.equalsIgnoreCase("HELLO");
//        System.out.println(isEqualIgnoreCase);
//
//        // 15. String[] split(String regex)
//        String [] parts = str.split("l");
//        for(String part : parts){
//            System.out.print(part);
//        }
//
////        // 16. String[] split(String regex, int limit)
//       String [] part2 = str.split("l",3);
//        for (String part : parts) {
//            System.out.println(part);
//        }
//
//        // 17. index of char
//        int index = str.indexOf('l');
//        System.out.println(index);
//
//        // 18.int indexOf(int ch, int fromIndex)
//        int index2 = str.indexOf('l', 3);
//        System.out.println(index2);
//
//        // 19.  int indexOf(String substring)
//        int index3 = str.indexOf("He");
//        System.out.println(index3);
//
//        // 20, int indexOf(String substring, int fromIndex)
//        int index4 = str.indexOf("l",3);
//        System.out.println(index4);

        // 21. String toLowerCase()
//        String lowerCase = str.toLowerCase();
//        System.out.println(lowerCase);
//
//        // 22. String toUpperCase()
//        String UpperCase = str.toUpperCase();
//        System.out.println(UpperCase);
//
//        // 23. String trim()
//        String trimmed = "Hello".trim();
//        System.out.println(trimmed);
//    }
//}

// String class methods
// 1. Returns char value for the particular index
public class Main {
    public static void main(String[] args) {
        String str = "Divensh";
        char ch = str.charAt(0);
        System.out.println(ch);

// Return a string length

        int length = str.length();
        System.out.println(length);

//  Returns a formatted string
         String formatted = str.formatted("divensh %s!","Balapnde") ;
         System.out.println(formatted);

// substring(int beginIndex): Returns a new string that is a substring of this string, starting from the specified index
         String subString = str.substring(2);
        System.out.println(subString);

// substring(int beginIndex, int endIndex)
        String subString2 = str.substring(1,6);
        System.out.println(subString2);

// contains(CharSequence s)
        boolean contains = str.contains("v");
        System.out.println( contains);

// join(CharSequence delimiter, CharSequence... elements)
        String joinned = str.join("-","Divensh","Balpande");
        System.out.println(joinned);

// equals(Object another)
        boolean isEquals = str.equals("Divensh");
        System.out.println(isEquals);

//isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);

// equalsIgnoreCase(String another)
        Boolean IgnoreCase = str.equalsIgnoreCase("Divensh");
        System.out.println(IgnoreCase);

// Concat(string str)
        String concat = str.concat("Balpande");
        System.out.println(concat);

//  replace(char old, char new)
        String replaced = str.replace('D','R');
        System.out.println(replaced);

// String replace(CharSequence old, CharSequence new)
        String replaced2 = str.replace("di","Re");
        System.out.println(replaced2);

//equalsIgnoreCase(String another)
        boolean equalIgnoreCase = str.equalsIgnoreCase("Hello");
        System.out.println(equalIgnoreCase);
    }

}




