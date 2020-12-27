import java.util.Random;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String company = "TechCompany";
	private int mailMax = 100;
	private String alternativeEmail;



	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = generatePassword();
		System.out.println("Email Created: " + this.firstName + "." + this.lastName + "@" + this.department + "." + this.company + ".com");
	}

	private String setDepartment() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your department");
		String dept = scanner.next();
		return dept;
	}

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

	public void setMaxMail(int capacity) {
		this.mailMax = capacity;
	}

	public void setAlternateEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public String getPassword() {
		return this.password;
	}

	public String getAlternateEmail() {
		return this.alternativeEmail;
	}

	public int getMaxMail() {
		return this.mailMax;
	}
}
