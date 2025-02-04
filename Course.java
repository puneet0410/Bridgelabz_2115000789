class Course {
  // Instance Variables
  String courseName;
  int duration;  // Duration in weeks
  double fee;

  // Class Variable
  static String instituteName = "XYZ Institute";  // Common for all courses

  // Constructor to initialize course details
  public Course(String courseName, int duration, double fee) {
      this.courseName = courseName;
      this.duration = duration;
      this.fee = fee;
  }

  // Instance method to display course details
  public void displayCourseDetails() {
      System.out.println("Course Name: " + courseName);
      System.out.println("Duration: " + duration + " weeks");
      System.out.println("Fee: $" + fee);
  }

  // Class method to update the institute name for all courses
  public static void updateInstituteName(String newInstituteName) {
      instituteName = newInstituteName;
  }

  public static void main(String[] args) {
      Course c1 = new Course("Java Programming", 10, 300);
      Course c2 = new Course("Data Structures", 8, 250);
      c1.displayCourseDetails();
      c2.displayCourseDetails();
      Course.updateInstituteName("ABC University");
      System.out.println("Updated Institute Name: " + Course.instituteName);
  }
}
