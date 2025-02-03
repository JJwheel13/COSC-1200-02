public class Student {
    private String name;
    private String studentID;
    private int age;

    private static String universityName = "Ontario Tech University";

    public Student(String name, String studentID, int age) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
    }

    public Student() {
        this.name = "N/A";
        this.age = 0;
        this.studentID = "N/A";
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public void displayDetails() {
        System.out.printf("----- [%S] -----\nName: %s\nStudentID: %s\nAge: %d\n", universityName, getName(), getStudentID(), getAge());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

