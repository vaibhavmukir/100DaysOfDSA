/* public class Day5 {
    
    //Second largest Number
    public static void main(String[] args) {
        int arr[] ={4,6,8,5,9,3};

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max);
         System.out.println(smax);
    }
}
 */

/* public class Day5 {

    public static void main(String[] args) {
       
         int arr[] ={4,6,8,5,9,3};

         int n=arr.length;

         int i=0 ,j=n-1;

         while (i<j) {
           int  temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
         }

         for(int arr1:arr){
            System.out.print(arr1 +" ");
         }
        
    }
} */

public class Day5 {

    public static void main(String[] args) {
        int d=3;

        
        int [] arr={2,3,6,5,8,9,1};

        int n=arr.length;

        int newArr[]=new int[n];

        int j=0;
        for (int i = d-1; i < arr.length; i++) {
            newArr[j]=arr[i];
            j++;
        }

        for (int i = 0; i < d-1; i++) {
              newArr[j]=arr[i];
              j++;
        }


        for(int arr1:newArr){
            System.out.print(arr1+" ");
        }


    }
}