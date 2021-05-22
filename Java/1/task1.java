public class task1 {
    public static void main(String[] args) {
        System.out.println(remainder(1,1));
        System.out.println(remainder(3,4));
        System.out.println(remainder(-9,45));
        System.out.println(remainder(5,5));
    }

    static int remainder(int a, int b) {
        return a % b;
    }
}
