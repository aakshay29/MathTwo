import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);

    double num1, num2, num3;

    System.out.print( "First integer? " );
    num1 = keyboard.nextInt();

    System.out.print( "Second integer? " );
    num2 = keyboard.nextInt();

    System.out.print( "Third integer? " );
    num3 = keyboard.nextDouble();
    System.out.println("The total is : " + (num1 + num2 + num3));
    
    //Scanner keyboard = new Scanner(System.in);

    //int num1, num2, num3;

    System.out.print( "First temperature? " );
    num1 = keyboard.nextInt();

    System.out.print( "Second temperature? " );
    num2 = keyboard.nextInt();

    System.out.println("The max value is : " + Math.max(num1, num2));
    System.out.println("The avg value is : " + (num1+num2)/2);
  }
  
}



