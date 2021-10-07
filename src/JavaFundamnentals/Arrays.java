package JavaFundamnentals;

public class Arrays {
    public static void main(String[] args) {
        spanOfArray();
    }
    public static void spanOfArray(){

        int []arr = {1,2,3,5,7,8,97}; //array declaration
        int n = arr.length;
        java.util.Arrays.sort(arr);
        int span = arr[n-1] - arr[0];
        System.out.println(span); //displaying the difference between greatest and smallest element
    }
    }
