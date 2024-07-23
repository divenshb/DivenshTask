//package Test01;
////
////
////
////public class arrayEx {
////    public static void copyArray(int[]arr1, int[]arr2) {
////        for (int i = 0; i < arr1.length; i++) {
////            arr2[i] = arr1[i];
////        }
////    }
////    public static void printArray(int[] arr) {
////        for (int i =0; i<arr.length; i++){
////            System.out.print(arr[i] + " ");
////            }
////        System.out.println();
////        }
////        public static void main (String[]args){
////            int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////            int[] arr2 = new int[arr1.length];
////            System.out.println("Before Copying");
////            printArray(arr1);
////            copyArray(arr1,arr2);
////            System.out.println("Array after Copying");
////            printArray(arr2);
////
////        }
////    }
//
//
////public class arrayEx {
////    public static void leftRotate(int [] arr, int n){
////   for (int i =0; i<n; i++) {
////       //Store the first element of array
////       int first;
////       int j;
////       first = arr[0];
////       for (j = 0; j < arr.length - 1; j++) {
////           arr[j] = arr[j + 1];
////       }
////       arr[j] = first;
////   }
////    }
////    public static void printArray(int[]arr){
////        for (int i = 0; i< arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
////        System.out.println();
////    }
////    public static void main(String[] args){
////        int [] arr = {1, 2, 3, 4, 5};
////        int n =3;
////        System.out.println("Original Array");
////        printArray(arr);
////        leftRotate(arr,n);
////        System.out.println("After left rotate");
////        printArray(arr);
////    }
////}
////
//
////public class arrayEx {
////    public static void leftRotate(char[] arr,int n){
////        for (int k =0; k<n; k++){
////            int j ;
////            char first = arr[0];
////            for ( j = 0; j<arr.length-1; j++){
////                arr[j] = arr[j+1];
////            }
////            arr[j] = first;
////        }
////    }
////    public static void printArray(char[]arr){
////        for (int i =0; i< arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
////        System.out.println();
////    }
////    public static void main (String[]args){
////        char [] arr = { 'h','s','n','e','v','i','d'};
////        int n = 4;
////        System.out.println("Char before");
////        printArray(arr);
////        leftRotate(arr,n);
////        System.out.println("Char after");
////        printArray(arr);
////    }
////}
//
////public class arrayEx {
////    public static void main(String[]args){
////        int []arr= {1,2,3,4,5,6,7,8,9,10};
////        for (int i = 0; i< arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
////    }
////}
////public class arrayEx {
////    public static void main(String[]args){
////        int [] arr = {1,2,3,4,5};
////        for (int i = 0; i<arr.length; i++){
////            System.out.println(arr[i] + " ");
////        }
////        System.out.println();
////    }
//
////}
//package Test01;
//
//public class  {
//    protected double balance;
//
//    public BankAccount(double balance) {
//        this.balance = balance;
//    }
//
//    // Method for withdrawing funds.
//    public void withdraw(double amount) throws InsufficientFundException {
//        if (amount > balance) {
//            throw new InsufficientFundException("Insufficient fund in the account");
//        }
//        balance = balance - amount;
//        System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
//    }
//
//}
//
//// Exception class for handling insufficient funds
//class InsufficientFundException extends Exception {
//    public InsufficientFundException(String message) {
//        super(message);
//    }
//}
//
//// Child class representing a saving account.
//class SavingAccount extends BankAccount {
//    private double minBalance;
//
//    public SavingAccount(double balance, double minBalance) {
//        super(balance);
//        this.minBalance = minBalance;
//    }
//
//    // Overriding withdraw method with additional check for minimum balance
//    @Override
//    public void withdraw(double amount) throws InsufficientFundException {
//        if (balance - amount < minBalance) {
//            throw new InsufficientFundException("Minimum balance requirement not met");
//        }
//        super.withdraw(amount);
//    }
//}
//
//// Child class representing a checking account
//class CheckingAccount extends BankAccount {
//    private double overdraftLimit;
//
//    public CheckingAccount(double balance, double overdraftLimit) {
//        super(balance);
//        this.overdraftLimit = overdraftLimit;
//    }
//
//    // Overriding withdraw method with additional check for overdraft limit
//    @Override
//    public void withdraw(double amount) throws InsufficientFundException {
//        if (amount > balance + overdraftLimit) {
//            throw new InsufficientFundException("Exceeds overdraft limit");
//        }
//        super.withdraw(amount);
//    }
//}
//
//class BankAccountExample {
//    public static void main(String[] args) {
//        // Creating a saving account object
//        SavingAccount sa = new SavingAccount(2000, 100);
//
//        // Creating a checking account object
//        CheckingAccount CA = new CheckingAccount(2000, 1000);
//        try {
//            // Attempting withdrawals
//            sa.withdraw(200);
//            CA.withdraw(1500);
//        } catch (InsufficientFundException e) {
//            System.out.println("Exception caught: " + e.getLocalizedMessage());
//        }
//    }
//}