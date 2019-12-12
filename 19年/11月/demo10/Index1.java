package demo10;

public class Index1 {
    public static void main(String[] args) {
        Index1 index1 = new Index1();
        System.out.println("最大值: " + index1.getMax());
        System.out.println("平均值: " + index1.getMean());
    }

    private int[] arr = {12, 3, 4, 5, 6, 7, 8, 9};

    public Index1() {
    }

    public Index1(int[] arr) {
        this.arr = arr;
    }

    /**
     * 返回平均值
     * @return 平均值
     */
    public int getMean() {
        int result = 0;
        for (int i : this.arr) {
            result += i;
        }
        return result / this.arr.length;
    }

    /**
     * 获取最大值
     * @return 最大值
     */
    public int getMax() {
        int sum = this.arr[0];
        for (int i = 0; i < this.arr.length; i++) {
            if (sum < arr[i]) {
                sum = arr[i];
            }
        }
        return sum;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
