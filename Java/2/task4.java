import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
    }

    public static int[] cumulativeSum(int[] ints) {
        int[] res = new int[ints.length];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < i+1; j++) {
                res[i] += ints[j];
            }
        }
        return res;
    }
}
