public class Vehicle {
  static double registrationFee;
  String ownerName;
  String vehicleType;
  final int registrationNumber;
  static void updateRegistrationFee(double newRegistrationFee){
    registrationFee=newRegistrationFee;
    System.out.println(registrationFee);
  }
  Vehicle(String ownerName,String vehicleType,int registrationNumber){
    this.ownerName=ownerName;
    this.vehicleType=vehicleType;
    this.registrationNumber=registrationNumber;
  } 
  void displayDetails(){
    System.out.println("owner name= "+ownerName);
    System.out.println("vehicle type = "+vehicleType);
    System.out.println("registration number = "+registrationNumber);
    System.out.println("registration fee = "+registrationFee);
  }
  public static void main(String[] args) {
      Vehicle v1=new Vehicle("Kaustav","Car",1234);
      Vehicle.updateRegistrationFee(100000);
if(v1 instanceof Vehicle){
  v1.displayDetails();
  System.out.println();

}     
updateRegistrationFee(123);
  } 
}
