////////package Test01;
////////
//////////public class exceptionHandling {
//////////    public static void main(String[]args){
//////////        try{
//////////            int data = 90/0;// throw exception
//////////        }
//////////        catch (ArithmeticException e ){
//////////            System.out.println("Can't divide by zero");
//////////        }
//////////    }
//////////}
////////
//////////public class exceptionHandling {
//////////    public static void main(String[]args){
//////////        int i = 20;
//////////        int j = 0;
//////////        int data;
//////////        try{
//////////            data = i/j;
//////////        }
//////////        catch (ArithmeticException e){
//////////            System.out.println(i/(j+2));
//////////        }
//////////    }
//////////}
////////
//////////public class exceptionHandling {
//////////    public static void main(String[] args){
//////////        try {
//////////            int data1 = 30/0;
//////////        }
//////////        catch (ArithmeticException e){
//////////            int data2 = 50/0;
//////////    }
//////////        System.out.println("Rest code");
//////////}}
////////import java.util.Scanner;
////////public class exceptionHandling {
////////    // Using multiple catch block
////////    public static void main(String[] args) {
////////        Scanner MultipleCatch = new Scanner(System.in);
////////
////////        try {
////////            System.out.println("Enter the dividend: ");
////////            int divident = MultipleCatch.nextInt();
////////
////////            System.out.println("Enter the divisor: ");
////////            int divisor = MultipleCatch.nextInt();
////////
////////            int result = divide(divident,divisor);
////////            System.out.println("Result of division: " + result);
////////        } catch (ArithmeticException e) {
////////            System.out.println("cannot divide by zero. Please provide non zero divisor.");
////////        }
////////        catch (Exception e){
////////            System.out.println("An error occured: " + e.getMessage());
////////        }
////////        finally {
////////            MultipleCatch.close();
////////        }
////////    }
////////    private static int divide(int dividend, int divisor) {
////////        return dividend/divisor;
////////    }
//////////}
//////package Test01;
//////import java.io.FileNotFoundException;
//////import java.util.Scanner;
//////import java.io.File;
//////public class exceptionHandling {
//////    public static void main(String[]args){
//////        try {
//////            File file = new File("Examples.txt0");
//////            Scanner sc = new Scanner(file);
//////            while (sc.hasNextLine()) {
//////                System.out.println(sc.nextLine());
//////            }
//////            sc.close();
//////        }
//////        catch (FileNotFoundException e) {
//////           System.out.println("File not found: " + e.getMessage());
//////        }
//////        catch (Exception e){
//////            System.out.println("An error occured: " + e.getMessage());
//////        }
//////    }
//////}'
////package Test01;
////import java.io.FileInputStream;
////import java.io.FileNotFoundException;
////import java.io.FileOutputStream;
////import java.io.IOException;
////
////
////public class exceptionHandling {
////    public static void main(String[]args) throws FileNotFoundException {
////        try {
////            FileInputStream input = new FileInputStream("input.txt");
////        } finally {
////
////        }
////       // try {
////            FileOutputStream output = new FileOutputStream("output.txt");
////        }
////        //byte[] buffer;
//////        try {
//////            buffer = new byte[1024];
//////            int byteRead;
//////            while (byteRead = input.Read(buffer) != -1) {
//////                output.write(buffer, 0, byteRead);
//////            }
//////            System.out.println("File copied successfully");
//////        } catch (IOException e) {
//////            System.out.println("Error writing to output file: " + e.getMessage());
//////        } finally {
//////            buffer.close();
//////
//////     catch
////
////
////        }
////    }
//
//package Test01;
//class Parent{
//    void display() throws Exception {
//        System.out.println("Parent's display method");
//    }
//}
//class Child extends Parent{
//    @Override
//    void display() throws ArithmeticException {
//        System.out.println("Child's display method");
//        int result = 1/0;
//    }
//}
//public class exceptionHandling {
//    public static void main(String[]args){
//        Parent parent = new Child();
//        try
//        {
//            parent.display();
//        } catch (Exception AE) {
//            System.out.println("ArithmaticException caught: " + AE.getMessage());
//        }
//    }
//}
