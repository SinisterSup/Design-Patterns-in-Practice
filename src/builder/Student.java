package builder;

// This class is immutable &
// Can have constructor-based validations
public class Student {
    private final String name;
    private final int age;
    private final double psp;
    private final Integer id;
    private final Integer gradYear;

    public static Builder getBuilder() {
        return new Builder();
    }

    public Student(Builder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.gradYear = builder.getGradYear();
        if (gradYear <= 2017 && psp < 90.0) {
            throw new IllegalArgumentException("psp less than 90 for students with gradYear prior to 2017");
        }
    }

    void solveProblem() {
        System.out.println(name + " solved a problem! ");
    }
    void attendClass() {
        System.out.println(name + " attended a class! ");
    }
    void takeTest() {
        System.out.println(name + " took a test! ");
    }
}
