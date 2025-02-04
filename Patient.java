public class Patient {
  String name;
  int age;
  String ailment;
  static String hospitalName;
  final int patientId;
   static int numberOfPatients;
  Patient(String name,int age,String ailment,int patientId){
    this.name=name;
    this.age=age;
    this.ailment=ailment;
    this.patientId=patientId;
    numberOfPatients++;
  }
  static void getTotalPatients(){
    
    System.out.println("here is the number of patients = "+numberOfPatients);;
  }
  void displayDetails(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(ailment);
    System.out.println(patientId);
    System.out.println(numberOfPatients);
  }

  public static void main(String[] args) {
      Patient p1=new Patient("Puneet",22,"adhd",23456);
      p1.displayDetails();


  }
}
