public class Pattern4 {
    private static void printPattern(int noOfLine) {
        for (int i = 1; i <= noOfLine; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }

}
