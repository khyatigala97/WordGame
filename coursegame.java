import java.util.Scanner;

//defining User class from User object created below. ONLY FOR THE CREATION OF THE USER TYPE.
class User
{
	//need to obtain strings???
	String username;
	String password;

	//defining the User class constructor
	public void User(String username, String password)
	{
		this.username = username;
		this.password = password;
		//this uses the *User* object defined in
	}
}

public class CourseGame 
{

	//define the user class attribute (this.) for login method
	static User user1;

	//main method:
	public static void main (String [] args)
	{
		//declare User object so that it can be returned
		// User user1;  // TODO

		//printing the initial menu
		System.out.println("Welcome to the Word Game");
		System.out.println("Login (L)");
		System.out.println("Register (R)");
		System.out.println("About (A)");
		System.out.println("Play the Game (P)");
		System.out.println("Show the Leader Board (B)");
		System.out.println("Quit (Q)");
		
		//Space
		System.out.println();
		System.out.println();

		//Getting and printing user option
		Scanner scan = new Scanner(System.in);
		char menu;

		System.out.println("Please choose an option: ");
		menu = scan.next().charAt(0);
		menu = Character.toUpperCase(menu);

		//process menu option

		

		switch (menu)
		{
			//call new methods for each case
			case 'A':
				instructions();
				break;

			case 'L':
				login();
				break;

			case 'R':
				user1 =register();
				break;

			//quit the program for anything esle selected
				default: 
				return;

		}
	}

	//quit main method.

	//registration method:
	//public static User returns the User object.
	public static User register()
	{
		//obtain user input
		Scanner scan = new Scanner (System.in);
		String username;
		String password;

		boolean invalid_password = true;

		//while loop keeps running for as long as password is invalid. 
		//invalid password is shorter than 4 characters.
		//when password is valid, programme breaks out of while loop.

		while(invalid_password)
		{
			System.out.println("Please enter a username: ");
			username = scan.nextLine();

			System.out.println("Please enter a password.");
			System.out.println("The password must be at least 4 characters long: ");
			password = scan.nextLine();

			if (password.length() < 4)
			{
				System.out.println("Invalid password. Must be at least 4 characters long.");
				invalid_password = true;
			}

			else
			{
				invalid_password = false;
			}
		}

		//username and password saved as object. 

		User user1 = new User(username, password);
		return user1; //this returns the user object to the main method.
	}

	//login method
	public static void login()
	{

		//Define username and password; scanner
		Scanner scan = new Scanner (System.in);
		String username;
		String password;

		boolean invalid_login = true;

		while (invalid_login)
		{
			//get user input to log in
			System.out.println("Please enter a username: ");
			username = scan.nextLine();

			System.out.println("Please enter a password.");
			password = scan.nextLine();

			if (this.user1.username == username && this.user1.password == password)
			{
				invalid_login = false;
				System.out.println("LOGGED IN");
			}

			else 
			{
				invalid_login = true;
			}

		}
	}

	public static void instructions ()
	{
		System.out.println("INSTRUCTIONS");
	}

}


