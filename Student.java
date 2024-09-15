public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course c4;
    Course c5;
    Course c6;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void    addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void    addBulkHomeworkNote(int homework1, int homework2, int homework3) {
        if (homework1 >= 0 && homework1 <= 100) {
            this.c1.homework = homework1;
        }
        if (homework2 >= 0 && homework2 <= 100) {
            this.c2.homework = homework2;
        }
        if (homework3 >= 0 && homework3 <= 100) {
            this.c3.homework = homework3;
        }
    }


    void isPass(){
        System.out.println("====================================");
        this.average = ((this.c1.note * 0.80) + (this.c1.homework * 0.20) + (this.c2.note * 0.80) + (this.c2.homework * 0.20) + (this.c3.note * 0.80) + (this.c3.homework * 0.20)) / 3.0;
        if (this.average>55){
            System.out.println("Sinifi Basariyla Gectiniz!");
            this.isPass = true;

        }else{
            System.out.println("Sinifta Kaldiniz!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu:" + this.c1.note);
        System.out.println(this.c2.name + " Notu:" + this.c2.note);
        System.out.println(this.c3.name + " Notu:" + this.c3.note);
        System.out.println(this.c1.name + " Sozlu Notu:" + this.c1.homework);
        System.out.println(this.c2.name + " Sozlu Notu:" + this.c2.homework);
        System.out.println(this.c3.name + " Sozlu:" + this.c3.homework);
        System.out.println("Ortalamaniz :" +this.average);

    }
}



