public class task10 {
    public static void main(String[] args) {
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
    }

    private static int boxSeq(int i) {
        int s = 0;
        for (int step = 1; step <= i; step++) {
            if (step % 2 != 0)
                s += 3;
            else
                s -= 1;
        }
        return s;
    }
}
