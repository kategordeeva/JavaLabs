public class task1 {
    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("stop", 2));
    }

    public static String repeat(String s, int n) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < n; j++) {
                res += s.charAt(i);
            }
        }
        return res;
    }
}
