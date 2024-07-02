public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        if(this.salary < 1000){
            return 0;
        }
        return this.salary*0.03;
    }
    public int bonus(){
        if(workHours>40){
            return (this.workHours-40)*30;
        }
        return this.workHours;
    }
    public double raiseSalary(){
        if (2021-hireYear > 19){
            return this.salary*0.15;
        } else if (2021-hireYear > 9) {
            return this.salary*0.10;
        } else if (2021-hireYear < 10) {
            return this.salary*0.05;
        }
        else
            return 0;
    }
    public void toStringg(){
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma Saati: " + this.workHours);
        System.out.println("Baslangic Yili: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas: " + (salary-tax()+bonus()));
        System.out.println("Toplam Maas: " + (salary-tax()+bonus()+raiseSalary()));
    }
}
