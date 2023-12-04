/*
    Bilangan Prima
    Dalam matematika, bilangan prima adalah bilangan asli yang lebih besar dari angka 1,
    yang faktor pembaginya adalah 1 dan bilangan itu sendiri. 2 dan 3 adalah bilangan prima.
    4 bukan bilangan prima karena 4 bisa dibagi 2. Kamu diminta untuk membuat fungsi untuk
    menentukan bahwa sebuah bilangan termasuk bilangan prima atau bukan prima.
    sample test cases:
    input: 7
    output: Bilangan Prima

    input: 17
    output: Bilangan Prima

    input: 19
    output: Bilangan Prima

    input: 10
    output: Bukan Bilangan Prima
*/

public class BilanganPrima {
    public static void isPrime(int num) {
        if (num <= 1) {
            System.out.println("Bukan Bilangan Prima");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Bukan Bilangan Prima");
                return;
            }
        }
        System.out.println("Bilangan Prima");
    }

    public static void main(String[] args) {
        System.out.println("input: 2");
        isPrime(2);
        System.out.println("input: 7");
        isPrime(7);
        System.out.println("input: 17");
        isPrime(17);
        System.out.println("input: 19");
        isPrime(19);
        System.out.println("input: 10");
        isPrime(10);
    }
}