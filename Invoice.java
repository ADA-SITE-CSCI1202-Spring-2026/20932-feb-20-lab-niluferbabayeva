
class Invoice {
   private String partNumber;
   private String partDescription;
   private int quantity;
   private double pricePerItem;

   public Invoice(String var1, String var2, int var3, double var4) {
      this.partNumber = var1;
      this.partDescription = var2;
      this.quantity = Math.max(0, var3);
      this.pricePerItem = Math.max(0.0, var4);
   }

   public double getInvoiceAmount() {
      return (double)this.quantity * this.pricePerItem;
   }

   public void printInvoice() {
      System.out.println("Part Number: " + this.partNumber);
      System.out.println("Description: " + this.partDescription);
      System.out.println("Quantity: " + this.quantity);
      System.out.println("Price per item: " + this.pricePerItem);
      System.out.println("Invoice amount: " + this.getInvoiceAmount());
      System.out.println();
   }
}