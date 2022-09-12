public class Pattern10 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
      
    }
}
