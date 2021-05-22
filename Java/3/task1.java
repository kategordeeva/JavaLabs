public class task1 {
    public static void main(String[] args) {
        System.out.println(solution(1,0,-1));
        System.out.println(solution(1,0,0));
        System.out.println(solution(1,0,1));
    }

    private static int solution(int a, int b, int c) {
        int num = 0;
        double discriminant = b*b - 4*a*c;
        if (discriminant == 0) {
            num = 1;
        } else if (discriminant < 0) {
            num = 0;
        } else {
            num = 2;
        }
        return num;
    }
}
