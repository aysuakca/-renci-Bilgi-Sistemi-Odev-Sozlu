public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int homework;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        note = 0;
        homework = 0;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals((this.prefix))){
            this.teacher = teacher;

        }else{
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
