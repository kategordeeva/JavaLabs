public class task6 {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(12));
    }

    private static int fibonacci(int k) {
        int n0 = 1;
        int n1 = 1;
        int n2 = 0;
        for (int i = 3; i <= k+1; i++) {
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
        }
        return n2;
    }
}
