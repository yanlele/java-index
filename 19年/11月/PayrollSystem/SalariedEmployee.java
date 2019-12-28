package PayrollSystem;

public class SalariedEmployee extends Employee {
    private int monthlySalary;

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public int earnings() {
        return monthlySalary;
    }

    public int birthdayBouns() {
        return 0;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name='" + this.getName() + '\'' +
                ", number=" + this.getName() +
                ", birthday=" + this.getBirthday() +
                '}';
    }
}
