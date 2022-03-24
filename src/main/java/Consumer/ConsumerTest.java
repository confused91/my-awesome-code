package Consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerTest {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 33, 5, 5, 5, 6, 2);
        integers.forEach(x -> System.out.println(x)); //accept method takes an argument of any type and returns nothing.
    }
}
