/* import java.util.Arrays;
//Using Arrays.sort function
public class Day4 {

    public static void main(String[] args) {
        
        int [] arr={3,4,5,-2,1,-9,6,-1};

        printArray(arr);

        Arrays.sort(arr);
        
        printArray(arr);

    }

    public static void printArray(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }

        System.out.println();
    }

}

 */




/* public class Day4 {

    public static void main(String[] args) {
        
        int[] arr={2,3,4,5,6,7,8,9};

        int[] result=div(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }

    public static int[] div(int arr[]){

          int[] num = new int[arr.length];


        for (int i = 0; i < arr.length; i++) {
            
            if(i%2==0){

              num[i]= arr[i]*10;
            }

            else{
                num[i]= arr[i]*2;
            }

        }

        return num;
    }
} */




/* import java.util.Scanner;

public class Day4 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number");
        int num=sc.nextInt();

        int[] arr={2,3,4,5,6,7,8,9};

        serach(arr, num);
        

    }

    public static void serach(int arr[],int num){

        boolean found=false;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==num){

                found=true;
                break;
            }
        }

        if(found){
            System.out.println("Number is Present");
        }

        else{
            System.out.println("Number is Not present");
        }
    }
}  */   


/*     //Sum of Array
public class Day4 {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};

        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            ans+=arr[i];
        }

        System.out.println(ans);
    }
} */

public class Day4 {

    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};

        int ans=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]<ans){
                ans=arr[i];
            }

            
        }
        System.out.println(ans);
    }
} 
