public class Pattern9 {
    private static void printPattern(int noOfLine) {
        int half = noOfLine / 2;
        int highest = (half * 2) - 1;
        for (int i = 1; i <= half; i++) {
            int space = (highest % half) - i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = half; i >= 0; i--) {
            int space = (highest % half) - i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = (i * 2) - 1; j > 0; j--) {
                System.out.print(".");
            }
            for (int j = space; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(50);
    }
}
