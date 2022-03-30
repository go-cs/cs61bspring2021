public class exercise1b {
   
   public static void drawTriangle(int N) {
      int i = 1;
      while (i<=N){
         for (int j = 0;j<i;j++) {
            System.out.print("*");
         }
         i++;
         System.out.println();
         
      }
   }
   
   public static void main(String[] args) {
      drawTriangle(10);      
   }
}