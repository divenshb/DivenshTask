//// Test01;
////////import java.util.*;
//////////public class ArrayListEx {
//////////    public static void main(String[] args) {
//////////        ArrayList<String> list = new ArrayList<String>();//Creating list
//////////        list.add("Chest & Tricep");
//////////        list.add("Back & Bicep");
//////////        list.add("Shoulder & legs");
//////////
//////////        System.out.println(list);
//////////    }
//////////}
////////
//////////public class ArrayListEx {
//////////    public static void main(String[]args){
//////////     ArrayList<String>list =new ArrayList<String>()  ;
//////////        list.add("Chest & Tricep");
//////////        list.add("Back & Bicep");
//////////        list.add("Shoulder & legs");
//////////        //Traversing list through
//////////        Iterator itr = list.iterator();//Getting the iterator
//////////        while(itr.hasNext()){
//////////            System.out.println(itr.next());
//////////        }
//////////    }
//////////}
//////////public class ArrayListEx {
//////////    public static void main(String[] args){
//////////        ArrayList<Integer>list = new ArrayList<Integer>();
//////////        list.add(22);
//////////        list.add(23);
//////////        list.add(20);
//////////        Iterator itr = list.iterator();
//////////        while(itr.hasNext()) {
//////////
//////////
//////////            System.out.println(itr.next());
//////////        }
//////////    }
//////////}
//////////Iterating ArrayList using For-each loop
//////////public class ArrayListEx {
//////////    public static void main(String[]args){
//////////        ArrayList<String>list = new ArrayList<String>();
//////////        list.add("dbs");
//////////        list.add("jdf");
//////////        list.add("adk");
//////////        list.add("ksl");
//////////
//////////    for (String nsdaa:list)   {
//////////        System.out.println(nsdaa);
//////////    }
//////////    }
//////////}
////////// Get and Set ArrayList
////////public class ArrayListEx {
////////    public static void main(String[]args){
////////        ArrayList<String> AL = new ArrayList<String>();
////////        AL.add("mango");
////////        AL.add("apple");
////////        AL.add("watermelon");
////////        AL.add("orange");
////////        System.out.println("Returning element: " + AL.get(1));
////////        AL.set(1,"Mellon");
////////        for (String fruit: AL){
////////            System.out.println(fruit);
////////        }
////////    }
//////
//////// How to Sort ArrayList
//////package Test01;
//////
//////import java.util.ArrayList;
//////import java.util.Collections;
//////
//////public class ArrayListEx {
//////    public static void main(String[] args) {
//////        ArrayList<String> list1 = new ArrayList<String>();
//////        list1.add("Jawa Bobber 42");
//////        list1.add("Continental GT 650");
//////        list1.add("Interceptor GT 650");
//////        list1.add("Trimup");
//////        //sorting list
//////        Collections.sort(list1);
//////        for (String fruit : list1){
//////            System.out.println(fruit);
//////        }
//////        System.out.println("Sorting numbers....");
//////        ArrayList<Integer>list2= new ArrayList<Integer>();
//////        list2.add(90);
//////        list2.add(100);
//////        list2.add(1);
//////        list2.add((int) 99.00);
//////        //sorting the list
//////        Collections.sort(list2);
//////        for(int number: list2){
//////            System.out.println(number);
//////        }
//////    }
//////}
////package Test01;
////import java.util.Collections;
////import java.util.ArrayList;
////import java.util.Iterator;
////import java.util.Scanner;
////
////public class ArrayListEx {
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter details of student 1");
////        System.out.println("Name: ");
////        String name1 = sc.nextLine();
////        System.out.println("Age: ");
////        int age1 = Integer.parseInt(sc.nextLine());
////        System.out.println("rollno: ");
////        int rollno1 = Integer.parseInt(sc.nextLine());
////        System.out.println("Enter details of student 2");
////        System.out.println("Name: ");
////        String name2 = sc.nextLine();
////        System.out.println("Age: ");
////        int age2 = Integer.parseInt(sc.nextLine());
////        System.out.println("rollno: ");
////        int rollno2 =Integer.parseInt(sc.nextLine());
////        student s1 = new student(name1,age1,rollno1);
////        student s2 = new student(name2,age2,rollno2);
////
////
////        // Creating arraylist
////        ArrayList<student>al = new ArrayList<student>();
////        al.add(s1);
////        al.add(s2);
////        // creating iterator
////
////        Iterator itr = al.iterator();
////        //traversing element of arraylist object
////        while (itr.hasNext()){
////            student st = (student) itr.next();
////            System.out.println(st.rollno+ " "+ st.age+" "+st.name);
////        }
//////        System.out.println("Returning elements: "+al.get(1));
//////        student updateStudent = al.get(0);
//////        updateStudent.setName("Niharika Warghane");
//////        updateStudent.setAge(23);
//////        updateStudent.setrollno(124);
//////        al.set(0,new student("Updated name", "UpdateAge","Updaterollno" ));
//////    }
//////}
////package Test01;
////import java.util.ArrayList;
////import java.util.Scanner;
////
////public class ArrayListEx {
////    public static void main(String[] args) {
////
////        Scanner scanner = new Scanner(System.in);
////        int[] Number = new int[5];
////        ArrayList<String> fruit = new ArrayList<>();
////        System.out.println("Number entered: ");
////        for (int number : Number){
////            System.out.println(number + " ");
////        }
////        System.out.println();
////        fruit.add("Apple");
////        fruit.add("Orange");
////        fruit.add("Pineapple");
////        System.out.println("Fruit: " + fruit);
////
////        // Accessing and modifying elelmts in arraylist
////        System.out.println("First fruit: " + fruit.get(0));
////        fruit.set(0,"Grapes");
////        System.out.println("Modified first fruit: " +fruit.get(0));
////        // Checking if an element exists in Arraylist
////        if (fruit.contains("Apple")){
////System.out.println("Apple is in the list");
////}
////else{
////System.out.println("Apple is not in the list.");
////}
////// Removing  an element from Arraylist
////fruit.remove(0);
////System.out.println("Fruits after removing Apple: " + fruit);
////scanner.close();
////}
////}
//
//package Test01;
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//class HealthData {
//    private LocalDate date;
//    private int heartRate;
//    private int bloodPressure;
//    private double weight;
//
//    public HealthData(LocalDate date, int heartRate, int bloodPressure, double weight) {
//        this.date = date;
//        this.heartRate = heartRate;
//        this.bloodPressure = bloodPressure;
//        this.weight = weight;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public int getheartRate() {
//        return heartRate;
//    }
//
//    public int getBloodPressure() {
//        return bloodPressure;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    //Geeters and setters method
//}
//class Appointment {
//    private LocalDate date;
//    private String healthcareProvider;
//    private String reason;
//
//    public Appointment(LocalDate date, String healthcareProvider, String reason) {
//        this.date = date;
//        this.healthcareProvider = healthcareProvider;
//        this.reason = reason;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
//
//    public String getHealthcareProvider() {
//        return healthcareProvider;
//    }
//
//    public String getReason() {
//        return reason;
//    }
//}
//class Customer{
//    private static String PatientName;
//    private  int age;
//    private ArrayList<HealthData> healthDataHistory;
//    private ArrayList<Appointment> appointments;
//
//    public Customer(String PatientName, int age){
//        this.PatientName=PatientName;
//        this.age=age;
//        this.healthDataHistory = new ArrayList<>();
//        this.appointments = new ArrayList<>();
//    }
//
//    public  java.lang.String getPatientName() {
//        return PatientName;
//    }
//
//    // Methods to add health data and appointments
//    public void addHealthData(HealthData data){
//        healthDataHistory.add(data);
//    }
//    public  void addappointments(Appointment appointment){
//        appointments.add(appointment);
//    }
//
//
//    public ArrayList<HealthData> getHealthDataHistory() {
//        return healthDataHistory;
//    }
//
//    public ArrayList<Appointment> getAppointment() {
//        return appointments;
//    }
//}
//public class ArrayListEx {
//    public static void main(String[]args){
//        Customer customer = new Customer("Abhishek Nikhade",23);
//        // Adding health data
//        HealthData healthData1 = new HealthData(LocalDate.of(2024,4,30),75,120,75);
//        HealthData healthData2 = new HealthData(LocalDate.of(2024,5,1),72,118,80);
//
//        // Adding appointmnet data
//        Appointment appointment1 = new Appointment(LocalDate.of(2024,5,3),"Dr.LalPath","Regular Checkup");
//        Appointment appointment2 = new Appointment(LocalDate.of(2024,5,10),"Metropolis","Lab test");
//        customer.addappointments(appointment1);
//        customer.addappointments(appointment2);
//        // Displaying customer's health data
//        System.out.println("Customer: " + Customer.getPatientName());
//        System.out.println("HealthData: ");
//        //Looping over each health data
//
//        for (HealthData data:customer.getHealthDataHistory()){
//            System.out.println("Date: "+ data.getDate() + ", Heart rate: " + data.getheartRate() + ", BloodPressure: " + data.getBloodPressure() + ", Weight: " + data.getWeight() );
//
//        }
//        // Displaying customer's appointment
//        System.out.println("\nAppointment: ");
//        for (Appointment appointment: customer.getAppointment()){
//            System.out.println("Date: " + appointment.getDate() + ", Healthcare Provider: " + appointment.getHealthcareProvider() +
//                    ", Reason: " + appointment.getReason());
//
//        }
//    }
//}