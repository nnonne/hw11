import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> res = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            res.add(iterator1.next());
            res.add(iterator2.next());
        }
        return res.stream();
    }
    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(1,2,3,4,5,6,7,8);
        Stream<Integer> first = array1.stream();
        List<Integer> array2 = Arrays.asList(-1,-2,-3,-4,-5,-6,-7);
        Stream<Integer> second = array2.stream();
        System.out.println(zip(first,second).collect(Collectors.toList()));
    }
}
