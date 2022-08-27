public class Pattern5 {
    private static void printPattern(int noOfLine) {
        for (int i = noOfLine; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
