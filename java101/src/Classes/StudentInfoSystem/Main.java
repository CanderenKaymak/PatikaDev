package Classes.StudentInfoSystem;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Matematik", "MAT101", "MAT");
        Course physics = new Course("Fizik", "FZK101", "FZK");
        Course chemistry = new Course("Kimya", "KMY101", "KMY");

        Teacher teacher1 = new Teacher("Mahmut", "5557654321", "MAT");
        Teacher teacher2 = new Teacher("Fatma", "5057654321", "FZK");
        Teacher teacher3 = new Teacher("Ali", "5427654321", "KMY");

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        Student student1 = new Student("Mert", "46", 4, math, physics, chemistry);
        student1.addBulkExamNote(50, 90, 40, 100, 20, 50);
        student1.isPass();

        Student student2 = new Student("Cüneyit", "12", 4, math, physics, chemistry);
        student2.addBulkExamNote(55, 95, 65, 75, 85, 80);
        student2.isPass();

        Student student3 = new Student("Emrah", "21", 4, math, physics, chemistry);
        student3.addBulkExamNote(84, 80, 55, 65, 90, 90);
        student3.isPass();
    }
}
