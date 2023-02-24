import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static List<String> nameChanger(String[] namesList){
        List<String> names = Arrays.asList(namesList);
        Stream<String> nameStream = names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder());
        List<String> filteredNames = nameStream.collect(Collectors.toList());
        return filteredNames;
    }
    public static void main(String[] args) {
        String[] namesList = {"Ann", "Peter", "Jake", "Kate", "Derek", "Isaak", "Lily"};
        System.out.println(nameChanger(namesList));
    }
}
