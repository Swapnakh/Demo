import java.util.Optional;

/**
 * Optional from JavaUtil.
 */
final class OptionalExample {

    private OptionalExample() {

    }

    public static void main(final String... args) {

        // isPresent()
        System.out.println("isPresent() method -");
        Optional<Person> op = Optional.empty();
        System.out.println(op.isPresent());

        // of()
        System.out.println("of() metthod -");
        Optional<Person> op2 = Optional.of(new Person("Adam", "Brad", 25));
        op2.ifPresent(p -> System.out.println(p));

        //orElse()
        System.out.println("orElse() method - ");
        Optional<Person> op3 = Optional.empty();
        Person p3 = op3.orElse(new Person("Smith", "Nicole", 30));
        System.out.println(p3);

    }
}