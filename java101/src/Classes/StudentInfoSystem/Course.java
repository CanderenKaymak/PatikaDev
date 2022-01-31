package Classes.StudentInfoSystem;

public class Course {
    Teacher courseTeacher;
    String courseName;
    String courseCode;
    String prefix;
    int note;
    int performanceGrade;

    public Course(String courseName, String courseCode, String prefix){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.prefix = prefix;
        this.note = 0;
        this.performanceGrade = 0;
    }

    public void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.courseTeacher = teacher;
            System.out.println("İşlem başarılı... Öğretmen Derse Eklendi!");
        }
        else {
            System.out.println(teacher.name + " Akademisyeni bu dersi veremez..!" );
        }
    }

    public void printTeacher(){
        if (courseTeacher != null){
            System.out.println(this.courseName + " dersinin akademisyeni : " + courseTeacher.name);
        }
        else{
            System.out.println(this.courseName + " dersine akademisyen atanmamıştır.");
        }
    }

}
