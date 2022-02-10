package Classes.WageCalc;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary > 1000)
            return (0.03 * this.salary);
        return 0;
    }

    public double bonus(){
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        return 0;
    }

    public double raiseSalary(){
        if (2021 - this.hireYear < 10)
            return this.salary * 0.05;
        else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20)
            return this.salary * 0.1;
        else
            return  this.salary * 0.15;
    }

    @Override
    public String toString() {
        return "Adı : " + name + "\nMaaşı : " + salary + "\nÇalışma Saati : " + workHours
                + "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslarla Maaş : " + (salary + bonus() - tax())
                + "\nToplam Maaş : " + (salary + raiseSalary() + bonus() - tax());
    }
}
