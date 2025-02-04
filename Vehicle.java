class Vehicle {
  // Instance Variables
  String ownerName;
  String vehicleType;

  // Class Variable
  static double registrationFee = 100.0;  // Fixed registration fee for all vehicles

  // Constructor to initialize vehicle details
  public Vehicle(String ownerName, String vehicleType) {
      this.ownerName = ownerName;
      this.vehicleType = vehicleType;
  }

  // Instance method to display vehicle details
  public void displayVehicleDetails() {
      System.out.println("Owner Name: " + ownerName);
      System.out.println("Vehicle Type: " + vehicleType);
      System.out.println("Registration Fee: $" + registrationFee);
  }

  // Class method to update registration fee
  public static void updateRegistrationFee(double newFee) {
      registrationFee = newFee;
  }

  public static void main(String[] args) {
      Vehicle v1 = new Vehicle("John", "Car");
      Vehicle v2 = new Vehicle("Alice", "Motorcycle");
      v1.displayVehicleDetails();
      v2.displayVehicleDetails();
      Vehicle.updateRegistrationFee(150.0);
      System.out.println("Updated Registration Fee: $" + Vehicle.registrationFee);
  }
}
