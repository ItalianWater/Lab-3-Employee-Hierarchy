public class EmployeeApp {
    public static void main(String[] args) {
        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Liam", "Callahan", 111111111, 50326.21, 0.2, 60000.00);
        System.out.println(bpce.toString());
    }
}
