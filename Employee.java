public class Employee{
  String name;
  final int id;
  String designation;
  static String companyName;
  static int totalEmployees;
  static void displayTotalEmployees(){
    System.out.println(totalEmployees);
  }
  Employee(String name,int id,String designation){
    this.name=name;
    this.id=id;
    this.designation=designation;
    totalEmployees++;
  }
  void displaydetails(){
    System.out.println(name);
    System.out.println(id);
    System.out.println(designation);
    System.out.println(companyName);
    }
   public static void main(String[] args) {
    Employee.companyName="Puneet and co";
  Employee e1=new Employee("Puneet",12345,"SDE");
  Employee e2=new Employee("Mayank",123345,"SDE");
  if(e1 instanceof Employee){
   e1.displaydetails();
  }
  if(e2 instanceof Employee){
    e2.displaydetails();
  }
  displayTotalEmployees();
}
}