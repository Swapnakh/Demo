import com.google.common.primitives.Ints;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Ints from Guava
 */
final class IntsTest {

    private final int[] integersA = new int[]{4, 11, 65, 222, 567};
    private final int[] integersB = new int[]{3, 12, 66, 233};


    @Test
    public void integerArrayContainsEleven() {

        boolean actual = Ints.contains(integersA, 11);

        Assert.assertEquals(actual, true);
    }

    @Test
    public void indexOfElevenIsOne() {

        int actual = Ints.indexOf(integersA, 11);

        // then
        Assert.assertEquals(actual, 1);
    }

    @Test
    public void lengthOfTwoArrays() {

        int[] actual = Ints.concat(integersA, integersB);


        Assert.assertEquals(actual.length, 9);
    }

    @Test
    public void shouldJoinArrayWithSeparator() {
        Assert.assertEquals(Ints.join(",", integersA), ("4,11,65,222,567"));
    }

    @Test
    public void findMinAndMax() {
        Assert.assertEquals(Ints.min(integersA), 4);
        Assert.assertEquals(Ints.max(integersA), 567);
    }
}