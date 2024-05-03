import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/***
 * @naga
 */
public class FindDuplicateElement {
    public static void main(String[] args) {
        String input = "perfectionisalwaysplaceinfirstplace";
//        input.split("");
        List<String> collect = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(n -> n.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
