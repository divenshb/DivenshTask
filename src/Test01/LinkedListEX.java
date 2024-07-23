//package Test01;
//import java.util.LinkedList;
//import java.util.Scanner;
//class Passenger{
//    private String PassengerName;
//    private int Age;
//
//    public Passenger(String PassengerName, int Age){
//        this.PassengerName = PassengerName;
//        this.Age = Age;
//    }
//    public String getPassengerName(){
//        return PassengerName;
//    }
//    public int getAge(){
//        return Age;
//    }
//    public String toString(){
//        return "PassengerName: " + PassengerName + ", Age: " + Age;
//    }
//}
//
//public class LinkedListEX {
//    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    LinkedList<Passenger> passengerQueue =  new LinkedList<>();
//    System.out.println("Welcome to the Train Reservation System!");
//
//    while (true){
//        System.out.println("\nChoose an option");
//        System.out.println("1. Add a passenger to the queue");
//        System.out.println("2. View the passenger queue");
//        System.out.println("3. Exit");
//
//        int choice = sc.nextInt();
//        sc.nextLine();// Consume newline character
//
//        switch (choice){
//           case 1:
//               System.out.println("Enter passenger details:");
//               System.out.println("Name: ");
//               String PassengerName = sc.nextLine();
//               System.out.println("Age: ");
//               int Age = sc.nextInt();
//               sc.nextLine();
//               Passenger passenger = new Passenger(PassengerName,Age);
//               passengerQueue.add(passenger);
//               System.out.println("Passenger added to the queue successfully!");
//               break;
//
//            case 2:
//                if (passengerQueue.isEmpty()){
//                    System.out.println("Passenger queue is empty.");
//                }
//                else {
//                    System.out.println("Passenger queue:");
//                    for (int i = 0; i<passengerQueue.size(); i++){
//                        System.out.println(passengerQueue.get(i));
//                    }
//                }
//                break;
//
//            case 3 :
//                System.out.println("Exiting the program...");
//                sc.close();
//                System.exit(0);
//
//            default:
//                System.out.println("Invalid choice. Please try again.");
//        }
//    }
//
//
//
//    }
//
//
//}

package Test01;
import java.util.LinkedList;
import java.util.Scanner;

class Passenger{
    String PassengerName;
    int Age;
    String Gender;

    public Passenger(String PassengerName, int Age, String Gender){
        this.PassengerName = PassengerName;
        this.Age = Age;
        this.Gender = Gender;
    }
    public String getPassengerName(){
        return PassengerName;
    }
    public int getAge(){
        return Age;
    }
    public String getGender(){
        return Gender;
    }
    public String toString(){
        return "PassengerName: " + PassengerName + ", Age: " + Age + ", Gender: " + Gender;
    }
}
public class LinkedListEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Passenger> passengerqueue = new LinkedList<>();
        System.out.println("Welcome to Train Reservation System");


        while (true) {
            System.out.println("\nChoose an option");
            System.out.println("1. Add a passenger to the queue");
            System.out.println("2. View the passenger queue");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\nEnter passenger details");
                    System.out.println("Name: ");
                    String PassengerName = scanner.nextLine();
                    System.out.println("Age: ");
                    int Age = scanner.nextInt();
                    System.out.println("Gender: ");
                    String Gender = scanner.nextLine();
                    Passenger passenger = new Passenger(PassengerName,Age,Gender);
                    passengerqueue.add(passenger);
                    System.out.println("Passenger added to the queue successfully!");
                    break;

                case 2:
                    
            }
        }
    }
}