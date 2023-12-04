public class TabelPerkalian {
    public static String tabelPerkalian(int num) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                output.append(String.format("%3d",i * j));
            }
            output.append("\n");
        }
        return output.toString();
    }
    public static void main(String[] args) {
        System.out.println(tabelPerkalian(9));
    }
}