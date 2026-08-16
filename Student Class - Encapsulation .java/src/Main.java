class Student {

    private String name;
    private int age;
    private String course;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Niraj");
        s1.setAge(21);
        s1.setCourse("CSE ");

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Course: " + s1.getCourse());
    }
}