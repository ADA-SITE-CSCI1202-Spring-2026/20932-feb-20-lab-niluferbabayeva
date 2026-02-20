 
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number of invoices: ");
      int var2 = var1.nextInt();
      var1.nextLine();
      Invoice[] var3 = new Invoice[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         System.out.println("\nInvoice " + (var4 + 1));
         System.out.print("Part number: ");
         String var5 = var1.nextLine();
         System.out.print("Part description: ");
         String var6 = var1.nextLine();
         System.out.print("Quantity: ");
         int var7 = var1.nextInt();
         System.out.print("Price per item: ");
         double var8 = var1.nextDouble();
         var1.nextLine();
         var3[var4] = new Invoice(var5, var6, var7, var8);
      }

      System.out.println("\nInvoice Results:\n");
      Invoice[] var10 = var3;
      int var11 = var3.length;

      for(int var12 = 0; var12 < var11; ++var12) {
         Invoice var13 = var10[var12];
         var13.printInvoice();
      }

      var1.close();
   }
}
