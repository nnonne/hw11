
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void randomGenerator( long a, int c, long m){
        Stream<Long> stream = Stream.iterate(0L, x -> ((a * x) + c) % m);
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        long  a = 25214903917L;
        int c = 11;
        long m = (long) Math.pow(2, 48);
        randomGenerator(a,c,m);
    }
}
