package PayrollSystem;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hour;

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public int earnings() {
        return this.wage * this.hour;
    }

    public int birthdayBouns() {
        return 0;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name='" + this.getName() + '\'' +
                ", number=" + this.getName() +
                ", birthday=" + this.getBirthday() +
                '}';
    }
}
