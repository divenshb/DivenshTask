package Test01;
//public class bitmanipulation {
//    public static void main(String[] args){
//        int n = 5;
//        int pos = 1;
//        int bitmask = 1<<pos;
//        int newNumber = bitmask | n;
//        System.out.println(newNumber);
//    }
//}
public class bitmanipulation {
    public static void main(String[] args){
        int n = 10;
        int pos = 4;
        int bitmask = 4<<pos;
        int newNumber = bitmask | n;
        System.out.println(newNumber);

    }
}