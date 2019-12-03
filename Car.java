public class Car{
 private String make;
 private String model;
 private double mpg; //miles per gallon
 private double tankSize; //in gallons
 private double amtfuel; //in gallons
 public double gasConsumed;
 public String result2;
 /*


 Constructor for the car initializes the instance variables for the car


 */
 public Car(String carmake , String carmodel , double carmpg , double cartankSize){
   make = carmake;
   model = carmodel;
   mpg = carmpg;
   tankSize = cartankSize;
   amtfuel = tankSize;
 }

 public String getMake(){
   return make;
 }

 public String getModel(){
   return model;
 }

 public double getMpg(){
   return mpg;
 }

 public double getTankSize(){
   return tankSize;
 }

 public double getAmtfuel(){
   return amtfuel;
 }



 public String toString(){
   String result = "";
   result += "Make:" + make + "\n";
   result += "Model:" + model + "\n";
   result += "Miles per gallon:" + mpg + "\n";
   result += "Tank Size:" + tankSize + "\n";
   result += "Amount of fuel" + amtfuel + "\n";
   return result;


 }
 public void drive(double milesDriven){ //this is a setter
   gasConsumed = milesDriven / mpg;
   amtfuel = amtfuel - gasConsumed;
 }
 public void addFuel(double fuelPumped){
   if (amtfuel + fuelPumped > tankSize){
     System.out.println("Error you have pumped in too much gas contact help");


   }
   else
     amtfuel += fuelPumped;
   }


 public void setMake(String newMake){
   make = newMake;
  }
 }
