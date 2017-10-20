import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by akalji on 05.10.2017.
 */

public class main {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long)Math.pow(2,48);
        Stream<Long> infiniteStream = Stream.iterate(0L, i ->  (a * i+  c) % m);

        // when
        List<Long> collect = infiniteStream
                .limit(100500)
                .collect(Collectors.toList());
        System.out.println(collect);

        // then

    }
}
