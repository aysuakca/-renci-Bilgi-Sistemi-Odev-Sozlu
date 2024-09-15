public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca","TRH","939393");
        Teacher t2 = new Teacher("Ayse Hoca","FZK","292929");
        Teacher t3 = new Teacher("Selen Hoca","BIO","123213");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Duygu","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.addBulkHomeworkNote(50,70,40);
        s1.isPass();

    }
    }