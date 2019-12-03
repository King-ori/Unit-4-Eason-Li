

import java.util.Random;




public class BankAccount{
 private double balance = 30000;
 private String fullName = "Bob";
 private int pinNumber = 1234;
 private int phoneNumber = 123456789;
 private double withdrawal = 0;
 private double moneyOwed = 0;
 private double interestRate = 0;
 private final int overDraftLimit = 2000;

 public BankAccount(String AccountFullname , int AccountPhoneNumber , int AccountPinNumber ,
                    double AccountBalance , double AccountWithdrawal, double AccountMoneyOwed , double AccountInterestRate){

   fullName = AccountFullname;
   phoneNumber = AccountPhoneNumber;
   pinNumber = AccountPinNumber;
   balance = AccountBalance;
   withdrawal = AccountWithdrawal;
   moneyOwed = AccountMoneyOwed;
   interestRate = AccountInterestRate;
 }

 public String getFullName(){
   return fullName;
 }


 public int getPhoneNumber(){
   return phoneNumber;
 }



 public int getPinNumber(){
   return pinNumber;
 }


 public double getBalance(){
   return balance;
 }

 public double getWithdrawal(){
   return withdrawal;
 }


 public double getMoneyOwed(){
   return moneyOwed;


 }


 public double getInterestRate(){
   return interestRate;


 }
 public int setPinNumber(int pin){
   pinNumber = pin;
   return pinNumber;
 }
 public void addInterest(){
   balance += (balance * interestRate);
 }
 public void setWithdrawal(double amount){
   balance = balance - amount;
   if (balance < 0){
       moneyOwed = (Math.abs(balance));
   }
   else{
       moneyOwed = 0;
   }
   }
 public void setDeposit(double amount2){
   balance += amount2;
 }
 public String toString(){
   String result = "";
   result += "Account name :" + fullName + "\n";
   result += "Phone Number:" + phoneNumber + "\n";
   result += "Your balance is:" + balance + "\n";
   result += "Your most recent withdrawal:" + withdrawal + "\n";
   return result;


 }


}
