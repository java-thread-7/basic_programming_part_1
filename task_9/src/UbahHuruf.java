public class UbahHuruf {
    public static String ubahHuruf(String sentence) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                result.append(" ");
            } else {
                // int j = sentence.charAt(i) + 10;
                // if (j > 90) {
                //     j = j - 26;
                // }
                int j = sentence.charAt(i) + 10;
                if (Character.isUpperCase(sentence.charAt(i))) {
                    if (j > 'Z') {
                        j = j - 26;
                    }
                } else if (Character.isLowerCase(sentence.charAt(i))) {
                    if (j > 'z') {
                        j = j - 26;
                    }
                }
                result.append((char) j);
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("HELLO WORLD!"));
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}