public class Pattern15 {
    public static void main(String[] args) {
        int n = 4, k = 64;
        int highest = (n * 2) - 1;
        for (int i = 1; i <= n; i++) {
            int space = (highest % n) - i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            int t = k;
            for (int j = 0; j < (i * 2) - 1; j++) {
                if (j > (((i * 2) - 1)) / 2) {
                    System.out.print((char) (t - 1));
                    t--;
                } else {
                    System.out.print((char) (t + 1));
                    t++;
                }
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
