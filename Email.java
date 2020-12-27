/**
 * Class to represent an email account
 * @author DeclanPC
 * @version 1.0
 */
public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String company = "TechCompany";
	private int mailMax = 100;
	private String alternativeEmail;


	/**
	 * lets the first name and last name attributes to given strings
	 * prompts the user for a department and a password and sets the relevant attributes to the input
	 * @param firstName
	 * @param lastName
	 */
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = generatePassword();
		System.out.println("Email Created: " + this.firstName + "." + this.lastName + "@" + this.department + "." + this.company + ".com");
	}

	/**
	 * gets a department from the user
	 * @return department
	 */
	private String setDepartment() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your department");
		String dept = scanner.next();
		return dept;
	}

	/**
	 * Generates a random string which will be the users initial password
	 * the password will be 10 letters long and will be made up of lower case characters
	 * @return password
	 */
	private String generatePassword() {
	    int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = random.nextInt(rightLimit - leftLimit) + leftLimit;
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	    return generatedString;
	}

	/**
	 * sets the maximum capacity of the users email account
	 * @param capacity
	 */
	public void setMaxMail(int capacity) {
		this.mailMax = capacity;
	}

	/**
	 * sets an alternative email for the user
	 * @param altEmail
	 */
	public void setAlternateEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}

	/**
	 * allows the user to change password to a given string
	 * @param password
	 */
	public void changePassword(String password) {
		this.password = password;
	}

	/**
	 * returns the data of the users email
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * returns the data of the users password
	 * @return password
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * returns the data of the users alternate password
	 * @return alternateEmail
	 */
	public String getAlternateEmail() {
		return this.alternativeEmail;
	}

	/**
	 * returns the data of the users maximum email capacity
	 * @return mailMax
	 */
	public int getMaxMail() {
		return this.mailMax;
	}
}
