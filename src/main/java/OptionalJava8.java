import java.util.Optional;

/**
 * Optional from JavaUtil.
 */
public class OptionalJava8 {

    public static void main( final String[] args) {
        OptionalJava8 o = new OptionalJava8();
        Integer value1 = null;
        Integer value2 = 30;

        //Optional.ofNullable  allows passed parameter to be null.
        Optional<Integer> a = Optional.ofNullable(value1);
        System.out.println(a);

        //Optional.of throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);
        System.out.println(o.sum(a, b));


    }

    /**
     * @param a
     * @param b
     * @return sum
     */
    public final Integer  sum( final Optional<Integer> a,final Optional<Integer> b) {

        //Optional.isPresent  checks the value is present or not
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());

        //Optional.orElse  returns the value if present otherwise returns
        //the default value passed.
        Integer value1 = a.orElse(0);
        System.out.println(value1);

        //Optional.get  gets the value, value should be present
        Integer value2 = b.get();
        return value1 + value2;
    }


}