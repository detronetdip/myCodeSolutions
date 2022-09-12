public class Pattern11 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=i){
                    System.out.print(j+" ");
                }else{
                    System.out.print(" ");
                }
            }
            for (int j = n; j > 0; j--) {
                if(j<=i){
                    System.out.print(j+" ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
      
    }
}
