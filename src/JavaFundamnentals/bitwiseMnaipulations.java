package JavaFundamnentals;


public class bitwiseMnaipulations {
    public static void main(String[] args) {
        int n =1076;
        System.out.println(isodd(n));
        EvenorOdd(n);
        findUnique();
    }
    public static boolean isodd(int n){

       // one way of checking odd and even
        return (n & 1) ==0;
    }
    public static void EvenorOdd(int n ){
       // for odd check
        boolean check = (n&1) ==1;  // or you can try n&1 == 0 for even check.
        if(check){ // if true print number is odd else print number is even
            System.out.println("Number is odd");
       }
        else {
            System.out.println("Number is even");
        }
    }
    public static void findUnique(){
        int [] arr = {2,3,4,2,3,4,5};
        int unique = 0;
        for(int n :arr){
            unique^= n;
            System.out.println(unique);
        }
        System.out.println(unique);
    }
}
