// question 1


import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;


public class StringUppercase {
    public static void main(String[] args) {
        Stream names= Stream.of("aBc","d","ef");
        Function<String,String> function=word -> word.toUpperCase();
        names.map(function).forEach(ans -> System.out.println(ans));

    }
}
