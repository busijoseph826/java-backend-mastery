import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameStreamDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Joseph",
                "John",
                "David",
                "James",
                "Mary",
                "Jack",
                "Sophia",
                "Jennifer",
                "Robert",
                "Jessica"
        );

        List<String> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}