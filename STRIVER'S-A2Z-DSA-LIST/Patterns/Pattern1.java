public class Pattern1 {
    private static void printPattern(int noOfLine){
        for (int i = 0; i < noOfLine; i++) {
            for (int j = 0; j < noOfLine; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
