import java.util.ArrayList;
import java.util.List;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private List<Payable> deductions;

    public Employee(int registrationNumber, String name, int salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.deductions = new ArrayList<>();
    }

    public void addDeduction(Payable p) {
        deductions.add(p);
    }

    public List<Payable> getDeductions() {
        return deductions;
    }

    @Override
    public int getPayableAmount() {
        int totalDeductions = 0;
        for (Payable p : deductions) {
            totalDeductions += p.getPayableAmount();
        }
        return salaryPerMonth - totalDeductions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee: ").append(name).append("\n")
          .append("Registration Number: ").append(registrationNumber).append("\n")
          .append("Salary per Month: ").append(salaryPerMonth).append("\n")
          .append("Deductions:\n");

        for (Payable p : deductions) {
            sb.append("  - ").append(p.toString()).append("\n");
        }

        sb.append("Net Salary after Deductions: ").append(getPayableAmount());
        return sb.toString();
    }
}