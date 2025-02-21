package WeekOneDayTwo;

public class Browser {
	
 public void launchBrowser() {
		
		
		System.out.println("Browser launched succesfully");
	}

	
	void loadUrl() {
		
		System.out.println("Application URL loaded successfuly");
	}
	
	public static void main(String[] args) {
		
				Browser obj =new Browser();
				obj.launchBrowser();
				obj.loadUrl();
		
}

}