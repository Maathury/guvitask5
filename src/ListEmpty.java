//Question 2


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListEmpty {
    public static void main(String[] args) {
       List<String> listString =Arrays.asList("abc","","bc","efg","abcd","","jkl");

        Predicate<String> predicate= word -> word.length()==0;
        listString.stream().forEach(isEmpty-> System.out.println("List is empty or not :"+predicate.test(isEmpty)));

        System.out.println("Printing the List with non empty Strings :");
        listString.stream().filter(string -> !string.isEmpty()).forEach(System.out::println);
    }
}
