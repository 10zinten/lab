
public class Validate {

	public boolean validateUserName(String userName) {
		return userName.length() >= 8 && userName.endsWith("_job");
	}

	public static void main(String[] args) {
		Validate val = new Validate();
		System.out.println(val.validateUserName(args[0]));
	}
}