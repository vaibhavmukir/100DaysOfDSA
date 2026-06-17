// public class Day7 {

//     public static void main(String[] args) {

//         int arr[] = {1, 0, 3, 4, 5};

//         Day7 d=new Day7();

//         boolean ans=d.isSorted(arr);
//         System.out.println(ans);
//     }

//         public boolean isSorted(int arr[]) {

//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] > arr[i + 1]) {
//                 return false;
//             }
//         }

//         return true;
//     }

// }

// public class Day7 {

//     public static void print(int arr[]) {

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, 3, 4, -5, 3, 1, 3, 8, 9 };

//         print(arr);

//         for (int j = 1; j < arr.length - 1; j++) {
//             for (int i = 0; i < arr.length-1-i; i++) {

//                 if (arr[i] > arr[i + 1]) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                 }

//             }

//         }

//         print(arr);

//     }
// }

public class Day7 {

    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        int[] arr = { 2, 3, 4, -5, 3, 1, 3, 8, 9 };

      
        for(int i=0;i<arr.length-1;i++){

              boolean isShorted = true;

            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    isShorted=false;
                    break;
                    
                }
            }

            if(isShorted==true)break;
            for (int j = 0; j < arr.length-1; j++) {
               if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
               } 
            }

            
        }

        print(arr);

        
    }
}