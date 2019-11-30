package demo10;

public class Index2 {
    public static void main(String[] args) {
        Index2 index2 = new Index2();

        int[] findMax = index2.findMax();

        System.out.println("max: " + findMax[0]);
        System.out.println("行号: " + findMax[1]);
        System.out.println("列号: " + findMax[2]);
    }

    private int[][] arr = {{0, 1, 2, 3}, {400, 5}, {8, 9, 10}};

    public Index2() {
    }

    public Index2(int[][] arr) {
        this.arr = arr;
    }

    public int[] findMax() {
        int row = 0; // 最大的行
        int col = 0; // 最大的列
        int max = 0; // 最大值

        // 一行最大的值
        int[] rowMax = new int[this.arr.length];


        // 默认赋值
        for (int i = 0; i < this.arr.length; i++) {
            rowMax[i] = 0;
        }

        for (int i = 0; i < this.arr.length; i++) {
            // 拿到一行的最大值
            for (int j = 0; j < this.arr[i].length; j++) {
                if (rowMax[i] < this.arr[i][j]) {
                    rowMax[i] = this.arr[i][j];
                }
            }
        }

        for (int i = 0; i < rowMax.length; i++) {
            if (max < rowMax[i]) {
                max = rowMax[i];
                row = i;
            }
        }

        int temp = 0;
        for (int i = 0; i < this.arr[row].length; i++) {
            if (temp < this.arr[row][i]) {
                temp = this.arr[row][i];
                col = i;
            }
        }

        return new int[]{max, row, col};
    }
}
