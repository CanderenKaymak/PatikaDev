package Classes.StudentInfoSystem;

public class Student {
    String studentName;
    String studentNo;
    int classes;
    Course math;
    Course physic;
    Course chem;
    double average;
    boolean isPass;

    public Student(String studentName, String studentNo, int classes, Course math,
                   Course physic, Course chem) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.physic = physic;
        this.chem = chem;
        calcAverage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mathNote, int mathPerfNote, int physicNote, int physicPerfNote, int chemNote,
                                int chemPerfNote){
        if (mathNote >= 0 && mathNote <= 100) {
            this.math.note = mathNote;
            this.math.performanceGrade = mathPerfNote;
        }

        if (physicNote >= 0 && physicNote <= 100) {
            this.physic.note = physicNote;
            this.physic.performanceGrade = physicPerfNote;
        }

        if (chemNote >= 0 && chemNote <= 100) {
            this.chem.note = chemNote;
            this.chem.performanceGrade = chemPerfNote;
        }
    }

    private void calcAverage() {
        this.average =
                ((this.physic.note * 0.8 + (this.physic.performanceGrade * 0.2)) +
                        (this.chem.note *0.8 + (this.chem.performanceGrade * 0.2)) +
                        (this.math.note * 0.8 + (this.math.performanceGrade * 0.2))) / 3;
    }

    public void isPass(){
        if (this.math.note == 0 || this.physic.note == 0 || this.chem.note == 0){
            System.out.println("Notlar tam olarak girilmedi...");
        }else{
            this.isPass =isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);

            if (this.isPass) System.out.println("Sınıfı Geçti.");
            else System.out.println("Sınıfta kaldı..!");
        }

    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("==================");
        System.out.println("Öğrenci : " + this.studentName);
        System.out.println("Matematik Notu : " + this.math.note + " Matematik Kanaat Notu : " + this.math.performanceGrade);
        System.out.println("Kimya Notu : " + this.chem.note + " Kimya Kanaat Notu : " + this.chem.performanceGrade);
        System.out.println("Fizik Notu : " + this.physic.note + " Fizik Kanaat Notu : " + this.physic.performanceGrade);
    }
}
