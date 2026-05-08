/* import java.util.Scanner;

public class Day2 {
//Input Array
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number");
        int n=sc.nextInt();


        int[] arr =new int [n];

        System.out.println("Enter the "+n+" Number");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
} */

//-------------------------------------------------------------------------------------------------------------




/* import java.util.Scanner;

public class Day2 {
//Print Negetive Number Only
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }

    }
    
} */

//--------------------------------------------------------------------------------------------------------------------

/* //Print of Sum Array the Number

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);

        System.out.println("Enter the Array size");
        
        int n=Sc.nextInt();

        int[] arr =new int[n];

        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }

        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        System.out.println(sum);
    }
} */

//----------------------------------------------------------------------------------------------------------

//print the max Elements the Array

/* import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
         Scanner Sc=new Scanner(System.in);

        System.out.println("Enter the Array size");
        
        int n=Sc.nextInt();

        int[] arr =new int[n];

        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }

        int max=0;

        for (int i = 0; i < n; i++) {
            
            if(max<arr[i]) {
                max=arr[i];
            }
        }

        System.out.println(max);

        
    }
} */

//---------------------------------------------------------------------------------------------------------------------------------

