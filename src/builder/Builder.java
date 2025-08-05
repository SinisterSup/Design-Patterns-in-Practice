package builder;

public class Builder {
    private Integer id;
    private String name;
    private int age;
    private double psp;
    private Integer gradYear;

//    public void setId(Integer id) {
//        this.id = id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setPsp(double psp) {
//        this.psp = psp;
//    }
//    public void setGradYear(Integer gradYear) {
//        this.gradYear = gradYear;
//    }
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

    public Student build() {
        return new Student(this);
    }

}
