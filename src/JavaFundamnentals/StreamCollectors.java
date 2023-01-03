package JavaFundamnentals;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamCollectors {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 10, 20,20,20,20, 30, 10, 10);
        // Hashing Question using Streams:
        System.out.println("logic using Streams: ");
        //return a map with occurences of
        final Map<Integer, Long> collect = numberList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        for(Integer key : collect.keySet()){
            final Long occurences = collect.get(key);
            if(occurences>(numberList.size())/3){
                System.out.println("The Number with more occurences than N/3 is :"+ key);
            }
        }

        System.out.println("logic without Streams: ");
        Map<Integer, Integer> hashingmap = new HashMap<>();
        for(Integer key: numberList){
           if(hashingmap.containsKey(key)){
                int value = hashingmap.get(key) + 1;
                hashingmap.put(key, value);
           }
           else {
               hashingmap.put(key,1);
           }
        }
        for(Integer key: hashingmap.keySet()){
            if(hashingmap.get(key)> numberList.size()/3){
                System.out.println("The Number with more occurences than N/3 is "+ key);
            }
        }



    }
}
