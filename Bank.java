class Bank {
public static void main(String[] args) {
SavingsAccount savingsAccount = new SavingsAccount("John Doe", "SA1001");
CurrentAccount currentAccount = new CurrentAccount("Jane Smith","CA2002");
// Perform operations on savings account
savingsAccount.deposit(5000);
savingsAccount.displayBalance();
savingsAccount.computeInterest();
savingsAccount.displayBalance();
savingsAccount.withdraw(2000);
savingsAccount.displayBalance();
// Perform operations on current account
currentAccount.deposit(8000);
currentAccount.displayBalance();

currentAccount.withdraw(5000);
currentAccount.displayBalance();
}
}
class Account {
protected String customerName;
protected String accountNumber;
protected double balance;
public Account(String customerName, String accountNumber) {
this.customerName = customerName;
this.accountNumber = accountNumber;
this.balance = 0;
}
public void deposit(double amount) {
balance += amount;
System.out.println("Deposit of $" + amount + " successful");
}
public void displayBalance() {
System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
}
}
class SavingsAccount extends Account {
public SavingsAccount(String customerName, String accountNumber) {
super(customerName, accountNumber);
}
public void computeInterest() {
double interestRate = 0.05; // Assuming a 5% interest rate
double interest = balance * interestRate;
balance += interest;
System.out.println("Interest of $" + interest + " computed and added to the balance.");
}
public void withdraw(double amount) {
if (balance >= amount) {
balance -= amount;
System.out.println("Withdrawal of " + amount + " successful");
} else {
System.out.println("Insufficient funds for withdrawal.");

}
}
}
class CurrentAccount extends Account {
private double minimumBalance = 1000; // Assuming a minimum balance requirement
public CurrentAccount(String customerName, String accountNumber) {
super(customerName, accountNumber);
}
public void withdraw(double amount) {
if (balance - amount >= minimumBalance) {
balance -= amount;
System.out.println("Withdrawal of " + amount + " successful.");
} else {
System.out.println("Insufficient funds. Service charge applied.");
imposeServiceCharge();
}
}
private void imposeServiceCharge() {
double serviceCharge = 20; // Assuming a service charge of $20
balance -= serviceCharge;
System.out.println("Service charge of $" + serviceCharge + " imposed.");
}
}
