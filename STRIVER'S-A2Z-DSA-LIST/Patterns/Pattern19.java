public class Pattern19 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(i==1 || i==n-1){
                    System.out.print("*");
                }else if(j==1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
}
