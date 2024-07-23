////package Test01;//package Test01;
//////////public class sorting {
//////////public static void printArray(int arr[]){
//////////        for (int i = 0; i<arr.length; i++){
//////////            System.out.print(arr[i]);
//////////       }
//////////       System.out.println();
//////////    }
//////////    public static void main(String[] args) {
//////////        // Bubble sorting
//////////        int arr[] = {7, 8, 3, 1, 2};
//////////        int i;
//////////        for (i = 0; i < arr.length - 1; i++) {
//////////            for (int j = 0; j < arr.length - 1 - i; j++) {
//////////                if (arr[j] > arr[j + 1]) {
//////////                    int temp = arr[j];
//////////                    arr[j] = arr[j + 1];
//////////                    arr[j + 1] = temp;
//////////                }
//////////            }
//////////        }
//////////        printArray(arr);
//////////
//////////    }
//////////}
////////public class sorting {
////////    public static void main(String[] args) {
////////        int[] arr = {22, 44, 11, 33, 99, 88, 77, 66};
////////        System.out.println("Array before sorting: ");
////////        printArray(arr);
////////        bubblesort(arr);
////////        System.out.println("Array before sorting: ");
////////        printArray(arr);
////////    }
////////    // Creating function to perform bubble sort
////////   public static void bubblesort(int[] arr){
////////        for (int i = 0; i<arr.length-1; i++){
////////            for (int j = 0; j< arr.length-i-1; j++){
////////                if (arr[j]>arr[j+1]){
////////                    //Swaping arr[j] and arr[j+1]
////////                    int temp = arr[j];
////////                    arr[j]=arr[j+1];
////////                    arr[j+1]=temp;
////////
////////                }
////////            }
////////        }
////////   }
////////   // Pritng the function
////////    public static void printArray(int[]arr){
////////        for (int i =0; i< arr.length; i++){
////////            System.out.print(arr[i] + " ");
////////        }
////////        System.out.println();
////////
//////public class sorting {
//////    public static void main(String[]args){
//////        int [] arr = {99,88,77,66,55,44,33,22,11};
//////        System.out.println("Array before sorting: ");
//////        printArray(arr);
//////        bubbleSort(arr);
//////        System.out.println("Array after sorting: ");
//////        printArray(arr);
//////    }
//////    public static void bubbleSort(int arr[]){
//////        for (int i =0; i<arr.length-1; i++){
//////            for (int j = 0; j<arr.length-i-1; j++){
//////                if (arr[j]>arr[j+1]){
//////                    int temp=arr[j];
//////                    arr[j]=arr[j+1];
//////                    arr[j+1] = temp;
//////                }
//////            }
//////        }
//////    }
//////    public static void printArray(int[]arr){
//////        for (int i =0; i<arr.length; i++){
//////        System.out.print(arr[i] + " ");
//////    }
//////    System.out.println();
//////
////
////public class sorting {
////    public static void main(String[]args){
////        String[] name = {"Divensh","Nacool","Jaydat","Abhishek"};
////        System.out.println("Names before sorting");
////        printNames(name);
////        bubbleSort(name);
////        System.out.println("Names after sorting");
////        printNames(name);
////    }
////    public static void bubbleSort(String[]name){
////        for (int i = 0; i<name.length-1; i++){
////            for (int j = 0; j<name.length-i-1; j++){
////                if (name[j].compareTo(name[j+1])>0){
////                    String temp= name[j];
////                    name[j]=name[j+1];
////                    name[j+1]=temp;
////                }
////            }
////        }
////    }
////    public static void printNames(String[]arr){
////        for (String name : arr){
////            System.out.print(name + " ");
////        }
////            System.out.println();
////    }
////}
//// Selection sorting
//package Test01;
//public class sorting {
//    static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int[] arr = {7, 8, 3, 1, 2};
//        System.out.println("Before Sorting");
//        printArray(arr);
//        // Selection sort
//        for (int i = 0; i < arr.length - 1; i++) {
//            int samllest = i;
//            for (int j = i + 1; j < arr.length; j++) {
////                if (arr[samllest] > arr[j]) {
////                    samllest = j;
////                }
////            }
////            int temp = arr[samllest];
////            arr[samllest] = arr[i];
////            arr[i] = temp;
////        }
////        System.out.println("After Sorting");
////        printArray(arr);
////
////    }
////}
//////
////
//package Test01;
//public class sorting {
//    public static void selectionSort(String [] arr){
//        String[] name = {"Divensh","Nacool","Jaydat","Abhishek"};
//        for (int  i=0; i<name.length-1; i++){
//            int samllestIndex = i;
//            for (int j = i+1; j< name.length; j++){
//                if (arr[samllestIndex].compareTo(arr[j])>0) {
//                    samllestIndex = j;
//                }
//            }
//               String temp = arr[samllestIndex];
//                 arr[samllestIndex]=arr[i];
//                 arr[i]=temp;
//
//        }
//    }
//    public static void printArray(String[]arr){
//        for (int i =0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String [] args){
//        String[] name = {"Divensh","Nacool","Jaydat","Abhishek"};
//        System.out.println("Array before sort");
//        printArray(name);
//        selectionSort(name);
//        System.out.println("Array after sort");
//        printArray(name);
//    }
//}
//package Test01;
////public class sorting {
////    public static void printArray(int[] arr){
////        for (int i = 0; i<arr.length; i++){
////            System.out.print(arr[i] + " ");
////        }
////        System.out.println();
////    }
////    public static void main(String[]args){
////        int [] arr = {7,8,3,1,2};
////        //Insertion sort
////        for (int i =1; i<arr.length;i++) {
////            int current = arr[i];
////
////                }
////
////            }
////        }
//
//
//    public class sorting {
//        public static void bubbleSort(int[] arr) {
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 1; j < arr.length - i ; j++) {
//                    if (arr[j - 1] > arr[j]) {
//                        //swaping
//                        int temp = arr[j - 1];
//                        arr[j - 1] = arr[j];
//                        arr[j] = temp;
//
//                    }
//                }
//            }
//        }
//
//        public static void main(String[] args) {
//            int[] arr = {3, 60, 35, 2, 45, 320, 5};
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//            System.out.println("Array before sort");
//            bubbleSort(arr);
//            System.out.println("Array after sort");
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//
