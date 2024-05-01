public class BasePlusCommissionEmployee extends CommissionEmployee {
   private double baseSalary; // base salary per week

   // Constructor with base salary
   public BasePlusCommissionEmployee(String firstName, String lastName, int socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
       super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
       
       // Validate base salary
       if (baseSalary < 0.0) {
           throw new IllegalArgumentException("Base salary must be >= 0.0");
       }
       
       this.baseSalary = baseSalary;
   }

   // Set base salary with validation
   public void setBaseSalary(double baseSalary) {
       if (baseSalary < 0.0) {
           throw new IllegalArgumentException("Base salary must be >= 0.0");
       }

       this.baseSalary = baseSalary;
   }

   // Return base salary
   public double getBaseSalary() {
       return baseSalary;
   }

   // Calculate earnings with base salary
   @Override
   public double earnings() {
       return getBaseSalary() + super.earnings();
   }

   // Return string representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
       return String.format(
           "%s\nBase Salary: %.2f\nTotal Earnings: %.2f",
           super.toString(),
           getBaseSalary(),
           earnings()
       );
   }
}
