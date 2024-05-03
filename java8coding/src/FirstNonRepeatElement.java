import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/***
 * @Naga
 */
public class FirstNonRepeatElement {
    public static void main(String[] args) {
        String str="perfectionisalwayscomesinafirstplace";
//        String[] split = str.split("");
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(collect);
//        finding first non repeat elemnt

        List<Map.Entry<String, Long>> list = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .collect(Collectors.toList());
        System.out.println(list);


    }
}
