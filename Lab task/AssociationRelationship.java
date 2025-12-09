
class Contact {
    private String phone;
    private String email;
    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}
class Student {
   private String name;
   private Contact contact; 
    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }
    public void showStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Contact: " + contact);
    }
}
class School {
    private String schoolName;
    private Student[] students; // School HAS many Students
    private int count = 0;
    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents];
    }
    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }
    public void showStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            students[i].showStudentInfo();
            System.out.println();
        }
    }
}
public class AssociationRelationship {
    public static void main(String[] args) {
        School school = new School("Green Valley High", 3);
        Student s1 = new Student("Alice",new Contact("01711111111", "alice@gmail.com"));
        Student s2 = new Student("Bob", new Contact("01822222222", "bob@yahoo.com"));
        Student s3 = new Student("Charlie", new Contact("01933333333", "charlie@hotmail.com"));
        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.showStudents();
    }
}
 
 
