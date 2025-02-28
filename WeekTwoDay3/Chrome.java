package WeekTwoDay3;

public class Chrome extends Browser {
	
	public void inCognito() {
		
		System.out.println("open Incognito window");
		
	}
	
	public void clearCache() {
		
		System.out.println("clear the cache");
	}

	public static void main(String[] args) {
		
		Chrome ch= new Chrome ();
		ch.browserVersion();
		ch.brwoserName();
		ch.inCognito();
		ch.clearCache();
		
		
		
	}

}
