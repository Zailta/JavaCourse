package JavaFundamnentals;

import java.util.StringJoiner;

public class JavaStringandstringJoiner {
    public static void main(String[] args) {
        String str = "This is Java 8 ";
        //str.chars() -> converts String to chars of str
        //below code converts str to uppercase using stream.
        str.chars().mapToObj(letter ->(char)letter).map(Character::toUpperCase).forEach(System.out::print);
        System.out.println();
        //instead of StringBuffer we use StringJoiner in java 8 onwards
        StringJoiner stringJoiner = new StringJoiner("|");
        stringJoiner.add("one").add("two").add("Three");
        String stringJoinerstr = stringJoiner.toString();
        System.out.println(stringJoinerstr);
    }
}
