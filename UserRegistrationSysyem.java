package patternmatching;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author SURAJ KALE
 */
public class UserRegistrationSysyem 
{
		
	/**
	 * @purpose : Check the validation of first Name
	 * @return : No return Value 
	 */ 
	public static void checkValidFirstName(String firstName) 
	{
        boolean isFirstName; //Variable declare to check validation
		String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";    
		Pattern pattern = Pattern.compile(firstNameRegex);
		
		if (firstName == null)
		{
			isFirstName = false;
		}
		
		Matcher matcher = pattern.matcher(firstName);
		isFirstName = matcher.matches();
		
		//condition to check FirstName Validation
		if (isFirstName)
			System.out.println(firstName + " is an Valid First Name\n");
		else
			System.out.println(firstName + " is an Invalid First Name");
	
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Get userInput 
		System.out.println("Enter Your FirstName");
		String firstName = sc.nextLine();
		
		//Calling Method
		checkValidFirstName(firstName);
	}

}
