class Employee {
  // Access modifiers for Employee class
  public int employeeID;
  protected String department;
  private double salary;

  // Public method to modify salary
  public void modifySalary(double amount) {
      salary += amount;
  }
}

class Manager extends Employee {
  // Access protected member 'department' in subclass
  public void displayEmployeeDetails() {
      System.out.println("Employee ID: " + employeeID);
      System.out.println("Department: " + department);
  }

  public static void main(String[] args) {
      Manager manager = new Manager();
      manager.employeeID = 101;
      manager.department = "HR";
      manager.modifySalary(5000);
      manager.displayEmployeeDetails();
  }
}
