// CommissionEmployee class extends Employee and adds commission-based functionality
public class CommissionEmployee extends Employee {                  
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // Constructor with five arguments
   public CommissionEmployee(String firstName, String lastName, int socialSecurityNumber, double grossSales, double commissionRate) {
      super(firstName, lastName, socialSecurityNumber);

      // Validate gross sales
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }

      // Validate commission rate
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
      }
      
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // Set gross sales with validation
   public void setGrossSales(double grossSales) {
      if (grossSales < 0.0) {
         throw new IllegalArgumentException("Gross sales must be >= 0.0");
      }
      this.grossSales = grossSales;
   } 

   // Get gross sales
   public double getGrossSales() {
      return grossSales;
   } 

   // Set commission rate with validation
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
      }
      this.commissionRate = commissionRate;
   } 

   // Get commission rate
   public double getCommissionRate() {
      return commissionRate;
   }

   // Calculate earnings based on commission and gross sales
   public double earnings() {
      return getCommissionRate() * getGrossSales();
   } 

   // Return string representation of CommissionEmployee
   @Override 
   public String toString() {
      return String.format(
         "%s\nGross Sales: %.2f\nCommission Rate: %.2f\nEarnings: %.2f",
         super.toString(), 
         getGrossSales(), 
         getCommissionRate(), 
         earnings()
      );
   } 
}
