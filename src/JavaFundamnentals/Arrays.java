package JavaFundamnentals;

public class Arrays {
    public static void main(String[] args) {
       // spanOfArray();
        //findElement(5);
       // barChart();
       // AdditionOFArray();
        SubtractionOdArray();
    }

    private static void SubtractionOdArray() {
        int []arr = {1,2,3,};
        int[] arr2 ={2,6,5,6};
        int n = arr.length;
        int n1 = arr2.length;
        int [] difference = new int[n1];
        int carry  =0 ;

        int i = arr.length-1;
        int j = arr2.length-1;
        int k = (difference.length)-1;
        while(k>=0){
            int difelement;
            int alv  = (i>=0?arr[i]:0);
            if((arr2[j] + carry >= alv)){
                 difelement = arr2[j]+carry-alv;
                carry = 0;
            }
            else {
                difelement= arr2[j]+10+carry-alv;
                carry= -1;
            }
            difference[k] = difelement;
            i--;
            j--;
            k--;
        }
        int index = 0;
        while(index<difference.length && difference[index] == 0){
            index++;
        }
        while(index<difference.length){
            System.out.print(difference[index++]);
        }
    }

    public static void AdditionOFArray() {
        int []arr = {1,2,3,};
        int[] arr2 ={2,3};

        int n3 = arr.length;
        int n4 = arr2.length;
        int [] sum = new int[Math.max(n3, n4)];
        int carry  =0 ;

        int n1 = arr.length-1;
        int n2 = arr2.length-1;
        int k = (sum.length)-1;

        while(k>=0){
          int add = carry;
            if(n1>=0){
                add+= arr[n1--];
            }
            if(n2>=0){
                add+= arr2[n2--];
            }
            carry = add/10;
            add = add%10;
            sum[k--] = add;

        }
        if(carry>0){System.out.print(carry);}

        for(int values: sum){
            System.out.print(values);
        }
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
        int []arr = {1,9,2,3,5,7,8}; //array declaration
        int n = arr.length;
        int [] copy = new int[n];
        int max= 0;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for(int i = max; i>=1;i--){
            for (int k : arr) {
                if (k >= i) {
                    System.out.print("*\t");
                } else
                    System.out.print("\t");
            }
            System.out.println();
        }

    }

    }
