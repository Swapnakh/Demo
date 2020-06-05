/**
 * Person Class.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    /**
     * @return f f
     */
    public final String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName f
     */
    public final void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return l
     */
    public final String getLastName() {
        return lastName;
    }

    /**
     * @param lastName l
     */
    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return a
     */
    public final int getAge() {
        return age;
    }

    /**
     * @param age a
     */
    public final void setAge(final int age) {
        this.age = age;
    }

    /**
     * @param firstName f
     * @param lastName  l
     * @param age       a
     */
    public Person(final String firstName, final String lastName, final int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * @return p p
     */
    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }

}