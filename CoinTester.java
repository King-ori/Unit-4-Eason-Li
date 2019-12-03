
public class CoinTester {




 public static void main(String[] args) {


   Coin myCoin = new Coin();


   Coin yourCoin = new Coin();







   System.out.println("My coin: " + myCoin);


   System.out.println("Your coin: " + yourCoin);







   Coin 10Flips = new Coin();


   int HeadCount = 0;


   final int MAX_FLIPS = 12;







   for (int i = 0; i < MAX_FLIPS; i++) {


     10Flips.flip();


     if (10Flips.isHeads())


       HeadCount++;


   }







   for (int i = 0; i < HeadCount; i++) System.out.print('H');


   for (int i = 0; i < MAX_FLIPS - HeadCount; i++) System.out.print('T');







   System.out.println("\n" + "amount of heads in " + MAX_FLIPS + " flips: " + HeadCount);


 }


}
