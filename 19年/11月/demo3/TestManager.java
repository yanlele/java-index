package demo3;

public class TestManager {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 1, 7000, 1000);

        System.out.println("姓名： " + manager.getName());
        System.out.println("工资： " + manager.getSalary());
        System.out.println("奖金： " + manager.getBonus());
        System.out.println("id:"+manager.getId());
        manager.work();
        System.out.println("jiangjin:"+manager.getBonus());
    }
}
