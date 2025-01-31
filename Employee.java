class Employee {
  String name;
  int empId;
  double salary;

  public Employee(String name, int empId, double salary) {
      this.name = name;
      this.empId = empId;
      this.salary = salary;
  }

  public void displayDetails() {
      System.out.println("Employee Name: " + name);
      System.out.println("Employee ID: " + empId);
      System.out.println("Employee Salary: " + salary);
  }

  public static void main(String[] args) {
      Employee employee1 = new Employee("John Doe", 12345, 50000.0);
      employee1.displayDetails();
  }
}
