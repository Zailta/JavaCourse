package JavaFundamnentals;

import java.util.Arrays;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class SplittingStringusingStream {
    public static void main(String[] args) {
        String entityName = "EMEAUWDOC";
        String userID = "1524829";
        String cmbdatafilename = "EMEAUWDOC_1524829_test`!@#$%^&*()_+{};',./?><.pdf1254879654562354";

        /**
         * instead of using teh split and the filter approach we use Pattern
         * Method 1 using split and two arrays
         * */

        List<String> removeString =  Arrays.asList(entityName, userID);
        String[] split = cmbdatafilename.split("_");
         String s = Arrays.stream(split).filter(e -> !removeString.contains(e)).map(f->{
            StringBuffer sb = new StringBuffer();
            char[] chararray = f.toCharArray();
            for(char ch : chararray){
                String st = ch+"";
               if(st.matches("[\\w\\s_.]*")){
                   sb.append(ch);
               }
            }

             return sb.toString();
         }).collect(Collectors.joining());
        System.out.println(s);

        /**
         * Method 2: using Pattern.compile
         */
        String patternSplit = Pattern.compile("_").splitAsStream(cmbdatafilename)
                .filter(e -> !removeString.contains(e)).map(f->{
            StringBuffer sb = new StringBuffer();
            char[] chararray = f.toCharArray();
            for(char ch : chararray){
                String st = ch+"";
                if(st.matches("[\\w\\s_.]*")){
                    sb.append(ch);
                }
            }

            return sb.toString();
        }).collect(Collectors.joining());
        System.out.println(s);



    }
}
