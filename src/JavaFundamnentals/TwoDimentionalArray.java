package JavaFundamnentals;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
       // multiplication(arr, arr);
      //  waveIteration(arr, 3,3);
        spiraliteration(arr);
    }

    private static void spiraliteration(int [][] arr) {
        int rows = arr.length;
        int coloumns = arr[0].length;

        int elements = rows*coloumns;
        int count =0;
        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        while (count < elements){
            //left
            for(int row = minr; row<= maxr && count < elements ; row++ ){
                System.out.print(arr[row][minc]);
                count++;
            }
            minc++;


            //bottom
            for(int coloumn = minc; coloumn<= maxc  && count < elements; coloumn++ ){
                System.out.print(arr[maxr][coloumn]);
                count++;
            }
            maxr--;

            //right
            for(int row = maxr; row>= minr  && count < elements; row-- ){
                System.out.print(arr[row][maxc]);
                count++;
            }
            maxc--;
            //upper
            for(int coloumn = maxc; coloumn>=minc  && count < elements ; coloumn-- ){
                System.out.print(arr[minr][coloumn]);
                count++;
            }
            minr++;

        }
    }

    private static void waveIteration(int[][]arr, int rows, int coloumns) {
        for(int coloumn  = 0; coloumn<coloumns; coloumn++){
            if(coloumn%2 ==0){
                /* for the wave pattern we assume that the number of rows is decreasing
                when we go down the column (even numbers of column)  and it is decreases when we go up the column(odd number of column):


                 */
                for(int row  = 0; row<rows; row++){
                    System.out.print(arr[row][coloumn]);
                }
            }
            else {
                for(int row = rows-1; row>=0;row--){
                    System.out.print(arr[row][coloumn]);
                }

            }
            System.out.println();
        }
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
