public class Pattern6 {
    private static void printPattern(int noOfLine) {
        for (int i = noOfLine; i > 0; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
