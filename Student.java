public class Student {
  String name;
  final int rollNumber;
  int grade;
  String universityStudent;
  static int totalStudents;
  Student(String name,int rollNumber,int grade){
    this.name=name;
    this.rollNumber=rollNumber;
    this.grade=grade;
    totalStudents++;
  }
  static void displayTotalStudents(){
    System.out.println("total number of students = "+totalStudents);
  }
  void displayDetails(){
    System.out.println(name);
    System.out.println(rollNumber);
    System.out.println(grade);

  }
  public static void main(String []args){
    Student s1=new Student("punnu",2132,12);
    if(s1 instanceof Student){
      Student.displayTotalStudents();
      s1.displayDetails();
    }
  }
}
