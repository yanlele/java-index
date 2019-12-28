package PayrollSystem;

public class PayrollSystem {
    public static Employee[] getEmployee() {
        Employee[] employee = new Employee[7];

        employee[0] = new Employee("张三", 1, new MyDate(1997, 12, 12));
        employee[1] = new Employee("李四", 2, new MyDate(1996, 12, 12));
        employee[2] = new HourlyEmployee("王五", 3, new MyDate(1995, 10, 11), 100, 120);
        employee[3] = new HourlyEmployee("赵柳", 4, new MyDate(1994, 7, 20), 120, 110);
        employee[4] = new SalariedEmployee("张器", 5, new MyDate(1993, 3, 21), 6000);
        employee[5] = new SalariedEmployee("刘八", 6, new MyDate(1992, 6, 15), 7000);
        employee[6] = new SalariedEmployee("吴九", 7, new MyDate(1991, 2, 23), 8000);
        return employee;
    }

    public static void main(String[] args) {
        Employee[] employee = getEmployee();
        for (Employee hudapang : employee) {
            System.out.println(hudapang.toString());
        }

//        for (int i = 0; i < employee.length; i++) {
//            System.out.println(employee[i]);
//        }
    }
}
