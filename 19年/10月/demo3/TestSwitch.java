package demo3;

/**
 * 第二题
 * 使用switch 语句
 */
public class TestSwitch {
    public static void main(String[] args) {
        int c = 38;
        int grade = c / 10;
        switch (grade) {
            case 1:
                System.out.println(" " + c + "℃ 有点冷。要多穿衣服。");
                break;
            case 2:
                System.out.println(" " + c + "℃ 正合适。出去玩吧。");
                break;
            case 3:
                System.out.println(" " + c + "℃ 有点热。");
                break;
            default:
                System.out.println(" " + c + "℃ 太热了!开空调。");
        }
    }
}
