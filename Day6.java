/* public class Day6 {
    public static void main(String[] args) {

        int arr[] = { 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1 };

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} */

public class Day6 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

    
        for (int i = 0; i < arr.length; i+=2) {

            if(i==arr.length-1) {
                break;
            }

                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}