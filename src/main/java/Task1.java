import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static String oddNames(String[] namesList){
        List<String> names = Arrays.asList(namesList);
        Stream<String> nameStream = names.stream()
                .filter((name) -> names.indexOf(name) % 2 == 1)
                .map(name -> ""+ names.indexOf(name)+ ". " + name);
        List<String> filteredNames = nameStream.collect(Collectors.toList());
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < filteredNames.size()-1; i++){
            builder.append(filteredNames.get(i) + ", ");
        }
        builder.append(filteredNames.get(filteredNames.size()-1));
        String ans = builder.toString();
        return ans;
    }
    public static void main(String[] args) {
        String[] namesList = {"Ann", "Peter", "Jake", "Kate", "Derek", "Isaak", "Lily"};
        System.out.println(oddNames(namesList));
    }
}
