package JavaFundamnentals;

public class Arrays {
    public static void main(String[] args) {
        spanOfArray();
        findElement(5);
        barChart();
    }

    private static void findElement(int d) {
        int []arr = {1,2,3,5,7,8,97}; //array declaration
        int n  = arr.length;
        int idx = -1;
        boolean flag =true;
        for(int i = 0; i<n;i++){
            if(arr[i] == d){
                idx = i;
                break;
            }
        }

        System.out.println (idx);
    }

    public static void spanOfArray(){

        int []arr = {1,2,3,5,7,8,97}; //array declaration
        int n = arr.length;
        java.util.Arrays.sort(arr);
        int span = arr[n-1] - arr[0];
        System.out.println(span); //displaying the difference between greatest and smallest element
    }
    public static void barChart(){
        int []arr = {1,2,3,5,7,8,2}; //array declaration
        int n = arr.length;
        java.util.Arrays.sort(arr);
        int max = arr[n-1];
        for(int i = max; i>=1;i--){
            for(int j = 1; j<n;j++){
                if(arr[j]>=i){
                    System.out.print("*\t"  );
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }

    }
