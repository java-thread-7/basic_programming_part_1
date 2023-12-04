/*
    Play With Asterisk
    Buatlah sebuah program untuk mencetak segitiga asterik seperti dibawah ini.
    Sample test cases:
    input: 5
    output:
        *
       * *
      * * *
     * * * *
    * * * * *
*/

public class PlayWithAsterisk {
    public static String playWithAsterisk(int num) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < num ; i++) {
            //output.append("* ");
            for (int j = 0; j < num - i; j++) {
                output.append(" ");
            }
            //for (int k = 0; k <= i; k++) {
            //    output.append("* ");
            //}
            for (int k = i ; k >= 0; k--) {
                output.append("* ");
            }
            output.append("\n");
        }

        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(playWithAsterisk(5));
    }
}