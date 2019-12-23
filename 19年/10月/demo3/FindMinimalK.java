package demo3;

/**
 * 第四题
 * 程序功能：已知，问最大为什么值能够使得?  (变种，最小的K，使得sum(k)>2000)
 */
public class FindMinimalK {
    public static void main(String[] args) {
        int sum = 1;
        int k = 1;
        while (sum <= 2000) {
            k++;
            sum = sum + k;
        }
        System.out.println("the max k=" + k);
    }
}
