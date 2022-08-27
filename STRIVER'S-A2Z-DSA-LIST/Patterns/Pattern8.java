public class Pattern8 {
    private static void printPattern(int noOfLine) {
        int highest = (noOfLine * 2) - 1;
        for (int i = noOfLine; i >= 0; i--) {
            int space = (highest % noOfLine) - i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = (i * 2) - 1; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
