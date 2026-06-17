// public class Day9 {

//     public static void main(String[] args) {

//         int arr[]={1,2,3,4,5,5};

//         System.out.println(shortornot(arr));
//     }

//     public static boolean shortornot(int arr[]){

//         for (int i = 0; i < arr.length-1; i++) {
//             if(arr[i]>arr[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// public class Day9 {

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};

//         System.out.println(arr.length);

//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class Day9 {

//     public static void printArray(int arr[]) {
//         for (int ele : arr) {
//             System.out.print(ele + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { -2, 3, 4, 2, 8, 3, 5, 6 };
//         int n = arr.length;

//         printArray(arr);

//         for (int j = 0; j < arr.length; j++) {

//             boolean isSorted = true;

//             for (int i = 0; i < arr.length; i++) {
//                 if(arr[i]>arr[i+1]){
//                     isSorted=false;
//                     break;
//                 }
//             }

//             if(isSorted==true)break;
//             for (int i = 0; i < n - 1 - 1; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                 }
//             }
//         }

//         printArray(arr);

//     }
// }

// public class Day9 {

//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 0, 2, 4, 3, 0, 5, 7, 0, 5, 7 };
        
//         for (int j = 0; j < arr.length; j++) {

//             for (int i = 0; i < arr.length - 1; i++) {
//                 if (arr[i] == 0) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                 }

//             }
//              printArray(arr);
//         }
//     }
// }

