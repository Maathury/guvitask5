//Question 3

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    public static void main(String[] args) {

        List<String> studentName= Arrays.asList("John","Anusha","Ram","Mani","Abi","Latha","Kumar","Arshi","Priya","Vinoth");

        Predicate<String> predicate=name -> name.startsWith("A");
        System.out.println("Checking the List of name starts with 'A' or not");
        studentName.forEach(name -> System.out.println(name +" starts with 'A' : "+predicate.test(name)));
        System.out.println("Student name starts with 'A' :");
        studentName.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    }
}
