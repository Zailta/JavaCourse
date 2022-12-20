package JavaFundamnentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringandStringBuilder {

    public static void main(String[] args) {
       // String str = "mOHAMMAD mANNAN bHAT";
     //   solution(str);
      //  compressString(str);
      //  compressStringSet(str);
       // compressStringAlphabetiteration(str);
       // casechange(str);
        int shifa  = 10;
        String name = "Shifa";
        Float number = 100.3f;
        System.out.println(shifa);
        System.out.println(name);
        System.out.println(number);


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
   public static String checksum(String accountnumber, String bankcode) {

        if(accountnumber==null|| bankcode == null){
            return "";
        }
       List<Integer> weightage = new ArrayList<>();
       List<Integer> bankcodelist = new ArrayList<>();
       List<Integer> values = new ArrayList<>();
       Integer checksum = 0;
       String weight = "7315248616";
       for (int i = 0; i < weight.length(); i++) {
           char ch = weight.charAt(i);
           int number = Integer.parseInt(String.valueOf(ch));
           weightage.add(number);
       }
       for (int i = 0; i < accountnumber.length(); i++) {
           char ch = accountnumber.charAt(i);
           int number = Integer.parseInt(String.valueOf(ch));
           values.add(number);
       }
       for (char ch : bankcode.toCharArray()) {
           if (Character.isLetter(ch)) {
               int pos = ch - 'a' + 10;
               bankcodelist.add(pos);
           } else {
               bankcodelist.add(Integer.parseInt(String.valueOf(ch)));
           }

       }
       int length = values.size() + bankcodelist.size();


       for (int i = 0; i < length; i++) {


           if (length >= 7) {
                checksum += bankcodelist.get(i) * weightage.get(i);
           } else {
                checksum += values.get(i) * weightage.get(i);

           }
       }
       int finalresult = 0;
       if(checksum%2 == 0){
           finalresult =  checksum %89;
       }
       else {
           finalresult = (checksum %89) - 89;

       }
      String check_sum = String.valueOf(finalresult);
       String finalaccountNumber = check_sum+"-"+accountnumber;


       return finalaccountNumber;

   }


}
