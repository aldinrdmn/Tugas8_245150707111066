public class Main {
    public static void main(String[] args) {
        // ===== Karyawan 1 =====
        Employee emp1 = new Employee(101, "Budi", 5000000);
        emp1.addDeduction(new Invoice("Pensil", 10, 2000));
        emp1.addDeduction(new Invoice("Buku Tulis", 5, 5000));

        // ===== Karyawan 2 =====
        Employee emp2 = new Employee(102, "Sari", 4500000);
        emp2.addDeduction(new Invoice("Map", 2, 3000));
        emp2.addDeduction(new Invoice("Pulpen", 6, 2500));
        emp2.addDeduction(new Invoice("Kertas A4", 1, 10000));

        // ===== Karyawan 3 =====
        Employee emp3 = new Employee(103, "Andi", 6000000);
        emp3.addDeduction(new Invoice("Sticky Note", 3, 4000));

        // ===== Cetak semua karyawan =====
        Employee[] employees = { emp1, emp2, emp3 };

        for (Employee emp : employees) {
            System.out.println("======================================");
            System.out.println(emp);
            System.out.println("======================================\n");
        }
    }
}
