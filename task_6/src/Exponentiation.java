public class Exponentiation {
    public static String exponentiation(int m, int n) {
        double resultDouble = 1;
        for (int i = 1; i <= n; i++) {
            resultDouble *= m;
        }
        String resultStr = String.valueOf(resultDouble);
        return resultStr;
    }
    public static void main(String[] args) {
        System.out.println(exponentiation(2,3));
        System.out.println(exponentiation(5,2));
        System.out.println(exponentiation(7,2));
    }
}