
//class pen {
//    String color;// Attribute
//    String type;// Attribute
//    public void write(){ // function inside the class is called as Method
//        System.out.println("Writing Something");
//    }
//    void printColor(){// Method
//        System.out.println(this.color);
//    }
//}
//public class Oops {
//    public static void main(String[]Args){ // Main method
//        pen p1 = new pen(); // Object
//        p1.color = "Orange"; // Assigning variable to p1
//        p1.type = "BallPen"; // Assigning variable to p1
//        pen p2 = new pen();
//        p2.color = "Blue"; // Assigning variable to p2
//        p2.type = "Gel"; // Assigning variable to p2
//        p1.printColor(); // Calling the method to print
//        p1.write(); // Calling the method to print
//        p2.printColor(); // Calling the method to print
//        p2.write(); // Calling the method to print
//    }
//}
//class students {
//    String Name;
//    int Age;
//    public  void printInfo(){
//        System.out.println(this.Name);
//        System.out.println(this.Age);
//    }
//    students(String Name , int Age){
//        this.Name = Name; //"this.Name" means taking from attribute.
//        this.Age = Age;   //"Age" means taking from arguments.
//    }
//    }
//    public class Oops {
//    public static void main(String[]args){
//        students s1 = new students("Divensh",23); //
//        s1.printInfo(); // Calling the method
//    }
//}
// Copy constructor
//class Students{
//    String name;
//    int age;
//    String type;
//
//     Students() {
//    }
//
//    public void printInfo() {
//        System.out.println("Name: " + this.name);
//        System.out.println("Age: " + this.age);
//        System.out.println("Type: " + this.type);
//    }
//        Students(Students s2) {
//            this.name = s2.name;
//            this.age = s2.age;
//            this.type = s2.type;
//        }
//    }
//    public class Oops{
//        public static void main(String []args){
//            Students s1= new Students();
//            s1.age= 23;
//            s1.name = "Divensh";
//            s1.type = "daf";
//
//            Students s2 = new Students(s1);
//            s2.printInfo();
//
//
//        }
//    }

import java.util.Scanner;
//class Oops{
//    public static void main(String[]args){
//        ConstructorEx ce = new ConstructorEx("KawasakiNinjaZX10R",10.20,15);
//        double totalMileage  = ce.CalculateMileage();
//        System.out.println("BikeName " + "Mileage is " + totalMileage+ "Kmpl");
//
//    }
//}
