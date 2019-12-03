

import java.util.Scanner;




import java.util.Random;


public class BankAccountClient{


 public static void main(String []args){


   Boolean infinity = true;


   while (infinity){


   System.out.println("Welcome to your virtual bank!\n1.To check your account balance\n2.To make a withdrawal\n3.To make a deposit\n4.To review personal information\n5.To contact bankstaff in person\n6.To change your pin number\n7.To quite");


   Scanner input1 = new Scanner(System.in);


   int choice  = input1.nextInt();


   BankAccount myAccount = new BankAccount("Hamza" , 0304020304 , 1234 , 30000.0 , 0 , 0 , 0);


   if (choice == 1){


     System.out.println("Your account balance is " + myAccount.getBalance() + " dollars");


     continue;


   }


   else if(choice == 2){


     System.out.println("Enter the number you would like to withdrawal:");


     Scanner input2 = new Scanner(System.in);


     double withdrawalAmount = input2.nextInt();


     myAccount.setWithdrawal(withdrawalAmount);


     System.out.println("Your account balance is " + myAccount.getBalance() + " dollars and your owe the bank" + myAccount.getMoneyOwed());


     continue;


   }


   else if(choice == 3){


     System.out.println("Enter the amount you would like to deposit:");


     Scanner input3 = new Scanner(System.in);


     int depositAmount  = input3.nextInt();


     myAccount.setDeposit(depositAmount);


     System.out.println("Your account balance is " + myAccount.getBalance() + " dollars");


     continue;


   }


   else if(choice == 4){


     System.out.println("This is all your personal info: " + myAccount);


     continue;


   }


   else if(choice == 5 ){


     if(Math.random() > 0.5){


       System.out.println("Sorry, all the representitives are busy right now, please hold on...");


     }


       System.out.println("We are transfering a representitives for you right now...");


       System.out.println("Call this number" + myAccount.getPhoneNumber());


       continue;


   }


   else if (choice == 6){


     System.out.println("Your old pin number was " + myAccount.getPinNumber());


     System.out.println("Please enter your new pin number: ");


     Scanner input8 = new Scanner(System.in);


     int tempPin = input8.nextInt();


     myAccount.setPinNumber(tempPin);


     System.out.println("Your new pin number is " + myAccount.getPinNumber());


     continue;


   }


   else if (choice == 7){


     System.out.println("Program ended");


     break;


   }


   }


 }


}
