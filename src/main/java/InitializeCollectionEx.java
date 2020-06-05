import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

/**
 * Google Guava Example.
 */
final class InitializeCollectionEx {
    private InitializeCollectionEx() {

    }

    public static void main(final String[] args) {

        Map items = ImmutableMap.of("Mary", 3, "glass", 4, "pencil", 1);

        items.entrySet()
                .stream()
                .forEach(System.out::println);

        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi",
                "grapes", "blueberries", "apple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}