package JavaFundamnentals;

import java.util.Collection;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
       // spanOfArray();
        //findElement(5);
       // barChart();
       // AdditionOFArray();
       // SubtractionOdArray();
        int[]a = {1,2,3,4,5,5,6,7,8};
        //reversearr();
       // rotatearr(a,3);
       // inverse(a);
       // subarray();
       // binarySearch(a, 3);
       // firstIndexLastIndex(a,5);
       // invertedbarChart();
    }

    private static void firstIndexLastIndex(int[] a, int data) {
        int low  = 0;
        int high  = a.length-1;
        int firstIndex = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(data<a[mid]){
                high= mid-1;

            }
            else if(data>a[mid]){
                low = mid+1;
            }
            else{
              firstIndex = mid;
              high = mid-1;
            }
        }
        System.out.println(firstIndex);
         low  = 0;
        high  = a.length-1;
        int lastIndex = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(data<a[mid]){
                high= mid-1;

            }
            else if(data>a[mid]){
                low = mid+1;
            }
            else{
                lastIndex = mid;
                low = mid+1;
            }
        }
        System.out.println(lastIndex);
    }

    private static void binarySearch(int[] a, int data) {
        int low  = 0;
        int high  = a.length-1;
        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(data<a[mid]){
                high= mid-1;
                ceil  = a[mid];
            }
            else if(data>a[mid]){
                low = mid+1;
                floor = a[mid];
            }
            else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println("The number is between "+floor +" and "+ceil);
    }

    private static void subarray() {
        int[]a = {3,4,1};
        for(int i = 0; i<a.length;i++){
            for(int j = i;j<a.length;j++){
                for(int k = i; k<=j; k++){
                    System.out.print(a[k] +" ");
                }
                System.out.println();
            }
        }

    }

    public static void inverse(int[] a){
        int[] inverted_array = new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
            int v = a[i];
            inverted_array[v] = i;
        }
        for(int values: inverted_array){
            System.out.print(values);
        }
    }
    //part of rotate array program:
    public static void reverse(int []a , int leftindex, int rightindex){
        // int leftindex=i;
        // int rightindex = j;
        while(leftindex<rightindex){
            int temp = a[leftindex];
            a[leftindex ] = a[rightindex];
            a[rightindex] = temp;
            leftindex++;
            rightindex--;
        }

    }
    public static void rotatearr(int[] a, int k){
        k = k%a.length;
        if(k<0){
            k+=a.length;
        }
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);
        for(int values: a){
            System.out.print(values +" ");
        }
    }


    private static void reversearr(){
        int []arr = {1,2,3};
        int n = arr.length;
        for(int i = 0; i<n/2;i++){
            int t = arr[i];
           arr[i] =  arr[n-i-1];
            arr[n-i-1] = t;
        }
        System.out.println(java.util.Arrays.toString(arr));
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
        int []arr = {3,1,0,7,5}; //array declaration
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
    public static void invertedbarChart(){
        int []arr = {3,1,0,7,5}; //array declaration
        int n = arr.length;
        int max= 0;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for(int i =0;i<=max;i++){
            for(int k:arr){
                if(k<=i){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }

            }
            System.out.println();
        }

    }

    }

