class Student {
  // Access modifiers for Student class
  public int rollNumber;
  protected String name;
  private double CGPA;

  // Public method to access and modify CGPA
  public double getCGPA() {
      return CGPA;
  }

  public void setCGPA(double CGPA) {
      this.CGPA = CGPA;
  }
}

class PostgraduateStudent extends Student {
  // Access protected member 'name' in subclass
  public void displayDetails() {
      System.out.println("Name: " + name);
  }

  public static void main(String[] args) {
      PostgraduateStudent pgStudent = new PostgraduateStudent();
      pgStudent.name = "John";  // Accessing protected member
      pgStudent.setCGPA(3.8);
      pgStudent.displayDetails();
      System.out.println("CGPA: " + pgStudent.getCGPA());
  }
}
