package JavaFundamnentals;

import java.util.HashSet;
import java.util.Set;

public class StringandStringBuilder {

    public static void main(String[] args) {
        String str = "mOHAMMAD mANNAN bHAT";
     //   solution(str);
      //  compressString(str);
      //  compressStringSet(str);
       // compressStringAlphabetiteration(str);
        casechange(str);

    }

    private static void casechange(String str) {
       StringBuilder sb = new StringBuilder(str);
       for(int i = 0 ; i<str.length(); i++) {
           char ch = str.charAt(i);
           if (ch >= 'A' && ch <= 'Z') {
               char lc = (char) (ch -'A' +'a');
               sb.setCharAt(i,lc);
           }
           else if (ch >= 'a' && ch <= 'z') {
               char uc = (char) (ch -'a' +'A');
               sb.setCharAt(i, uc);
           }
       }
        System.out.println(sb);
    }

    /*
    Method 3:
     */
    private static void compressStringAlphabetiteration(String str) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            int count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            ans.append(str.charAt(i));
            if(count>1){
                ans.append(count);
            }

        }
        System.out.println(ans);
    }

    /*
     Method 2:
      */
    private static void compressStringSet(String str) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<str.length(); i++) {
            set.add(str.charAt(i));

        }
        System.out.println(set);


    }

    /*Method 1:
    */
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
