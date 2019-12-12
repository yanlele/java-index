package demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Index2 {
    private static List<StudentInfo> studentInfoList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("输入 1 录入学生信息， 输入 2 查看学生信息与排名， 输入 q 退出程序");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            handleInput(str, sc);
            if (str.equals("q")) return;
        }
    }

    private static void handleInput(String input, Scanner sc) {
        try {
            int i = Integer.parseInt(input);
            switch (i) {
                case 1:
                    handleInputStudentInfo(sc);
                    return;
                case 2:
                    Collections.sort(studentInfoList);
                    for (StudentInfo studentInfo: studentInfoList) {
                        System.out.println(studentInfo);
                    }
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("输入 1 录入学生信息， 输入 2 查看学生信息， 输入 q 退出程序");
                    return;
                default:
                    System.out.println(studentInfoList);
            }
        } catch(Exception ignored) {
        }
    }

    private static void handleInputStudentInfo(Scanner sc) {
        System.out.println("请输入学生ID: ");
        String id = sc.next();
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入语文成绩: ");
        Integer chinese = sc.nextInt();
        System.out.println("请输入英语成绩：");
        Integer english = sc.nextInt();
        System.out.println("请输入数学成绩： ");
        Integer math = sc.nextInt();
        studentInfoList.add(new StudentInfo(id, name, chinese, english, math));

        System.out.println("学生成绩录入完成");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("输入 1 录入学生信息， 输入 2 查看学生信息， 输入 q 退出程序");
    }
}
