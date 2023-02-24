import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Task3 {
    public static void numberSorter(String[] list){
        List<String> array = Arrays.asList(list);
        List<String> res = array.stream()
                .map(str -> Arrays.asList(str.split(", ")))
                // Stream<List<String>> -> Stream<String>
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(res);
    }
    public static void main(String[] args) {
        String[] list = {"1, 2, 0", "4, 5"};
        numberSorter(list);
    }
}
