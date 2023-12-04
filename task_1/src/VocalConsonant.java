
/*
    Vokal Konsonan
    Menghitung jumlah karakter yang berupa vokal, konsonan dan total karakter dari kalimat 'Alterra Indonesia'

    Input :
    Alterra Indonesia

    Output :
    Jumlah Vokal : 8
    Jumlah Konsonan : 8
    Total Karakter : 16
*/


public class VocalConsonant {
    public static void main(String[] args) {
        String letter = "Alterra Indonesia";
        Integer countVocal = 0;
        Integer countConsonant = 0;
        Integer totalChar = 0;
        for (int i = 0; i < letter.length(); i++) {
            switch (Character.toLowerCase(letter.charAt(i))) {
                case 'a':
                case 'i':
                case 'u':
                case 'e':
                case 'o':
                    countVocal++;
                    // System.out.println(letter.charAt(i) + " vocal");
                    break;
                case ' ':
                    break;
                default:
                    countConsonant++;
                    // System.out.println(letter.charAt(i) + " consonant");

            }

            totalChar++;
        }

        System.out.println("Count Vocal : " + countVocal);
        System.out.println("Count Consonant : " + countConsonant);
        System.out.println("Total Character : " + totalChar);

    }
}