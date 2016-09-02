import java.util.Scanner; 
public class Scanners {
	public static void main(String[] args) {
		System.out.println("Enter First name:");
		Scanner firstInitial = new Scanner(System.in); 
		String firstInitialt = firstInitial.next();
		System.out.println("Enter Last name:");
		Scanner lastName = new Scanner(System.in); 
		String lastNamet = lastName.next();
		System.out.println("Enter House number:");
		Scanner houseNumber = new Scanner(System.in); 
		String houseNumbert = houseNumber.next();
		System.out.println("Enter Street name:");
		Scanner strtname = new Scanner(System.in); 
		String strtnamet = strtname.next();
		System.out.println("Enter Street Type:");
		Scanner strttype = new Scanner(System.in); 
		String strttypet = strttype.next();
		System.out.println("Enter City:");
		Scanner city = new Scanner(System.in); 
		String cityt = city.next();
		System.out.print(firstInitialt + " " + lastNamet + " " + houseNumbert + " "); 
		System.out.println(strtnamet + " " + strttypet + " " + cityt);
	}
}
