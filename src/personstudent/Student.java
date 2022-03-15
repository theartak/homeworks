package personstudent;

public class Student extends Person {
    private int grade;

    public Student() {
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Student student = (Student) o;
        return this.grade == student.grade;
    }
}