
import java.util.Scanner;

public class Reverse {
   public Reverse() {
   }

   public static String reverse(String var0) {
      StringBuilder var1 = new StringBuilder(var0);
      var1.reverse();
      return var1.toString();
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String var2 = var1.nextLine();
      System.out.println(reverse(var2));
      var1.close();
   }
}
