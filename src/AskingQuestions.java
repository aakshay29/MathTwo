import java.util.Scanner;

public class AskingQuestions 
{ 
  public static void main( String[] args ) 
  { 
    Scanner keyboard = new Scanner(System.in);

    int length, width, inches;
    double water;

    System.out.print( "Enter width of roof" );
    width = keyboard.nextInt();

    System.out.print( "Enter length of roof" );
    length = keyboard.nextInt();
    
    System.out.print( "Enter cubic inches of water" );
    inches = keyboard.nextInt();
    
    
    
    water = (((width/39.37)*(length/39.37)*inches)/231);

    System.out.println("The water flow is : " + water);
  }
  
}



