import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EachOccuranceOfString {

    public static void main(String[] args) {
         String str="ILovemyselfmore";
//        String[] split = str.split("");
//        System.out.println(Arrays.toString(split));
//        Map<String, List<String>> collect = Arrays.stream(str.split(""))
//                .collect(Collectors.groupingBy(s -> s));
//        System.out.println(collect);
        Map<String, Long> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
