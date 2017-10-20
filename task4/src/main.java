import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by akalji on 06.10.2017.
 */
public class main {
    public static void main(String[] args) {
        List<String> collect = myStreamer.toStringStream("ла ка лю т")
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
