package JavaFundamnentals;

import com.java.oop.PurchaseSystem.customerDetails.Address;
import com.java.oop.purchaseprogram.Customer;

import java.awt.event.KeyListener;
import java.util.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExpressions {
    public static void main(String[] args) {

        List<List> keyList = new ArrayList();
        List<String> customerObject = new ArrayList<>();
        List<String> addressObject = new ArrayList<>();
        customerObject.add("Mohammad Manaan Bhat");
        customerObject.add("Java");
        customerObject.add("Zailta");
        keyList.add(customerObject);
        addressObject.add("Bottashaha Mohallah lal Bazar");
        addressObject.add("190023");
        keyList.add(addressObject);
        Runnable runnable = ()->{
            List<String> StreamList = null;
            Thread.currentThread().setName("Filter-Thread");
            System.out.println("running thread Name: "+Thread.currentThread().getName());
            StreamList = customerObject.stream().filter(e -> e.contains("Manaan")).collect(Collectors.toList());
            addressObject.stream().sorted((a,b)-> a.compareTo(b)).forEach(System.out::println);
            System.out.println(StreamList);
        };
        Thread run = new Thread(runnable);
        run.start();
        Runnable mapThread = ()->{
            try {
                Thread.sleep(2000);
                Thread.currentThread().setName("Map-Thread");
                System.out.println("running thread Name: "+Thread.currentThread().getName());
                customerObject.stream().map(String::toUpperCase).forEach(System.out::println);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        Thread mapRun = new Thread(mapThread);
        mapRun.run();

        List <Integer> list1 = List.of(1,2,3,4,5,6,7,8);
        List <Integer> list2 =List.of(5,6,7);
        List <Integer> list3 = List.of(8,9,12);
        List <String> list4 = List.of("Alpha","Beta","Gamma");

        List<List<?>> mergedlist = Arrays.asList(list1,list2,list3, list4);
        /***ways to call Stream api on lists
         * using Functional Class
         * Directly calling the map on stream
         */
        //first way:
        System.out.println("First Way to use Map on Stream");
        Function<List<?>, Integer> map = List::size;
        mergedlist.stream().map(map).forEach(System.out::println);
        System.out.println("Second way of using map on Stream");
        //Second Way:
        mergedlist.stream().map(List::size).forEach(System.out::println);
        //use of flat map: a flat map returns a flatted map, meaning the data present in eac stream return as a single stream->
        System.out.println("This is a flattened Map:");
        mergedlist.stream().flatMap(Collection::stream).forEach(System.out::println);

        // We can also chain map and filter together and use along with a terminal
        System.out.println("This is map and filter being used in conjunction");
        mergedlist.stream().map(List::size).filter(integer -> integer.equals(3)).forEach(System.out::println);
        System.out.println("This is map, reduce and filter being used in conjunction");
        final Integer reduce = mergedlist.stream().map(List::size).filter(integer -> integer.equals(3)).reduce(0, Integer::sum);
        System.out.println(reduce);
        System.out.println("Random Playlist program");
        List<String> songs = Arrays.asList("a", "b", "c", "d", "e");
        Set<String> indexTracer = new HashSet<>();
         Random random = new Random();
        int asInt = 0;
         for(int i = 0;i<songs.size() ;i++) {
             asInt = random.ints(0, songs.size()).findAny().getAsInt();
             if(!(indexTracer.contains(songs.get(asInt)))) {
                 indexTracer.add(songs.get(asInt));
                 System.out.println("Playing Now: "+songs.get(asInt));
             }
         }
        System.out.println(indexTracer);
         //shuffle elements using Collections
        Collections.shuffle(songs);
        System.out.println("Songs after shuffle :"+songs);




    }
}
