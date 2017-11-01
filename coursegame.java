
import java.util.Scanner;

//class User defines the type User.
class User
{
	//get strings
	String username;
	String password;
	
	//Getter for username
	public String getusername ()
	{
		return this.username;
	}
	
	//Getter for password
	public String getpassword ()
	{
		return this.password;
	}

	//defining the User class constructor
	public User(String username, String password)
	{
		this.username = username;
		this.password = password;
		//this uses the *User* object defined in
	}
}

public class CourseGame 
{

	//declare User object user1
	static User user1;

	//main method:
	public static void main (String [] args)
	{

		//Loop main method so that all options are presented after user registers. 
		//User1 object variables created disappear quitting program.

    boolean in_game = true;
    
    //ensures that only logged in players can play game 
    boolean logged_in = false;
		
		while (in_game)
		
		{
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
          logged_in = true;
          break;

        case 'R':
          //Register method returns User object of type User
          CourseGame.user1 =register();   
          break;

        //quit the program for anything else selected
          default: 
          in_game = false;
          
          //case 'P'
          //if (logged_in == true)
          //{
          //play();
          //}
          //break;

      }
    }
	}

	//quit main method.

	//registration method:
	//public static User returns the User object.
	public static User register()
	{
		//obtain user input
		Scanner scan = new Scanner (System.in);
		String username = null;
		String password = null;

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

		User user = new User(username, password);
		return user; 
		//"return user" this returns the user object to the main method saved under user1.
	}

	//login method (for now doesn't return anything, hence is void)
	public static void login()
	{

		//Define username and password; scanner
		Scanner scan = new Scanner (System.in);
		String username;
		String password;

		//set invalid login to true; used for while loop
		boolean invalid_login = true;

		while (invalid_login)
		{
			//get user input to log in
			System.out.println("Please enter a username: ");
			username = scan.nextLine();

			System.out.println("Please enter a password.");
			password = scan.nextLine();

			//loop, compare string objects using .equals 
			//check to see if login input matches registration data
			if (CourseGame.user1.getusername().equals(username) && CourseGame.user1.getpassword().equals(password))
			{
				//login succesful; breaks out of while loop because bool=false
				invalid_login = false;
        System.out.println();
				System.out.println("LOGGED IN");
        System.out.println();
			}

			else 
			{
				//login unsuccessful; goes back to while loop because bool=true
				invalid_login = true;
        System.out.println();
				System.out.println("LOGIN FAILED");
        System.out.println();
			}

		}
	}

	public static void instructions ()
	{
		System.out.println("INSTRUCTIONS");
	}

}

