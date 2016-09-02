import java.util.Scanner; 
public class Scanners {
	public static void main(String[] args) {
		System.out.println("Enter First name:");
		Scanner keyboard = new Scanner(System.in); 
		String firstInitialt = keyboard.next();
		System.out.println("Enter Last name:");
		String lastNamet = keyboard.next();
		System.out.println("Enter House number:");
		String houseNumbert = keyboard.next();
		System.out.println("Enter Street name:");
		String strtnamet = keyboard.next();
		System.out.println("Enter Street Type:");
		String strttypet = keyboard.next();
		System.out.println("Enter City:");
		String cityt = keyboard.next();
		keyboard.close();
		System.out.print(firstInitialt + " " + lastNamet + " " + houseNumbert + " "); 
		System.out.println(strtnamet + " " + strttypet + " " + cityt);
	}
}
