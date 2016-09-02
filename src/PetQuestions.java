import java.util.Scanner;
  
 public class PetQuestions
 {
     public static void main( String[] args )
    {
        String name;
        String breed;
        int age;
        Scanner keyboard = new Scanner(System.in); 
        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();
        System.out.print( "What is your pet's age? " );
        age = Integer.parseInt(keyboard.next());
        System.out.print( "What is your pet's breed? " );
        breed = keyboard.next();
        //Scanner names = new Scanner(System.in); 
		//String firstInitialt = firstInitial.next();
 
        System.out.print( "What kind of animal is " + name + "? " );
        System.out.print( "How old is " + name + "? ");
        
        System.out.println( name + " is your " + breed + " and it is " + age );
        keyboard.close();
     }
 }
