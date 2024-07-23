package org.selenium;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

//public class InterviewQ {
////Reverse a String
////public static void main(String[] args) {
////    String str = "madam";
//    String nstr = "";
//    char ch;
//
//    for (int i =0; i<=str.length(); i++){
//        str = String.valueOf(nstr.charAt(i));
//        nstr = ch + str;
//
//    }
//}
    // Calculate the percentage from marks.
//\(MarksPercentage=(MarksObtained/Totalmarks)x100\)
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int MarksObtained = 0;
//        int TotalMarks = 500;
//        System.out.println("Mathematics marks: ");
//        int Mathematics = sc.nextInt();
//        MarksObtained += Mathematics;
//        System.out.println("Physics marks: ");
//        int Physics = sc.nextInt();
//        MarksObtained += Physics;
//        System.out.println("Chemistry marks: ");
//        int Chemistry = sc.nextInt();
//        MarksObtained += Chemistry;
//        System.out.println("English marks: ");
//        int English = sc.nextInt();
//        MarksObtained += English;
//        System.out.println("Biology marks:  ");
//        int Biology = sc.nextInt();
//        MarksObtained += Biology;
//        double MarkPercentage = (double) MarksObtained/TotalMarks *100;
//        System.out.println("Total Marks Obtained: " + MarksObtained );
//        System.out.println("Percentage: " + MarkPercentage + "%");
//
//    }
//
//}

public class InterviewQ {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                int numQueries = scanner.nextInt();

                for (int i = 0; i < numQueries; i++) {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int n = scanner.nextInt();

                    printSeries(a, b, n);
                }

                scanner.close();
            }

            public static void printSeries(int a, int b, int n) {
                for (int i = 0; i < n; i++) {
                    int term = a + (i * b);
                    System.out.print(term + " ");
                }
                System.out.println();
            }
        }




