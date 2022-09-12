public class Pattern18 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = n; j > 0; j--) {
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = n; j > 0; j--) {
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
      
    }
}
