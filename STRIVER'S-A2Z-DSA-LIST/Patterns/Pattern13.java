public class Pattern13 {
    public static void main(String[] args) {
        int n = 26,k=64;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(k+j));
            }
            System.out.println();
        }
      
    }
}
