/*
    Faktor Bilangan
    Faktor suatu bilangan adalah suatu bilangan yang dapat habis membagi bilangan tersebut.
    Tugas anda adalah membuat sebuah program untuk mencetak faktor sebuah bilangan.
    input: 6
    output: 1
            2
            3
            6
    input: 20
    output: 1
            2
            4
            5
            10
            20
*/

public class FaktorBilangan {
    public static void fungsiBantuan(int num) {
        System.out.println("output: ");
        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("input: 6");
        fungsiBantuan(6);
        System.out.println("input: 20");
        fungsiBantuan(20);
    }
}