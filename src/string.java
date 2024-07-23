//public class string {
//    public static void main(String[] args){
//        String str1 = "Bike";
//        String str2 ="BIKE" ;
//        String str3 = "bike";
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str1.equalsIgnoreCase(str3));
//    }
//}

//public class string {
//    public static void main(String[] args){
//        String name = "stringjava";
//        char ch = name.charAt(0);
//        System.out.println(ch);
//    }
//}

import java.util.Locale;

//public class string {
////    public static void main(String[]args){
////        String str = "Investing in yourself in early 20's";
////        int strlength = str.length();
//////
////        System.out.println("Character at 0 index is: " + str.charAt(0));
////        System.out.println("Character at last index is: " + str.charAt(strlength-1));
////    }
////}

//public class string {
//    public static void main(String[]args){
//        String str = "Investing in yourself in early 20's";
//        for (int i = 0;i<=str.length()-1;i++){
//            if(i%2!=0){
//                System.out.println("Char at " + i + " Place "+str.charAt(i));
//            }
//        }

//    }
//}

//public class string {
//    public static void main(String[]args){
//    String str = "Welcome to javatpoint portal";
//    int count = 0;
//    for (int i =0; i<str.length()-1; i++){
//        if (str.charAt(i)=='t'){
//            count++;
//
//        }
//    }
//    System.out.println("Frequency of t is: "+ count);
//
//    }
//
////}
//import java.util.regex.*;
//public class string {
//    public static void main(String[] args){
//        String str = "237637Divensh437247Balpande377432";
//        // Regular expression to match the names
//        String regex = "\\d+([A-Za-z]+)\\d+([A-Za-z]+)";
//        // Create a pattern object
//        Pattern pattern = Pattern.compile(regex);
//        // Create a matcher object
//        Matcher matcher = pattern.matcher(str);
//        // Loop through the matchers and extract name
//        while(matcher.find()){
//            String name1 = matcher.group(1);
//            String name2 = matcher.group(2);
//            System.out.println("String name = \"" + name1 + "\";");
//            System.out.println("String name = \"" + name2 + "\";");
//        }
//    }
//}
////import java.util.regex.*;
//public class string {
//    public static void main(String[] args) {
//        String str = "237637Divensh437247Balpande377432";
//        StringBuilder currentName = new StringBuilder();
//        boolean inName = false;
//
//        int i;
//        for (i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            // Check if the character is a digit
//            if (Character.isDigit(ch)) {
//                if (inName) {
//                    // If currently in name then print
//                    System.out.println("String name = \"" + currentName.toString() + "\";");
//                    // using backslash includes the double qoutes '" "' around te name
//                    currentName.setLength(0); // Reseting the StringBuilder for next name
//                    inName = false;
//                }
//            } else {
//                //If the character is not digit,append it to cureent name
//                currentName.append(ch);
//                inName = true;
//            }
//        }
//        // Print the last name if the string ends with in it.
//        if (i == str.length() - 1 && inName) {
//            System.out.println("String name = \"" + currentName.toString() + "\";");
//        }
//    }
//}

//Example 1: Extracting names separated by commas

//public class string {
//    public static void main(String[]Args){
//        String str = "Divensh,Shivraj,Abhishek,Nakul,Jaydat";
//        StringBuilder currentName = new StringBuilder();
//        for (int i = 0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if (ch!=',') {
//                currentName.append(ch);
//            }
//            else {
//                System.out.println("Name: " + currentName.toString());
//                currentName.setLength(0);
//            }
//        }
//        if (currentName.length()>0){
//            System.out.println("Name: " + currentName.toString());
//        }
//    }
//}

//Example 2: Extracting names from a sentence

//public class string {
//    public static void main(String[] args) {
//        String str = ("Stay always available for important things");
//        StringBuilder currentName = new StringBuilder(); // currentName will store the value.
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if(ch != ' '){
//                currentName.append(ch); // Append means add to string builder
//            }
//            else {
//                System.out.println("Name : " + currentName.toString());
//                currentName.setLength(0);
//            }
//        }
//        if (currentName.length()>0){
//            System.out.println("Name: " +currentName.toString());
//        }
//    }
//}
//Example 3: Extracting names containing digits
//public class string {
//    public static void main(String[]args){
//        String str = "797Divensh2279Balpande331";
//        StringBuilder currentName = new StringBuilder();
//        for (int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            if (Character.isLetter(ch)) {
//                currentName.append(ch);
//            }
//            else {
//                if (currentName.length()>0){
//                    System.out.println("Name : " + currentName.toString());
//                    currentName.setLength(0);
//                }
//
//            }
//        }
//        if (currentName.length()>0){
//            System.out.println("Name: " + currentName.toString());
//        }
//    }
//}

//public class string {
//    public static void main(String[] args){
//        String str = "817323891Automation3878Testing";
//        StringBuilder currentName = new StringBuilder();
//        for (int i = 0; i<str.length();i++){
//            char ch = str.charAt(i);
//            if (Character.isLetter(ch)){
//                currentName.append(ch);
//            }
//            else {
//                if (currentName.length()>0){
//                    System.out.println("Name: \"" + currentName.toString() + "\";");
//                    currentName.setLength(0);
//                }
//            }
//        }
//        if (currentName.length()>0){
//            System.out.println("Name: \"" + currentName.toString()+ "\";");
//        }
//
//    }
//}

//public class string {
//    public static void main(String [] args){
//        String str = "Accept,the,situation";
//        StringBuilder currentName = new StringBuilder();
//        for (int i =0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if ( ch != ','){
//               currentName.append(ch);
//            }
//            else {
//                System.out.println("Character1: \""+ currentName.toString() + "\";");
//                System.out.println("Character2: \""+ currentName.toString() + "\";");
//                currentName.setLength(0);
//            }
//
//        }
//        if (currentName.length()>0){
//            System.out.println("Character3: \"" + currentName.toString() + "\";");
//
//
//    }}
//}


















