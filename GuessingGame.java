import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       int RandomNumber = rand.nextInt(100)+1;
        System.out.println(RandomNumber);
        int count=0;
      while(true) {
          System.out.println("guess the number from (1-100) : ");
          int GuessNum = scan.nextInt();
          count++;
          if(count<=3) {

              if (GuessNum == RandomNumber) {
                  System.out.println("correct! .. you won!!");
                  System.out.println("it took you " + count + " attempts ");
                  break;
              } else if (GuessNum < RandomNumber)
                  System.out.println("The number is higher..guess again");
              else
                  System.out.println("The number is lower..guess again");


          }else {
              System.out.println("your took " + count + " attempts .....game over....");
              break;
          }
      }
    }
}
