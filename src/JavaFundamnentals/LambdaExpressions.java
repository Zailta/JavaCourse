package JavaFundamnentals;

import com.java.oop.PurchaseSystem.customerDetails.Address;
import com.java.oop.purchaseprogram.Customer;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
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






    }
}
