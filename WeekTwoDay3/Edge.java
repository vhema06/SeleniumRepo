package WeekTwoDay3;

public class Edge extends Chrome {

	public void takeSnap() {

		System.out.println("take snapshop");
	}
	public void clearCookies() {
		System.out.println("clear cookies");
	}
	public static void main(String[] args) {

		Edge ed = new Edge();
		ed.browserVersion();
		ed.brwoserName();
		ed.clearCache();
		ed.clearCookies();
		ed.inCognito();

	}

}
