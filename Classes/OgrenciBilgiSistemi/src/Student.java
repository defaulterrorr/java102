public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            this.mat.sozlu=60;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
            this.fizik.sozlu=70;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
            this.kimya.sozlu=80;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*(1-this.fizik.FizikSozluOran)+this.fizik.sozlu*this.fizik.FizikSozluOran) +
                (this.kimya.note*(1-this.kimya.KimyaSozluOran)+this.kimya.sozlu*this.kimya.KimyaSozluOran) +
                (this.mat.note*(1-this.mat.MatSozluOran)+this.mat.note*this.mat.MatSozluOran)) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        sozluOranPrint();
    }
    public void sozluOranPrint(){
        System.out.println("Matematik Sozlu orani : %" +(this.mat.MatSozluOran)*100 );
        System.out.println("Fizik Sozlu orani : %" +(this.fizik.FizikSozluOran)*100 );
        System.out.println("Kimya Sozlu orani : %" +(this.kimya.KimyaSozluOran)*100 );
    }
}
