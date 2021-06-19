import java.util.Scanner; // Import the Scanner class
class MyFirstName{
	public static void main(String[]args){
	Scanner x = new Scanner(System.in); // Create a Scanner object
	System.out.println("Enter name");
	String personName = x.nextLine(); // Read user input
	System.out.println("My name is:"+personName); // Output user input
	}
}