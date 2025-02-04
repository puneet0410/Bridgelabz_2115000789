public class BankAccount {
  String accountHolderName;
  final int accountNumber;
  static int totalAccount=0;

  static String bankName;
  static void getTotalAccounts(){
  System.out.println("total accounts"+totalAccount);
  }
  BankAccount(String accountHolderName,int accountNumber){
    this.accountHolderName=accountHolderName;
    this.accountNumber=accountNumber;
    totalAccount++;
  }
  void displayDetails(){
    System.out.println("here is the name"+accountHolderName);
    System.out.println("here is the name"+accountNumber);
    System.out.println("here is the bank name="+bankName);

  }






  public static void main(String[] args) {
    BankAccount bk=new BankAccount("puneet",12345);
    
    bankName="xcv";
    if(bk instanceof BankAccount){
      bk.displayDetails();
    }
    getTotalAccounts();

}  
}
