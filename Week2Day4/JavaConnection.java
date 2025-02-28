package Week2Day4;

public class JavaConnection extends MySqlConnection {

	

	@Override
	public void connect() {
		System.out.println("connect to dataBase");

	}

	@Override
	public void disconnect() {
		System.out.println("dsiconect the session");

	}

	@Override
	public void executeUpdate() {
		System.out.println("execute the updated dataBase");
	}
		
		public static void main(String[] args) {

			
		JavaConnection java = new JavaConnection();
		java.connect();
		java.disconnect();
		java.executeUpdate();
		java.executeQuery();

	}
}


