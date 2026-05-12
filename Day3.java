/* import java.util.Scanner;

//large Elements of Array

public class Day3 {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Array Elements");

        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


       int max=arr[0];
       for(int i=0;i<n;i++){
        if(arr[i]>max) max=arr[i];
       }

       System.out.println(max);
    }
} */


//----------------------------------------------------------------------------------------------------------------------------------

//Change the Array Elements..
/* public class Day3 {

    public static void main(String[] args) {
        int x[]={1,2,3,4};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    
    }

    public static void change(int[] x){

        x[2]=7;
    }
} */

//------------------------------------------------------------------------------------------------------------------------

//Sholoo Copy 
/* 
public class Day3 {

    public static void main(String[] args) {
        
        int [] arr={1,2,3,4,5,6};

        int b[]=arr;

        b[0]=9;

        System.out.println(arr[0]);
    }
} */

//Deep Copy

/* import java.util.Arrays;

public class Day3 {

    public static void main(String[] args) {
        
        int arr[] ={1,2,3,4,5};

        int arr2[]=Arrays.copyOf(arr, arr.length);

        arr2[2]=44;
        System.out.println(arr2[2]);

        System.out.println(arr[2]);
    }
} */
//------------------------------------------------------------------------------------------------------------------------

