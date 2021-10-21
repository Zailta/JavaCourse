package JavaFundamnentals;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9,}};
        multiplication(arr, arr);
    }

    private static void multiplication(int[][] arr, int[][] arr2) {
       int rows  = arr.length;
      int coloumn  = arr[0].length;
       int rows1 = arr2.length;
       int coloumn1  = arr2[0].length;

        if(coloumn!=rows1){
            System.out.println("Invalid input");
            return;
        }
        int[][] product = new int[rows][coloumn1];
        for(int i = 0; i<rows; i++){
            for(int j =0; j<coloumn1;j++){
                int sum = 0;
                for(int k = 0; k<coloumn;k++){
                    sum+= arr[i][k]*arr2[k][j];

                }
                product[i][j] = sum;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumn1; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}
