/*
    X dan O
    Program akan menerima input satu variable string,
    program tersebut akan menghasilkan output true jika jumlah karakter x sama dengan o
    dan sebaliknya program akan menghasilkan false jika jumlah karakter x tidak sama dengan o
*/

public class XandO {
    public static boolean fungsiBantuan(String letter) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < letter.length(); i++) {
            switch (letter.charAt(i)) {
                case 'x':
                    countX++;
                    break;
                case 'o':
                    countO++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("count x : " + countX);
        System.out.println("count o : " + countO);

        if (countX != countO) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(fungsiBantuan("xoxoxo"));
        System.out.println(fungsiBantuan("oxooxo"));
        System.out.println(fungsiBantuan("oxo"));
    }
}