package JavaFundamnentals;

public class StringandStringBuilder {

    public static void main(String[] args) {
        String str = "aaaabbbbba";
     //   solution(str);
        compressString(str);

    }
    /*Method 1*/
    public static void compressString(String str){
        StringBuilder ans = new StringBuilder();
       for(int i = 0; i<str.length(); i++) {
           int count=1;
           while (i < str.length() -1 && str.charAt(i) == str.charAt(i + 1)) {
               count++;
               i++;
           }
           ans.append(str.charAt(i));
       }
        System.out.println(ans);
    }
    /*
    Method 2:
     */

   public static boolean isPalindrome(String str) {
       int i = 0;
       int j = str.length() - 1;
       while (i < j) {
           if (str.charAt(i) != str.charAt(j)) {
               return false;
           }
           i++;
           j--;
       }
       return true;
   }

   public static void solution(String str){
       for (int i = 0 ; i < str.length(); i++) {
           for (int j = i + 1; j <= str.length(); j++) {
               if(isPalindrome(str.substring(i,j))){
                   System.out.println(str.substring(i,j));
               }
           }}

   }

}
