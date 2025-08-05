package builder;

public class Main {
    public static void main(String[] args) {
        // Creating/Building a Student Class using a StudBuilder,
        // is readable & manageable, since we have setters for each attribute;

//        // Since Builder class is static and belongs within Student Class,
//        // The code below throws compile time errors…
//        Builder stud1Builder = new Builder();
//        stud1Builder.setId(1);
//        stud1Builder.setName("Ram");
// //     stud1Builder.setAge(31);
//        stud1Builder.setPsp(89.7);
// //     stud1Builder.setGradYear(2016);
//        stud1Builder.setGradYear(2018);
//        Student stud1 = new Student(stud1Builder);
//        stud1.solveProblem();
//        // The above initialization won't work since the
//        // Student Constructor is private.

//        Builder studentBuilder = Student.getBuilder();
//        studentBuilder.setId(2);
//        studentBuilder.setName("Raju");
//        studentBuilder.setAge(23);
//        studentBuilder.setPsp(94.2);
//        studentBuilder.setGradYear(2022);
//        Student stud2 = studentBuilder.build();

        Student stud2 = Student.getBuilder()
                .setId(2)
                .setName("Raju")
                .setAge(23)
                .setPsp(94.3)
                .setGradYear(2022)
                .build();

        stud2.solveProblem();
    }
}
