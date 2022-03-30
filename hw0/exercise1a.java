// public class exercise1a {
//     public static void main(String[] args) {
//         for (int i=1;i<=5;i++) {
//             while (i>0) {
//                 System.out.print("*");
//                 i--;
//             }
//             System.out.println();
//         }
//     }
// }
public class exercise1a {
    public static void main(String[] args) {
        int i=1;
        while (i<6){
          for (int j=0;j<i;j++) {
            System.out.print("*");
          }
          i=i+1;
          System.out.println();
        }
    }
}