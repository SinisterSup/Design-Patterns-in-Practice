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

    // Right now since this is public - anyone can call the Student Constructor.
    // Since we want to only allow Construction of the object using builder,
    // this can be made `private`, & then be called only from within the
    // same class using the static builder class within.!
//    public Student(Builder builder) {
    private Student(Builder builder) {
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


    public static class Builder {
        private Integer id;
        private String name;
        private int age;
        private double psp;
        private Integer gradYear;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public Builder setGradYear(Integer gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public Integer getId() {
            return this.id;
        }
        public String getName() {
            return this.name;
        }
        public int getAge() {
            return this.age;
        }
        public double getPsp() {
            return this.psp;
        }
        public Integer getGradYear() {
            return this.gradYear;
        }

        // the Student object is built
        // by making use of Private Constructor of Student from within!!
        public Student build() {
            return new Student(this);
        }

    }
}
