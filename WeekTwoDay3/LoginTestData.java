package WeekTwoDay3;

public class LoginTestData extends TestData {
	
	public void username() {
		System.out.println("Enter username");
			}
	public void password() {
		System.out.println("Enter Password");
	}

	public static void main(String[] args) {
		LoginTestData data = new LoginTestData();
		data.username();
		data.password();
		data.credentials();
		data.navigate();
		
		

	}

}
