import java.util.Scanner;




public class CarClient{
 public static void main(String []args){


   System.out.println("Enter the car make:");
   Scanner input1 = new Scanner(System.in);
   String inputMake = input1.next();

   System.out.println("Enter the car model:");
   Scanner input2 = new Scanner(System.in);
   String inputModel = input2.next();

   System.out.println("Enter the miles per gallon for your car:");
   Scanner input3 = new Scanner(System.in)
   double inputMpg = input3.nextDouble()

   System.out.println("Enter the tank size for your car in gallons:");
   Scanner input4 = new Scanner(System.in);
   double inputTankSize = input4.nextDouble()

   Car myCar = new Car(inputMake , inputModel , inputMpg , inputTankSize);
   System.out.println(myCar);

   System.out.println("Enter the number of miles you have recently driven: ");
   Scanner input5 = new Scanner(System.in);
   double inputMilesDriven = input4.nextDouble();
   myCar.drive(inputMilesDriven)

   System.out.println("Drove" + inputMilesDriven  + "miles: " + myCar);
   System.out.println("Enter the amount of gas you have pumped in your car: ");
   Scanner input6 = new Scanner(System.in);
   double inputFuelPumped = input6.nextDouble();

   myCar.addFuel(inputFuelPumped);

   System.out.println("Filled up " + inputFuelPumped  + " gallons of gas: " + myCar);
   System.out.println("Have you modified your car in any way recently, enter 1 if you have");
   Scanner input7 = new Scanner(System.in);
   int inputModifyChoice = input7.nextInt();
   System.out.println("What is the new make of your car now: ");
   Scanner input8 = new Scanner(System.in);
   String inputNewMake = input8.next();
   if (inputModifyChoice == 1){
     myCar.setMake(inputNewMake);
   }
   System.out.println("The new make is" + inputNewMake + myCar);
 }
}
