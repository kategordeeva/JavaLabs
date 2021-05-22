public class task7 {
    public static void main(String[] args) {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }

    static int addUpTo(int a) {
        int r = a;
        for (int i = 0; i < a; i++)
            r = r + i;
        return r;
    }
}
