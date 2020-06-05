import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * TimeAPI.
 */
public class TimeAPI {

    /**
     * @param year y
     * @return al a
     */
    public static List<Integer> getMonthLengths(final int year) {
        return new ArrayList<>(getMonthLengthsMap(year).values());
    }

    /**
     * @param year y
     * @return  monthlength  l
     */
    public static SortedMap<YearMonth, Integer> getMonthLengthsMap(final int year) {
        final SortedMap<YearMonth, Integer> monthLengths = new TreeMap<>();
        System.out.println(monthLengths);
        for (final Month month : Month.values()) {
            //2020 may
            final YearMonth yearMonth = YearMonth.of(year, month);
            monthLengths.put(yearMonth, yearMonth.lengthOfMonth());
        }
        System.out.println(monthLengths);
        return monthLengths;
    }

}