package JavaFundamnentals;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
       // multiplication(arr, arr);
      //  waveIteration(arr, 3,3);
      //  spiraliteration(arr);
        int [][] bin = {{1,0,1},{0,0,0},{1,1,1}};
       // exitarray(bin);
      //  roateanarrayby90degree(arr);
     //   digonaltransversal(arr);
        rotateShell(arr, 1,1);
        //saddlepoint(arr);
       // seracharray(arr, 3);
        display1(arr);
    }

    public static void rotateShell(int [][]arr, int s, int r){
        int[] oned = shelltoOned(arr, s);
        rotate(oned, r);
        onedtoshell(arr, s, oned);

    }

    // Shell to oned:

    public static int[] shelltoOned(int[][]arr, int s){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int size = 2*(maxr-minr + maxc - minc );
        int [] oned = new int[size];
        int idx = 0;

        //left
        for(int i = minr, j = minc; i<=maxr; i++){
            oned[idx] = arr[i][j];
            idx++;
        }


        //bottom

        for(int i = maxr, j = minc+1; j<=maxc; j++){
            oned[idx] = arr[i][j];
            idx++;
        }
        //right
        for(int i = maxr-1, j = maxc; i>=minr ; i--){
            oned[idx] = arr[i][j];
            idx++;

        }
        //up
        for(int i = minr, j = maxc-1; j>= minc+1; j--){
            oned[idx] = arr[i][j];
            idx++;
        }

        return oned;
    }

    //oned to shell :


    public static void onedtoshell(int[][]arr, int s, int[] oned){
        int minr = s-1;
        int minc = s-1;
        int maxr = arr.length-s;
        int maxc = arr[0].length-s;
        int idx = 0;

        //left
        for(int i = minr, j = minc; i<=maxr; i++){
            arr[i][j] = oned[idx];
            idx++;
        }


        //bottom

        for(int i = maxr, j = minc+1; j<=maxc; j++){
            arr[i][j] = oned[idx];
            idx++;
        }
        //right
        for(int i = maxr-1, j = maxc; i>=minr ; i--){
            arr[i][j] = oned[idx];
            idx++;

        }
        //up
        for(int i = minr, j = maxc-1; j>= minc+1; j--){
            arr[i][j] = oned[idx];
            idx++;
        }

    }
    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0) {
            r += oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void display1(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void seracharray(int[][] arr, int data) {
        int i = 0; int j = arr[0].length-1;
        while(i <arr.length && j>=0){
            if(data == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }

            else if(data>arr[i][j]){
                i++;
            }
            else {
                j--;
            }
        }
        System.out.println("Not Found");
    }

    private static void saddlepoint(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int svj = 0;
            for(int j = 0; j<arr[0].length;j++){
                if(arr[i][j]< arr[i][svj]){
                    svj = j;
                }
            }
            boolean flag = true;
            for(int k = 0;k<n;k++){
                if(arr[k][svj] >arr[i][svj]){
                    flag =false;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("Invalid input");
    }

    private static void digonaltransversal(int[][] arr) {
        int n = arr.length;
        for(int gap = 0; gap<n;gap++){
            for(int i = 0, j=gap; j<arr.length;j++,i++){
                System.out.println(arr[i][j]);
            }
        }
    }

    private static void roateanarrayby90degree(int[][] arr) {
        /*
        concept : first take the transpose of the whole array.
        Once transpose is taken reverse the array rows one by one.
         */
        int rows  = arr.length;
        for(int  i = 0; i<rows; i++){
            for (int j = i; j< rows; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i = 0; i<rows; i++){
            int li = 0; int ri = arr[i].length-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }

        }
        display(arr);
    }
    public static void display(int[][] arr){
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void exitarray(int [][]arr) {
        int dir = 0;
        int i = 0; int j = 0;
        while(true){
            dir = (dir+arr[i][j])%4;
            switch (dir) {
                case 0 -> j++;
                case 1 -> i++;
                case 2 -> j--;
                case 3 -> i--;
            }



            if(i<0){
                i++;break;
            }
            else if(j<0){
                j++; break;
            }
            else if(i==arr.length){
                i--; break;
            }
            else if(j== arr[0].length){
                j--; break;
            }

        }
        System.out.println(i+" "+j);
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
