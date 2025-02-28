package WeekTwoDay3;

public class Browser {
	
	public void brwoserName () {
		System.out.println("URL is opened");
		System.out.println("browseris closed");
		System.out.println("Navigated back");
			}
	
	public void browserVersion () {
		System.out.println("Browser is closed");
	}
	
	public static void main(String[] args) {
		
		Browser Bname = new Browser();
		Bname.browserVersion();
		Bname.brwoserName();
		
		
		
	}

}
