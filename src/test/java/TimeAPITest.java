import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;


public class TimeAPITest {


    private TimeAPI t;

    @BeforeClass
    public void setup() {
        t = new TimeAPI();
    }

    @Test
    public void testMonthLengthsOfLepYear() {

        assertEquals(
                //leap year
                Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
                TimeAPI.getMonthLengths(2020));
    }

    @Test
    public void testMonthLengthsOfNotLeapYear() {
        assertEquals(
                Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31),
                TimeAPI.getMonthLengths(2021));
    }


}
