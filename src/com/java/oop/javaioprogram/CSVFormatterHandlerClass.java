package com.java.oop.javaioprogram;

import kotlin.jvm.Synchronized;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CSVFormatterHandlerClass {
    private static  Path path = Paths.get("C:\\Users\\hp\\IdeaProjects\\JavaCourse\\src\\com\\java\\oop\\javaioprogram\\data.csv");
    private static  Path path2 = Paths.get("C:\\Users\\hp\\IdeaProjects\\JavaCourse\\src\\com\\java\\oop\\javaioprogram\\data2.csv");


    public static void main(String[] args) throws Exception {
        if(Files.exists(path)) {
            {
                List<PersonBean> beanArray = new ArrayList();
                try (final BufferedReader bufferedReader = Files.newBufferedReader(path);) {
                    if(bufferedReader.readLine()==null) {
                        bufferedReader.lines().flatMap(line -> CSVFormatterHandlerClass.addDelimiter(line, String.valueOf(path2)));
                        System.out.println("File has been written");
                    }
                    else {
                        bufferedReader.close();
                        System.out.println("No errors, File is not empty, Reading the file");

                        try (BufferedReader bufferedReader2= Files.newBufferedReader(path2);
                              Stream<String> lines = bufferedReader2.lines();){
                            lines.map(e->{
                                 String[] split = e.split(";");
                                        System.out.println(split[0]);
                                 PersonBean personBean = new PersonBean(split[0], Integer.parseInt(split[1]), split[2]);
                                beanArray.add(personBean);
                                return beanArray;
                            }).forEach(System.out::println);
                            final Map<String, Long> collect = beanArray.stream().collect(Collectors.groupingBy(PersonBean::getName, Collectors.counting()));
                                    collect.forEach((key, value) -> {
                                                System.out.println("The name is : " + key + "\nOccurences: " + value);
                                            }
                                    );



                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
         }else {
             System.out.println("The path selected is an invalid path");
         }
    }

    private static Stream<String> addDelimiter(String line, String path) {
       /* System.out.println("line coming to method:"+line);*/
        String templine  = line.replaceAll(" ", ";");
        System.out.println(templine);
        try( FileWriter fileWriter = new FileWriter(path, true);){
            fileWriter.write(templine+"\n");
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return Stream.empty();

    }
    private static List<PersonBean> gettingUserDetails( Stream<String> line){
        List<PersonBean> beanArray = new ArrayList();
        final String[] splitString = line.toString().split(";");
        String name = splitString[0];
        int age = Integer.parseInt(splitString[1]);
        String address = splitString[2];
        PersonBean personBean = new PersonBean(name, age, address);
        beanArray.add(personBean);
        return beanArray;
    }
}
